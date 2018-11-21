package DatabaseConnection;

import AppSettingsHandler.AppSettings;
import com.google.inject.Inject;
import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.util.List;
import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.Model;

/** The type Postgresql database connection. */
public class POSTGRESQLDatabaseConnection extends DataBaseConnectionAbstract {

  /** The App settings. */
  protected AppSettings appSettings;

  private String url;
  private String username;
  private String password;
  private String dbDriver;

  /**
   * Instantiates a new Postgresql database connection.
   *
   * @param appSettings the app settings
   */
  @Inject
  public POSTGRESQLDatabaseConnection(AppSettings appSettings) {
    this.appSettings = appSettings;
    this.url = (String) this.appSettings.getValue("url");
    this.username = (String) this.appSettings.getValue("username");
    this.password = (String) this.appSettings.getValue("password");
    this.dbDriver = (String) this.appSettings.getValue("dbDriver");
  }

  /** Instantiates a new Postgresql database connection. */
  public POSTGRESQLDatabaseConnection() {
    this.url =
        "jdbc:postgresql://bigbrother.c9lba99qgruo.us-east-2.rds.amazonaws.com:5432/testsPhil";
    this.username = "bigbrother";
    this.password = "bigbrother2018";
    this.dbDriver = "org.postgresql.Driver";
  }

  @Override
  public void finalize() {
    this.closeConnection();
  }

  @Override
  public void establishConnection() {
    Base.open(this.dbDriver, this.url, this.username, this.password);
  }

  @Override
  public void closeConnection() {
    Base.close();
  }

  @Override
  public String getServerObject(Class<? extends Model> model) {
    List<Model> queryReturnValue = null;
    String queryReturnJson = null;

    try {
      queryReturnValue = (List<Model>) model.getMethod("findAll").invoke(null);

      queryReturnJson = buildReturnJson(queryReturnValue);
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return queryReturnJson;
  }

  @Override
  public String getServerObject(
      Class<? extends Model> model, String queryStatement, Object... searchParameters) {
    if (searchParameters == null || queryStatement == null) {
      return this.getServerObject(model);
    }

    List<Model> queryReturnValue = null;

    String queryReturnJson = null;

    try {
      queryReturnValue =
          (List<Model>)
              model
                  .getMethod("where", queryStatement.getClass(), searchParameters.getClass())
                  .invoke(null, queryStatement, searchParameters);

      queryReturnJson = buildReturnJson(queryReturnValue);
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return queryReturnJson;
  }

  @Override
  public Object addDataObject(Class<? extends Model> model, Object... args) {
    try {

      Model objectToSave = model.newInstance();

      for (int i = 0; i < args.length; i += 2) {
		byte[] latin1 = args[i + 1].toString().getBytes("ISO-8859-1");

        objectToSave.set(args[i], new String(latin1));
      }

      objectToSave.insert();

      return objectToSave.getId();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  @Override
  public boolean addDataObjectBatch(
      Class<? extends Model> model,
      String[] objectPropertiesNames,
      Object[][] objectPropertiesValues) {

    if(model == null || objectPropertiesNames == null || objectPropertiesValues == null){
      return false;
    }

    try {

      String queryStatement = this.buildBatchInsertStatement(model, objectPropertiesNames);

      PreparedStatement batchStatement = Base.startBatch(queryStatement);

      for (Object[] personToInsert : objectPropertiesValues) {
        Base.addBatch(batchStatement, personToInsert);
      }

      Base.executeBatch(batchStatement);
      batchStatement.close();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }

    return true;
  }

  @Override
  public void removeServerObject(
      Class<? extends Model> model, String queryStatement, Object... searchParameters) {

    try {
      Model foundModel =
          (Model)
              model
                  .getMethod("findFirst", String.class, Object[].class)
                  .invoke(null, queryStatement, searchParameters);

      if (foundModel != null) {
        foundModel.delete();
      }
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private String buildBatchInsertStatement(
      Class<? extends Model> model, String[] objectPropertiesNames) {

    // A typical batch insert request
    // "insert into TABLENAME (PROPERTY!, PROPERTY2) values(?, ?, ?)"

    try {

      StringBuilder queryBuilder = new StringBuilder();
      StringBuilder valuesBuilder = new StringBuilder();

      queryBuilder.append("insert into ");

      String tableName = (String) model.getMethod("getTableName").invoke(null);
      queryBuilder.append(tableName);

      queryBuilder.append(" (");

      for (String property : objectPropertiesNames) {
        queryBuilder.append(property);
        queryBuilder.append(", ");
        valuesBuilder.append("?, ");
      }

      queryBuilder.deleteCharAt(queryBuilder.lastIndexOf(", "));
      queryBuilder.append(") values(");

      valuesBuilder.deleteCharAt(valuesBuilder.lastIndexOf(", "));
      valuesBuilder.append(")");

      queryBuilder.append(valuesBuilder.toString());

      return queryBuilder.toString();

    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }

  private String buildReturnJson(List<Model> queryReturnValue) {
    StringBuilder returnJson = new StringBuilder();

    returnJson.append("[\n");
    for (Model foundObjectFromQuery : queryReturnValue) {
      returnJson.append(foundObjectFromQuery.toJson(true));

      returnJson.append(",\n");
    }
    returnJson.deleteCharAt(returnJson.lastIndexOf(","));
    returnJson.append("]");
    return returnJson.toString();
  }
}

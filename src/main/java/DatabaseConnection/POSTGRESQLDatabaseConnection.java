package DatabaseConnection;

import AppSettingsHandler.AppSettings;
import com.google.inject.Inject;
import java.lang.reflect.InvocationTargetException;
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

  @Inject
  public POSTGRESQLDatabaseConnection(AppSettings appSettings){
    this.appSettings = appSettings;
    this.url = (String) this.appSettings.getValue("url");
    this.username = (String) this.appSettings.getValue("username");
    this.password = (String) this.appSettings.getValue("password");
    this.dbDriver = (String) this.appSettings.getValue("dbDriver");
  }

  public POSTGRESQLDatabaseConnection() {
    this.url = "jdbc:postgresql://bigbrother.c9lba99qgruo.us-east-2.rds.amazonaws.com:5432/testsPhil";
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
        objectToSave.set(args[i], args[i + 1]);
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
  public void removeServerObject(
      Class<? extends Model> model, String queryStatement, Object... searchParameters) {

    try {
      Model foundModel = (Model) model.getMethod("findFirst",
          String.class, Object[].class).invoke(null, queryStatement, searchParameters);

      if(foundModel != null){
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

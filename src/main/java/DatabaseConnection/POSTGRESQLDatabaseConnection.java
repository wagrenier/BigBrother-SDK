package DatabaseConnection;

import AppSettingsHandler.AppSettings;
import com.google.inject.Inject;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.javalite.activejdbc.Base;
import org.javalite.activejdbc.Model;

public class POSTGRESQLDatabaseConnection extends DataBaseConnectionAbstract {

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
    this.establishConnection();
  }

  @Override
  public void finalize(){
    this.closeConnection();
  }

  @Override
  public void establishConnection() {
    Base.open(this.dbDriver, this.url, this.username, this.password);
  }

  @Override
  public void closeConnection(){
    Base.close();
  }

  @Override
  public List<Model> getServerObject(Class<? extends Model> model) {
    List<Model> queryReturnValue = null;

    try {
      queryReturnValue = (List<Model>) model.getMethod("findAll").invoke(null);
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }


    return queryReturnValue;
  }

  @Override
  public List<Model> getServerObject(Class<? extends Model> model, String queryStatement, Object... searchParameters) {
    if(searchParameters == null || queryStatement == null){
      return this.getServerObject(model);
    }
    List<Model> queryReturnValue = null;

    try {
      queryReturnValue = (List<Model>) model.getMethod("where", queryStatement.getClass(), searchParameters.getClass()).invoke(null, queryStatement, searchParameters);
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }

    return queryReturnValue;
  }

  @Override
  public boolean addDataObject(Object objectToAdd, String tableName) {
    return false;
  }

  @Override
  public boolean removeServerObject(Object objectToRemove, String tableName) {
    return false;
  }

}

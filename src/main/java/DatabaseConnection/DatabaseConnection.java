package DatabaseConnection;

import AppSettingsHandler.AppSettings;
import com.google.inject.Inject;

public class DatabaseConnection implements IDatabaseConnection {

  protected AppSettings appSettings;

  @Inject
  public DatabaseConnection(AppSettings appSettings){
    this.appSettings = appSettings;
  }

  @Override
  public boolean establishConnection() {
    return false;
  }

  @Override
  public boolean testConnection() {
    return false;
  }

  @Override
  public Object getServerObject() {
    return null;
  }

  @Override
  public boolean addDataObject(Object objectToAdd) {
    return false;
  }

  @Override
  public boolean removeServerObject(Object objectToRemove) {
    return false;
  }
}

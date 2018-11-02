package DatabaseConnection;

import AppSettingsHandler.AppSettingsFactory;
import com.google.inject.Injector;

public class ConnectionFactory {
  private static POSTGRESQLDatabaseConnection databaseConnection;
  private static Injector injector = AppSettingsFactory.getInjector();

  private ConnectionFactory(){

  }

  static {
    databaseConnection = injector.getInstance(POSTGRESQLDatabaseConnection.class);
  }

  public static POSTGRESQLDatabaseConnection getDatabaseConnection(){
    return databaseConnection;
  }
}

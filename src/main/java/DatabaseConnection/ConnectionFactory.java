package DatabaseConnection;

import AppSettingsHandler.AppSettingsFactory;
import com.google.inject.Injector;

public class ConnectionFactory {
  private static Injector injector = AppSettingsFactory.getInjector();

  private ConnectionFactory(){

  }

  public static POSTGRESQLDatabaseConnection getDatabaseConnection(){
    return injector.getInstance(POSTGRESQLDatabaseConnection.class);
  }
}

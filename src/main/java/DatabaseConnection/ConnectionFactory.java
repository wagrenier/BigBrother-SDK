package DatabaseConnection;

import AppSettingsHandler.AppSettingsFactory;
import com.google.inject.Injector;

/** The type Connection factory. */
public class ConnectionFactory {
  private static Injector injector = AppSettingsFactory.getInjector();

  private ConnectionFactory() {}

  /**
   * Gets database connection.
   *
   * @return the database connection
   */
  public static POSTGRESQLDatabaseConnection getDatabaseConnection() {
    return injector.getInstance(POSTGRESQLDatabaseConnection.class);
  }
}

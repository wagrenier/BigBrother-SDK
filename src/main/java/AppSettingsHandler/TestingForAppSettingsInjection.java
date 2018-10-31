package AppSettingsHandler;

import DatabaseConnection.POSTGRESQLDatabaseConnection;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestingForAppSettingsInjection {

  public static void main(String[] args){
    Injector injector = Guice.createInjector(new AppSettingsBindings());
    POSTGRESQLDatabaseConnection db = injector.getInstance(POSTGRESQLDatabaseConnection.class);
    System.out.println(db.getServerObject("*", "utilisateur"));
  }

}

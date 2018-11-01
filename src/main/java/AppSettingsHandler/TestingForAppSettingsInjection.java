package AppSettingsHandler;

import DatabaseConnection.ConnectionFactory;
import DatabaseConnection.POSTGRESQLDatabaseConnection;
import DatabaseConnection.Utilisateur;
import java.util.List;
import org.javalite.activejdbc.Model;

public class TestingForAppSettingsInjection {

  public static void main(String[] args){
    POSTGRESQLDatabaseConnection db = ConnectionFactory.getDatabaseConnection();
    List<Model> a = db
        .getServerObject(Utilisateur.class, "cip  = ?", "grap2701");

    for(Model b : a){
      System.out.println(b.toJson(true));
    }
  }
}

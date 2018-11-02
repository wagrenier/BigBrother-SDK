package AppSettingsHandler;

import DAO.Utilisateur;
import DatabaseConnection.ConnectionFactory;
import DAO.Groupe;
import DatabaseConnection.POSTGRESQLDatabaseConnection;

public class TestingForAppSettingsInjection {

  public static void main(String[] args){
    POSTGRESQLDatabaseConnection db = ConnectionFactory.getDatabaseConnection();

    //db.addDataObject(Groupe.class,"id", 123456);

    //db.addDataObject(Utilisateur.class, "cip", "wil123", "nom", "BOB", "prenom", "Robert");

    /*
    List<Model> a = db
        .getServerObject(Utilisateur.class, "cip  = ?", "grap2701");

    for(Model b : a){
      System.out.println(b.toJson(true));
    }*/
  }
}

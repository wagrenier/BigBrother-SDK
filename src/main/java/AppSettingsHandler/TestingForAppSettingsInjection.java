package AppSettingsHandler;

import DAO.DemandeChangement;
import DAO.Utilisateur;
import DatabaseConnection.ConnectionFactory;
import DAO.Groupe;
import DatabaseConnection.POSTGRESQLDatabaseConnection;

public class TestingForAppSettingsInjection {

  public static void main(String[] args){
    POSTGRESQLDatabaseConnection db = ConnectionFactory.getDatabaseConnection();
    Object groupeId = db.addDataObject(Groupe.class);

    System.out.println(groupeId);

    Object cip = db.addDataObject(Utilisateur.class, "cip", "wil123", "nom", "William", "prenom", "Adam");

    System.out.println(cip);

    db.addDataObject(DemandeChangement.class, "groupe_id", groupeId, "cip", cip);

    /*
    List<Model> a = db
        .getServerObject(Utilisateur.class, "cip  = ?", "grap2701");

    for(Model b : a){
      System.out.println(b.toJson(true));
    }
    */
  }
}

package DAO;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

@Table("utilisateur")
@IdName("cip")
public class Utilisateur extends Model{
  static {
    validatePresenceOf("cip", "nom", "prenom");
  }

  public Utilisateur() {}

  public Utilisateur(String cip, String nom, String prenom) {
    set("cip", cip, "nom", nom, "prenom", prenom);
  }

  public String getCIP(){
    return getString("cip");
  }
}

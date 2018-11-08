package DAO;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

/** The type Utilisateur. */
@Table("utilisateur")
@IdName("cip")
public class Utilisateur extends Model {
  static {
    validatePresenceOf("cip", "nom", "prenom");
  }

  /** Instantiates a new Utilisateur. */
  public Utilisateur() {}

  /**
   * Instantiates a new Utilisateur.
   *
   * @param cip the cip
   * @param nom the nom
   * @param prenom the prenom
   */
  public Utilisateur(String cip, String nom, String prenom) {
    set("cip", cip, "nom", nom, "prenom", prenom);
  }

  /**
   * Gets cip.
   *
   * @return the cip
   */
  public String getCIP() {
    return getString("cip");
  }
}

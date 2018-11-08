package DAO;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

/** The type Groupe. */
@Table("groupe")
@IdName("id")
public class Groupe extends Model {
  static {
    validatePresenceOf("id");
  }

  /** Instantiates a new Groupe. */
  public Groupe() {}

  /**
   * Instantiates a new Groupe.
   *
   * @param id the id
   */
  public Groupe(int id) {
    set("id", id);
  }

  /**
   * Gets id.
   *
   * @return the id
   */
  public String getID() {
    return getString("id");
  }
}

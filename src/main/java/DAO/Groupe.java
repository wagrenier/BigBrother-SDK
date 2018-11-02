package DAO;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

@Table("groupe")
@IdName("id")
public class Groupe extends Model{
  static {
    validatePresenceOf("id");
  }

  public Groupe() {}

  public Groupe(int id) {
    set("id", id);
  }

  public String getID(){
    return getString("id");
  }
}

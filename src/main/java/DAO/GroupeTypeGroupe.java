package DAO;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.CompositePK;
import org.javalite.activejdbc.annotations.Table;

@Table("groupe_type_groupe")
@CompositePK({"groupe_id", "type_id"})
public class GroupeTypeGroupe extends Model {

}

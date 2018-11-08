package DAO;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.CompositePK;
import org.javalite.activejdbc.annotations.Table;

/** The type Demande changement. */
@Table("groupes")
@CompositePK({"groupe_id", "cip"})
public class Groupes extends Model {}

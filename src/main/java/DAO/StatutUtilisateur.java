package DAO;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.CompositePK;
import org.javalite.activejdbc.annotations.Table;

@Table("statut_utilisateur")
@CompositePK({"statut_id", "cip"})
public class StatutUtilisateur extends Model {

}

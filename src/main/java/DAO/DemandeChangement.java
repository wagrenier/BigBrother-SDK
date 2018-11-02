package DAO;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.CompositePK;
import org.javalite.activejdbc.annotations.Table;

@Table("demande_changement")
@CompositePK({ "groupe_id", "cip"})
public class DemandeChangement extends Model {

}

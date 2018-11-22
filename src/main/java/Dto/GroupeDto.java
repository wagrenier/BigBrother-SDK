package Dto;

import java.util.List;

/** The type Groupe dto. */
public class GroupeDto {
  /** The Ap id. */
  public String ap_id;
  /** The App. */
  public String app;
  /** The Credit annuaire. */
  public int credit_annuaire;
  /** The Etudiants. */
  public List<EtudiantDto> etudiants;
  /** The Groupe id. */
  public int groupe_id;
  /** The Prefixe. */
  public String prefixe;
  /** The Trimestre id. */
  public String trimestre_id;
  /** The Create_By CIP. */
  public String created_by;
  /** The Max_Par_Group **/
  public int max_par_group;

  /**
   * Instantiates a new Groupe dto.
   *
   * @param ap_id the ap id
   * @param app the app
   * @param credit_annuaire the credit annuaire
   * @param etudiants the etudiants
   * @param groupe_id the groupe id
   * @param prefixe the prefixe
   * @param trimestre_id the trimestre id
   * @param created_by the cip
   * @param max_par_group the cip
   */
  // Constructeur
  public GroupeDto(
      String ap_id,
      String app,
      int credit_annuaire,
      List<EtudiantDto> etudiants,
      int groupe_id,
      String prefixe,
      String trimestre_id,
      String created_by,
      int max_par_group) {
    this.ap_id = ap_id;
    this.app = app;
    this.credit_annuaire = credit_annuaire;
    this.etudiants = etudiants;
    this.groupe_id = groupe_id;
    this.prefixe = prefixe;
    this.trimestre_id = trimestre_id;
    this.created_by = created_by;
    this.max_par_group = max_par_group;
  }

  /** Instantiates a new Groupe dto. */
  public GroupeDto() {}
}

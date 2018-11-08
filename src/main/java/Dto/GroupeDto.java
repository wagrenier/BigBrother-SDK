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
   */
  // Constructeur
  public GroupeDto(
      String ap_id,
      String app,
      int credit_annuaire,
      List<EtudiantDto> etudiants,
      int groupe_id,
      String prefixe,
      String trimestre_id) {
    this.ap_id = ap_id;
    this.app = app;
    this.credit_annuaire = credit_annuaire;
    this.etudiants = etudiants;
    this.groupe_id = groupe_id;
    this.prefixe = prefixe;
    this.trimestre_id = trimestre_id;
  }

  /** Instantiates a new Groupe dto. */
  public GroupeDto() {}
}

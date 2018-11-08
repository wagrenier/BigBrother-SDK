package Dto;

/** The type Etudiant dto. */
public class EtudiantDto {
  /** The Cip etudiant. */
  public String cip_etudiant;

  /** The Cote r. */
  public int cote_r;

  /** The Nom. */
  public String nom;

  /** The Prenom. */
  public String prenom;

  /** The Profil id. */
  public String profil_id;

  /** The Programme. */
  public String programme;

  /** The Trimestre id. */
  public String trimestre_id;

  /** The Unit id. */
  public String unit_id;

  /**
   * Instantiates a new Etudiant dto.
   *
   * @param cip_etudiant the cip etudiant
   * @param cote_r the cote r
   * @param nom the nom
   * @param prenom the prenom
   * @param profil_id the profil id
   * @param programme the programme
   * @param trimestre_id the trimestre id
   * @param unit_id the unit id
   */
  // Constructeur
  public EtudiantDto(
      String cip_etudiant,
      int cote_r,
      String nom,
      String prenom,
      String profil_id,
      String programme,
      String trimestre_id,
      String unit_id) {
    this.cip_etudiant = cip_etudiant;
    this.cote_r = cote_r;
    this.nom = nom;
    this.prenom = prenom;
    this.profil_id = profil_id;
    this.programme = programme;
    this.trimestre_id = trimestre_id;
    this.unit_id = unit_id;
  }

  /** Instantiates a new Etudiant dto. */
  public EtudiantDto() {}

  /**
   * Gets cip etudiant.
   *
   * @return the cip etudiant
   */
  public String getCip_etudiant() {
    return this.cip_etudiant;
  }

  /**
   * Gets cote r.
   *
   * @return the cote r
   */
  public int getCote_r() {
    return this.cote_r;
  }

  /**
   * Gets nom.
   *
   * @return the nom
   */
  public String getNom() {
    return this.nom;
  }

  /**
   * Gets prenom.
   *
   * @return the prenom
   */
  public String getPrenom() {
    return this.prenom;
  }

  /**
   * Gets profil id.
   *
   * @return the profil id
   */
  public String getProfil_id() {
    return this.profil_id;
  }

  /**
   * Gets programme.
   *
   * @return the programme
   */
  public String getProgramme() {
    return this.programme;
  }

  /**
   * Gets trimestre id.
   *
   * @return the trimestre id
   */
  public String getTrimestre_id() {
    return this.trimestre_id;
  }

  /**
   * Gets unit id.
   *
   * @return the unit id
   */
  public String getUnit_id() {
    return this.unit_id;
  }
}

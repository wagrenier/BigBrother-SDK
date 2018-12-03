package Dto;

/** The type List handler request class dto. */
public class ListHandlerRequestClassDto {
  /** The Sort parameter. */
  public String sortParameter;
  /** The Ap id. */
  public String ap_id;
  /** The App. */
  public String app;
  /** The Credit annuaire. */
  public int credit_annuaire;
  /** The Trimestre id. */
  public String trimestre_id;
  /** The Max par groupe. */
  public int maxParGroupe;
  /** The Requested number of group. */
  public int RequestedNumberOfGroup;
  /** The Prefixe. */
  public String prefixe;
  /** The Object. */
  public EtudiantDto object[];
  /** The Group. */
  public EtudiantDto group[][];

  /**
   * Instantiates a new List handler request class dto.
   *
   * @param maxParGroupe the max par groupe
   * @param sortParameter the sort parameter
   * @param prefixe the prefixe
   * @param object the object
   * @param RequestedNumberOfGroup the requested number of group
   */
  public ListHandlerRequestClassDto(
      int maxParGroupe, String sortParameter, String prefixe, EtudiantDto object[], int RequestedNumberOfGroup) {
    this.maxParGroupe = maxParGroupe;
    this.sortParameter = sortParameter;
    this.prefixe = prefixe;
    this.object = object;
    this.RequestedNumberOfGroup = RequestedNumberOfGroup;
  }

  /** Instantiates a new List handler request class dto. */
  public ListHandlerRequestClassDto() {}
}

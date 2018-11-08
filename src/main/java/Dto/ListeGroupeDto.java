package Dto;

import java.util.List;

/** The type Liste groupe dto. */
public class ListeGroupeDto {
  /** The Groupes. */
  public List<GroupeDto> groupes;
  /** The Liste id. */
  public int liste_id;
  /** The Prefixe. */
  public String prefixe;

  /**
   * Instantiates a new Liste groupe dto.
   *
   * @param groupes the groupes
   * @param liste_id the liste id
   * @param prefixe the prefixe
   */
  // Constructeur
  public ListeGroupeDto(List<GroupeDto> groupes, int liste_id, String prefixe) {
    this.groupes = groupes;
    this.liste_id = liste_id;
    this.prefixe = prefixe;
  }

  /** Instantiates a new Liste groupe dto. */
  public ListeGroupeDto() {}
}

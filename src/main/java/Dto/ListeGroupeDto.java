package Dto;
import java.util.List;

public class ListeGroupeDto {
    public List<GroupeDto> groupes;
    public int liste_id;
    public String prefixe;

    // Constructeur
    public ListeGroupeDto(List<GroupeDto> groupes, int liste_id, String prefixe) {
        this.groupes = groupes;
        this.liste_id = liste_id;
        this.prefixe = prefixe;
    }

    public ListeGroupeDto(){ }
}

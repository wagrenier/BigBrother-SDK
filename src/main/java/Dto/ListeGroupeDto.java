package Dto;
import java.util.List;

public class ListeGroupeDto {
    public String liste_id;
    public List<GroupeDto> groupes;
    public String prefixe;

    // Constructeur
    public ListeGroupeDto(List<GroupeDto> groupes, String prefixe) {
        this.groupes = groupes;
        this.prefixe = prefixe;
    }
}

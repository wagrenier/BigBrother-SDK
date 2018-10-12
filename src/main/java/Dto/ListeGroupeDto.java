package Dto;
import java.util.List;

public class ListeGroupeDto {
    private String liste_id;
    private List<GroupeDto> groupes;
    private String prefixe;

    // Constructeur
    public ListeGroupeDto(List<GroupeDto> groupes, String prefixe) {
        this.groupes = groupes;
        this.prefixe = prefixe;
    }

    // liste_id
    public String getListe_id() {
        return this.liste_id;
    }

    public void setListe_id(String nouveauListe_id) {
        this.liste_id = nouveauListe_id;
    }

    // groupes
    public List<GroupeDto> getGroupes() {
        return this.groupes;
    }

    public void setGroupes(List<GroupeDto> groupes) {
        this.groupes = groupes;
    }

    public void addGroupe(GroupeDto nouveauGroupe) {
        this.groupes.add(nouveauGroupe);
    }

    public void removeGroupe(GroupeDto groupe) {
        this.groupes.remove(groupe);
    }

    public void removeGroupes(List<GroupeDto> groupes) {
        for (GroupeDto groupe : groupes){
            this.groupes.remove(groupe);
        }
    }

    // prefixe
    public String getPrefixe() {
        return this.prefixe;
    }

    public void setPrefixe(String nouveauPrefixe) {
        this.prefixe = nouveauPrefixe;
    }
}
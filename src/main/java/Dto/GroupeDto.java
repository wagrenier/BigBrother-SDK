package Dto;
import java.util.List;

public class GroupeDto {
    public String ap_id;
    public String app;
    public int credit_annuaire;
    public List<EtudiantDto> etudiants;
    public int groupe_id;
    public String prefixe;
    public String trimestre_id;

    // Constructeur
    public GroupeDto(String ap_id, String app, int credit_annuaire, List<EtudiantDto> etudiants, int groupe_id,
                        String prefixe, String trimestre_id) {
        this.ap_id = ap_id;
        this.app = app;
        this.credit_annuaire = credit_annuaire;
        this.etudiants = etudiants;
        this.groupe_id = groupe_id;
        this.prefixe = prefixe;
        this.trimestre_id = trimestre_id;

    }
}

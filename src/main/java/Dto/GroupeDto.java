package Dto;
import java.util.List;

public class GroupeDto {
    private String ap_id;
    private String app;
    private int credit_annuaire;
    private List<EtudiantDto> etudiants;
    private int groupe_id;
    private String prefixe;
    private String trimestre_id;

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
    // app
    public String getApp() {
        return this.app;
    }

    public void setApp(String nouveauApp) {
        this.app = nouveauApp;
    }

    // ap_id
    public String getAp_id() {
        return this.ap_id;
    }

    public void setAp_id(String nouveauAp_id) {
        this.ap_id = nouveauAp_id;
    }

    // credit_annuaire
    public int getCredit_annuaire() {
        return this.credit_annuaire;
    }

    public void setCredit_annuaire(int nouveauCredit_annuaire) {
        this.credit_annuaire = nouveauCredit_annuaire;
    }

    // etudiants
    public List<EtudiantDto> getEtudiants() {
        return this.etudiants;
    }

    public void addEtudiant(EtudiantDto nouvelEtudiant) {
        this.etudiants.add(nouvelEtudiant);
    }
    
    public void setEtudiants(List<EtudiantDto> nouveauxEtudiants) {
        this.etudiants = nouveauxEtudiants;
    }

    public void removeEtudiant(EtudiantDto etudiant) {
        this.etudiants.remove(etudiant);
    }

    public void removeEtudiants(List<EtudiantDto> etudiants) {
        for (EtudiantDto etudiant : etudiants){
            this.etudiants.remove(etudiant);
        }
    }

    // groupe_id
    public int getGroupe_id() {
        return this.groupe_id;
    }

    public void setGroupe_id(int nouveauGroupe_id) {
        this.groupe_id = nouveauGroupe_id;
    }

    // prefixe
    public String getPrefixe() {
        return this.prefixe;
    }
    
    public void setPrefixe(String nouveauPrefixe) {
        this.prefixe = nouveauPrefixe;
    }

    // trimestre_id
    public String getTrimestre_id() {
        return this.trimestre_id;
    }

    public void setTrimestre_id(String nouveauTrimestre_id) {
        this.trimestre_id = nouveauTrimestre_id;
    }
}
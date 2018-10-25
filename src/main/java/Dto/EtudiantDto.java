package Dto;

public class EtudiantDto {
    private String cip_etudiant;
    private int cote_r;
    private String nom;
    private String prenom;
    private String profil_id;
    private String programme;
    private String trimestre_id;
    private String unit_id;

    // Constructeur
    public EtudiantDto(String cip_etudiant, int cote_r, String nom, String prenom,
                        String profil_id, String programme, String trimestre_id, String unit_id) {
        this.cip_etudiant = cip_etudiant;
        this.cote_r = cote_r;
        this.nom = nom;
        this.prenom = prenom;
        this.profil_id = profil_id;
        this.programme = programme;
        this.trimestre_id = trimestre_id;
        this.unit_id = unit_id;
    }

    // cip_etudiant
    public String getCip() {
        return this.cip_etudiant;
    }
    
    public void setCip(String nouveauCIP) {
        this.cip_etudiant = nouveauCIP;
    }

    // cote_r
    public int getCote_r() {
        return this.cote_r;
    }

    public void setCote_r(int nouvelleCote_r) {
        this.cote_r = nouvelleCote_r;
    }

    // nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    // prenom
    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }

    // profil_id
    public String getProfil_id() {
        return this.profil_id;
    }
    
    public void setProfil_id(String nouveauProfil_id) {
        this.profil_id = nouveauProfil_id;
    }

    // programme
    public String getProgramme() {
        return this.programme;
    }

    public void setProgramme(String nouveauProgramme) {
        this.programme = nouveauProgramme;
    }

    // trimestre_id
    public String getTrimestre_id() {
        return this.trimestre_id;
    }

    public void setTrimestre_id(String nouveauTrimestre_id) {
        this.trimestre_id = nouveauTrimestre_id;
    }

    // unit_id
    public String geUnit_id() {
        return this.unit_id;
    }

    public void setUnit_id(String nouveauUnit_id) {
        this.unit_id = nouveauUnit_id;
    }
}
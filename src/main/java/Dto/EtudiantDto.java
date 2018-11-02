package Dto;

public class EtudiantDto {
    public String cip_etudiant;
    public int cote_r;
    public String nom;
    public String prenom;
    public String profil_id;
    public String programme;
    public String trimestre_id;
    public String unit_id;

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
    public EtudiantDto(){ }

    public String getCip_etudiant(){
        return this.cip_etudiant;
    }

    public int getCote_r(){
        return this.cote_r;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public String getProfil_id(){
        return this.profil_id;
    }

    public String getProgramme(){
        return this.programme;
    }
    
    public String getTrimestre_id(){
        return this.trimestre_id;
    }

    public String getUnit_id(){
        return this.unit_id;
    }
}

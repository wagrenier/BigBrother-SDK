package Dto;

public class EtudiantDto {
    public String CipEtudiant;
    public int cote_r;
    public String nom;
    public String prenom;
    public String profil_id;
    public String programme;
    public String trimestre_id;
    public String unit_id;

    // Constructeur
    public EtudiantDto(String CipEtudiant, int cote_r, String nom, String prenom,
                        String profil_id, String programme, String trimestre_id, String unit_id) {
        this.CipEtudiant = CipEtudiant;
        this.cote_r = cote_r;
        this.nom = nom;
        this.prenom = prenom;
        this.profil_id = profil_id;
        this.programme = programme;
        this.trimestre_id = trimestre_id;
        this.unit_id = unit_id;
    }
    public EtudiantDto(){ }

    public String getCipEtudiant(){
        return this.CipEtudiant;
    }
}

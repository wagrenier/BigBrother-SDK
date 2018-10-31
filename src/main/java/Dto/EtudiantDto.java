package Dto;

public class EtudiantDto {
    public String cip_etudiant;
    public int cote_r;
    public String nom;
    public String prenom;
    public int profil_id;
    public String programme;
    public String trimestre_id;
    public String unit_id;

    // Constructeur
    public EtudiantDto(String cip_etudiant, int cote_r, String nom, String prenom,
                        int profil_id, String programme, String trimestre_id, String unit_id) {
        this.cip_etudiant = cip_etudiant;
        this.cote_r = cote_r;
        this.nom = nom;
        this.prenom = prenom;
        this.profil_id = profil_id;
        this.programme = programme;
        this.trimestre_id = trimestre_id;
        this.unit_id = unit_id;
    }
}

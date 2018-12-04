package Dto;

public class GroupListingInfo {
  public String activite = "";
  public String trimestre_id = "";
  public int nombreGroupe = 1;
  public int max_par_groupe = 0;
  public String prefixe = "";
  public int groupId;
  public String created_by = "";
  protected GroupListingInfo(){

  }

  public GroupListingInfo(String activite, String trimestre_id, int nombreGroupe, int max_par_groupe, int groupId, String prefixe, String created_by) {
    this.activite = activite;
    this.trimestre_id = trimestre_id;
    this.nombreGroupe = nombreGroupe;
    this.max_par_groupe = max_par_groupe;
    this.groupId = groupId;
	this.prefixe = prefixe;
	this.created_by = created_by;
  }
}

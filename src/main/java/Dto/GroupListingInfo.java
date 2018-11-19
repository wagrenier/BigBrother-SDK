package Dto;

public class GroupListingInfo {
  public String activite = "";
  public String trimestre_id = "";
  public int nombreGroupe = 0;
  public int nombreLimit = 0;
  public int groupId;

  protected GroupListingInfo(){

  }

  public GroupListingInfo(String activite, String trimestre_id, int nombreGroupe, int nombreLimit, int groupId) {
    this.activite = activite;
    this.trimestre_id = trimestre_id;
    this.nombreGroupe = nombreGroupe;
    this.nombreLimit = nombreLimit;
    this.groupId = groupId;
  }
}

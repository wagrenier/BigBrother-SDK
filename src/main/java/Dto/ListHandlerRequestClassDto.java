package Dto;

import Dto.EtudiantDto;

public class ListHandlerRequestClassDto {
    public String sortParameter;
    public String ap_id;
    public String app;
    public int credit_annuaire;
    public String trimestre_id;
    public int maxParGroupe;
    public int RequestedNumberOfGroup;
    public String prefixe;
    public EtudiantDto object[];
    public EtudiantDto group[][];

    public ListHandlerRequestClassDto(int maxParGroupe, String prefixe, EtudiantDto object[], int RequestedNumberOfGroup) {
        this.maxParGroupe = maxParGroupe;
        this.prefixe = prefixe;
        this.object = object;
        this.RequestedNumberOfGroup = RequestedNumberOfGroup;
    }

    public ListHandlerRequestClassDto(){}
}


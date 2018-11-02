package Dto;

public class ListHandlerRequestClassDto {
    public int maxParGroupe;
    public int RequestedNumberOfGroup;
    public String prefix;
    public String object[];
    public String group[][];

    public ListHandlerRequestClassDto(int maxParGroupe, String prefix, String object[], int RequestedNumberOfGroup) {
        this.maxParGroupe = maxParGroupe;
        this.prefix = prefix;
        this.object = object;
        this.RequestedNumberOfGroup = RequestedNumberOfGroup;
    }

    public ListHandlerRequestClassDto(){}
}


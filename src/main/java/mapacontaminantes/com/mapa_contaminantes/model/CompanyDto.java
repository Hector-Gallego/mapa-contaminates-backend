package mapacontaminantes.com.mapa_contaminantes.model;

import java.util.ArrayList;
import java.util.List;

public class CompanyDto {

    private Long id;
    private String name;
    private String longitude; 
    private String latitude;
    private String adress;
    private List<String> economyActivities = new ArrayList<>();

    
    
    public CompanyDto() {
    }
    public CompanyDto(Long id, String name, String longitude, String latitude, String adress,
            List<String> economyActivities) {
        this.id = id;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.adress = adress;
        this.economyActivities = economyActivities;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLongitude() {
        return longitude;
    }
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getLatitude() {
        return latitude;
    }
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public List<String> getEconomyActivities() {
        return economyActivities;
    }
    public void setEconomyActivities(List<String> economyActivities) {
        this.economyActivities = economyActivities;
    }


    

    
}

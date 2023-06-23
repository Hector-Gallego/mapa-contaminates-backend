package mapacontaminates.com.mapa_contaminates.model;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import mapacontaminates.com.mapa_contaminates.model.ecomomy_activity_ciiu.EconomyActivityCIIU;

@Entity
@Table(name="company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String longitude;
    private String latitude;
    private String adress; 

    
    @ManyToMany
    @JoinTable(name = "company_as_economy_activity_ciiu",
                joinColumns = @JoinColumn(name = "company_id"),
                inverseJoinColumns = @JoinColumn(name = "economy_activity_ciiu_id"),
                uniqueConstraints = @UniqueConstraint(columnNames = {"company_id","economy_activity_ciiu_id"}))
    private List<EconomyActivityCIIU> economyActivityCIIUs = new ArrayList<>();

    public Company() {
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


    public List<EconomyActivityCIIU> getEconomyActivityCIIUs() {
        return economyActivityCIIUs;
    }


    public void setEconomyActivityCIIUs(List<EconomyActivityCIIU> economicActivityCIIUs) {
        this.economyActivityCIIUs = economicActivityCIIUs;
    }

    

  

    
    
}

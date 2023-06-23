package mapacontaminates.com.mapa_contaminates.model.central_product_clasification_cpc;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import mapacontaminates.com.mapa_contaminates.model.ecomomy_activity_ciiu.EconomyActivityCIIU;

@Entity
@Table(name = "central_product_clasification_cpc")
public class CentralProductClasificationCPC  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    @Column(columnDefinition = "TEXT")
    private String name;


    @ManyToMany(mappedBy = "centralProductClasificationCPCs")
     @JsonProperty("economicActivityCIIUs")
    List<EconomyActivityCIIU> EconomicActivityCIIUs = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "fk_class_cpc_id")
    private ClassCPC classCPC;

    public CentralProductClasificationCPC() {
    }

    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getCode() {
        return code;
    }



    public void setCode(String code) {
        this.code = code;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    
    public List<EconomyActivityCIIU> getEconomicActivityCIIUs() {
        return EconomicActivityCIIUs;
    }
     



    public void setEconomicActivityCIIUs(List<EconomyActivityCIIU> economicActivityCIIUs) {
        EconomicActivityCIIUs = economicActivityCIIUs;
    }
    
     
}

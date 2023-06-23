package mapacontaminates.com.mapa_contaminates.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import mapacontaminates.com.mapa_contaminates.model.ecomomy_activity_ciiu.EconomyActivityCIIU;

@Entity
@Table(name = "residual_current")
public class ResidualCurrent {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    @Column(columnDefinition = "TEXT")
    private String name;
    
    @ManyToMany(mappedBy = "residualCurrents")
    @JsonIgnore
    private List<EconomyActivityCIIU> economicActivityCIIUs = new ArrayList<>();

    @OneToMany(mappedBy = "residualCurrent")
    private List<ResidualSubCurrent> residualSubCurrents = new ArrayList<>();

    public List<ResidualSubCurrent> getResidualSubCurrents() {
        return residualSubCurrents;
    }

    public void setResidualSubCurrents(List<ResidualSubCurrent> residualSubCurrents) {
        this.residualSubCurrents = residualSubCurrents;
    }

    public ResidualCurrent() {
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
        return economicActivityCIIUs;
    }

    public void setEconomicActivityCIIUs(List<EconomyActivityCIIU> economicActivityCIIUs) {
        this.economicActivityCIIUs = economicActivityCIIUs;
    }

   
    
}

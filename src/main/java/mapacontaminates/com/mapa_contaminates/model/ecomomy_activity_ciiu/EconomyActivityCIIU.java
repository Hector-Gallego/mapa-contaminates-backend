package mapacontaminates.com.mapa_contaminates.model.ecomomy_activity_ciiu;



import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import mapacontaminates.com.mapa_contaminates.model.Company;
import mapacontaminates.com.mapa_contaminates.model.ResidualCurrent;
import mapacontaminates.com.mapa_contaminates.model.central_product_clasification_cpc.CentralProductClasificationCPC;

@Entity
@Table(name = "economy_activity_ciiu")
public class EconomyActivityCIIU{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    @Column(columnDefinition = "TEXT")
    private String name;
    
    

    @ManyToMany
    @JoinTable(name = "economy_activity_ciiu_as_residual_currents",
                joinColumns = @JoinColumn(name="economy_activity_ciiu_id"),
                inverseJoinColumns = @JoinColumn(name="residual_current_id"),
                uniqueConstraints = @UniqueConstraint(columnNames = {"economy_activity_ciiu_id","residual_current_id"}))
    private List<ResidualCurrent> residualCurrents = new ArrayList<>();

    @ManyToMany
    @JsonIgnoreProperties("economicActivityCIIUs")
    @JoinTable(name = "economy_activity_ciiu_as_product_central_clasification",
                joinColumns = @JoinColumn(name="economy_activity_ciiu_id"),
                inverseJoinColumns = @JoinColumn(name="product_central_clasification_id"),
                uniqueConstraints = @UniqueConstraint(columnNames = {"economy_activity_ciiu_id","product_central_clasification_id"}))
    private List<CentralProductClasificationCPC> centralProductClasificationCPCs = new ArrayList<>();
   

    @ManyToMany(mappedBy = "economyActivityCIIUs")
    @JsonIgnore
    private List<Company> companys = new ArrayList<>();


    @ManyToOne
    @JoinColumn(name = "fk_group_ciiu_id")
    private GroupCIIU groupCIIU;

    

    public EconomyActivityCIIU() {
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


    public List<CentralProductClasificationCPC> getCentralProductClasificationCPCs() {
        return centralProductClasificationCPCs;
    }


    public void setCentralProductClasificationCPCs(List<CentralProductClasificationCPC> centralProductClasificationCPCs) {
        this.centralProductClasificationCPCs = centralProductClasificationCPCs;
    }


    public List<Company> getCompanys() {
        return companys;
    }


    public void setCompanys(List<Company> companys) {
        this.companys = companys;
    }





    public List<ResidualCurrent> getResidualCurrents() {
        return residualCurrents;
    }





    public void setResidualCurrents(List<ResidualCurrent> residualCurrents) {
        this.residualCurrents = residualCurrents;
    }





    public GroupCIIU getGroupCIIU() {
        return groupCIIU;
    }





    public void setGroupCIIU(GroupCIIU groupCIIU) {
        this.groupCIIU = groupCIIU;
    }

    

}

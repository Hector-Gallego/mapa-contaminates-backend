package mapacontaminates.com.mapa_contaminates.model.central_product_clasification_cpc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "group_cpc")
public class GroupCPC {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    @Column(columnDefinition = "TEXT")
    private String name; 

    @ManyToOne
    @JoinColumn(name = "fk_division_cpc_id")
    private DivisionCPC divisionCPC;

    
    
    public GroupCPC() {
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

    public DivisionCPC getDivisionCPC() {
        return divisionCPC;
    }

    public void setDivisionCPC(DivisionCPC divisionCPC) {
        this.divisionCPC = divisionCPC;
    }

    

    
}

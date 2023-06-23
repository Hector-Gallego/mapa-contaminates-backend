package mapacontaminates.com.mapa_contaminates.model.ecomomy_activity_ciiu;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "group_ciiu")
public class GroupCIIU {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    @Column(columnDefinition = "TEXT")
    private String name; 

    @ManyToOne
    @JoinColumn(name = "fk_division_ciiu_id")
    private DivisionCIIU divisionCIIU;

    

    public GroupCIIU() {
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

    public DivisionCIIU getDivisionCIIU() {
        return divisionCIIU;
    }

    public void setDivisionCIIU(DivisionCIIU divisionCIIU) {
        this.divisionCIIU = divisionCIIU;
    }

    
    
}

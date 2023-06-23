package mapacontaminates.com.mapa_contaminates.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="residual_subcurrent")
public class ResidualSubCurrent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    @Column(columnDefinition = "TEXT")
    private String name;


    @ManyToOne
    @JoinColumn(name="fk_residualCurrent_id", nullable=false)
    @JsonIgnore
    private ResidualCurrent residualCurrent;


    public ResidualSubCurrent() {
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


    public ResidualCurrent getResidualCurrent() {
        return residualCurrent;
    }


    public void setResidualCurrent(ResidualCurrent residualCurrent) {
        this.residualCurrent = residualCurrent;
    }

  
}

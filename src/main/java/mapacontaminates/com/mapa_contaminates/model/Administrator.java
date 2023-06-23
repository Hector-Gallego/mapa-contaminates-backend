package mapacontaminates.com.mapa_contaminates.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="adminstrator")
public class Administrator {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pasword;
    private String names;
    private String last_names;




    
    public Administrator() {
    }

    public Administrator(Long id, String pasword, String names, String last_names) {
        this.id = id;
        this.pasword = pasword;
        this.names = names;
        this.last_names = last_names;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPasword() {
        return pasword;
    }
    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    public String getNames() {
        return names;
    }
    public void setNames(String names) {
        this.names = names;
    }
    public String getLast_names() {
        return last_names;
    }
    public void setLast_names(String last_names) {
        this.last_names = last_names;
    }

    
}

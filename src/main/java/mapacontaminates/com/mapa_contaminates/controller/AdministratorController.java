package mapacontaminates.com.mapa_contaminates.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import mapacontaminates.com.mapa_contaminates.model.Administrator;
import mapacontaminates.com.mapa_contaminates.service.administrator.IAdministratorService;

@RestController
@RequestMapping("/api/administrators")
public class AdministratorController {


    private final IAdministratorService administratorService;

    public AdministratorController(IAdministratorService administratorService) {
        this.administratorService = administratorService;
    } 

    @GetMapping
    public ResponseEntity<List<Administrator>> getAllAdministrator(){
        return new ResponseEntity<>(administratorService.getAllUsers(), HttpStatus.OK);      
    }

    @GetMapping("/{id}")
    public ResponseEntity<Administrator> getAdministratorById(@PathVariable Long id){
        return new ResponseEntity<>(administratorService.getAdministratorById(id),  HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Administrator> createAdministrator(@Valid @RequestBody Administrator admin){
        return new ResponseEntity<>(administratorService.createAdministrator(admin), HttpStatus.OK);

    }
    @PutMapping("/{id}")
    public ResponseEntity<Administrator> updateAdministrator(@Valid @PathVariable Long id, @RequestBody Administrator admin){

        return new ResponseEntity<>(administratorService.updateAdministrator(admin, id), HttpStatus.OK);
        
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteAdministrator(@PathVariable Long id){
        administratorService.deleteAdministratorById(id);
        return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
    }


    
    
}

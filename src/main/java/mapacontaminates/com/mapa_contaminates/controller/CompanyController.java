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

import mapacontaminates.com.mapa_contaminates.model.Company;
import mapacontaminates.com.mapa_contaminates.service.company.ICompanyService;

@RestController
@RequestMapping("/api/company")
public class CompanyController {


    private final ICompanyService companyService;

    public CompanyController(ICompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<List<Company>> getAllCompanys(){
        return new ResponseEntity<>(companyService.getAllCompanys(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompany(@PathVariable Long id){
        return new ResponseEntity<>(companyService.getCompanyById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> updateCompany(@PathVariable Long id, @RequestBody Company company ){
        return new ResponseEntity<>(companyService.updateCompany(company, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteCompany(@PathVariable Long id){
        companyService.deleteCompanyById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

   @PostMapping
   public ResponseEntity<Company> createCompany(@RequestBody Company company){
      return new ResponseEntity<>(companyService.createCompany(company), HttpStatus.OK);
   }




    
}
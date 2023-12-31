package mapacontaminantes.com.mapa_contaminantes.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapacontaminantes.com.mapa_contaminantes.model.central_product_clasification_cpc.CentralProductClasificationCPC;
import mapacontaminantes.com.mapa_contaminantes.service.central_product_clasification.ICentralProductClasificationCPCService;

@RestController
@RequestMapping("/api/centralproductclasification")
public class CentralProductClasificationCPCController {


    private final ICentralProductClasificationCPCService centralProductClasificationCPCService;

    public CentralProductClasificationCPCController(
        ICentralProductClasificationCPCService centralProductClasificationCPCService) {
        this.centralProductClasificationCPCService = centralProductClasificationCPCService;
    }


    @GetMapping
    public ResponseEntity<List<CentralProductClasificationCPC>> getAllCentralProductClasifications(){
        return new ResponseEntity<>(centralProductClasificationCPCService.getAllCentralProductCalsificationCPC(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CentralProductClasificationCPC> getCentralProductClasification(@PathVariable Long id){
        return new ResponseEntity<>(centralProductClasificationCPCService.getCentralProductClasificationCPClById(id), HttpStatus.OK);
    }
    
}

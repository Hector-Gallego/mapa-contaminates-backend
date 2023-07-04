package mapacontaminates.com.mapa_contaminates.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapacontaminates.com.mapa_contaminates.model.ecomomy_activity_ciiu.EconomyActivityCIIU;
import mapacontaminates.com.mapa_contaminates.service.economy_activity.IEconomyActivityCIIUService;

@RestController
@RequestMapping("/api/economyactivities")
public class EconomyActivityCIIUController {

    private final IEconomyActivityCIIUService economyActivityCIIUService;
    public EconomyActivityCIIUController(IEconomyActivityCIIUService economyActivityCIIUService) {
        this.economyActivityCIIUService = economyActivityCIIUService;
    }

    @GetMapping
    public ResponseEntity<List<EconomyActivityCIIU>> getAllEconomyActivities(){
        return new ResponseEntity<>(economyActivityCIIUService.getAllEconomicActivitysCIIU(), HttpStatus.OK);  
    }

    @GetMapping("/{id}")
    public ResponseEntity<EconomyActivityCIIU> getEconomyActivity(@PathVariable Long id){
        return new ResponseEntity<>(economyActivityCIIUService.getEconomicActivityCIIUById(id), HttpStatus.OK);
    }

    @GetMapping("/code/{code}")
    public ResponseEntity<EconomyActivityCIIU> getEconomyActivityByCode(@PathVariable String code){
        return new ResponseEntity<>(economyActivityCIIUService.gEconomycActivityCIIUByCode(code), HttpStatus.OK);
    }

    
}

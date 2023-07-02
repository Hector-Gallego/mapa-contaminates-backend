package mapacontaminates.com.mapa_contaminates.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapacontaminates.com.mapa_contaminates.model.ResidualCurrent;
import mapacontaminates.com.mapa_contaminates.service.residual_current.IResidualCurrentService;

@RestController
@RequestMapping("/api/residualcurrents")
public class ResidualCurrentController {


    private final IResidualCurrentService residualCurrentService;

    public ResidualCurrentController(IResidualCurrentService residualCurrentService) {
        this.residualCurrentService = residualCurrentService;
    }

    @GetMapping
    public ResponseEntity<List<ResidualCurrent>> getAllResidualCurrent(){
        return new ResponseEntity<>(residualCurrentService.getAllresidualCurrents(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResidualCurrent> getRessidualCurent(@PathVariable Long id){
        return new ResponseEntity<>(residualCurrentService.getResidualCurrentById(id), HttpStatus.OK);
    }
    
}

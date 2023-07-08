package mapacontaminantes.com.mapa_contaminantes.service.residual_current;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mapacontaminantes.com.mapa_contaminantes.model.ResidualCurrent;
import mapacontaminantes.com.mapa_contaminantes.repository.ResidualCurrentRepository;



@Service
public class ResidualCurrentImpl implements IResidualCurrentService{

    private final ResidualCurrentRepository residualCurrentRepository;

    public ResidualCurrentImpl(ResidualCurrentRepository residualCurrentRepository) {
        this.residualCurrentRepository = residualCurrentRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ResidualCurrent> getAllresidualCurrents() {
       return residualCurrentRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public ResidualCurrent getResidualCurrentById(Long id) {
        
        return residualCurrentRepository.findById(id).orElseThrow();
    }
    
}

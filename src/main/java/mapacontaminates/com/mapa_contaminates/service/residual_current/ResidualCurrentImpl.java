package mapacontaminates.com.mapa_contaminates.service.residual_current;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mapacontaminates.com.mapa_contaminates.model.ResidualCurrent;
import mapacontaminates.com.mapa_contaminates.repository.ResidualCurrentRepository;



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

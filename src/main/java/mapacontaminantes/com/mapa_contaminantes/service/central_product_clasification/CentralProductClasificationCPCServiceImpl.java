package mapacontaminantes.com.mapa_contaminantes.service.central_product_clasification;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mapacontaminantes.com.mapa_contaminantes.model.central_product_clasification_cpc.CentralProductClasificationCPC;
import mapacontaminantes.com.mapa_contaminantes.repository.CentralProductClasificationCPCRepository;

@Service
public class CentralProductClasificationCPCServiceImpl implements ICentralProductClasificationCPCService{

    private final CentralProductClasificationCPCRepository centralProductClasificationCPCCPCRepository;
    public CentralProductClasificationCPCServiceImpl(CentralProductClasificationCPCRepository centralProductClasificationCPCCPCRepository) {
        this.centralProductClasificationCPCCPCRepository = centralProductClasificationCPCCPCRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CentralProductClasificationCPC> getAllCentralProductCalsificationCPC() {
        return centralProductClasificationCPCCPCRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public CentralProductClasificationCPC getCentralProductClasificationCPClById(Long id) {
        return centralProductClasificationCPCCPCRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
    }
    
}

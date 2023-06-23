package mapacontaminates.com.mapa_contaminates.service.central_product_clasification;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mapacontaminates.com.mapa_contaminates.model.central_product_clasification_cpc.CentralProductClasificationCPC;
import mapacontaminates.com.mapa_contaminates.repository.CentralProductClasificationCPCRepository;

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
        return centralProductClasificationCPCCPCRepository.findById(id).orElseThrow();
    }
    
}

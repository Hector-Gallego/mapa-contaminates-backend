package mapacontaminates.com.mapa_contaminates.service.economy_activity;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mapacontaminates.com.mapa_contaminates.model.ecomomy_activity_ciiu.EconomyActivityCIIU;
import mapacontaminates.com.mapa_contaminates.repository.EconomyActivityCIIURepository;

@Service
public class EconomyActivityCIIUServiceImpl implements IEconomyActivityCIIUService {

    private final EconomyActivityCIIURepository economyActivityCIIURepository;

    public EconomyActivityCIIUServiceImpl(EconomyActivityCIIURepository economyActivityCIIURepository) {
        this.economyActivityCIIURepository = economyActivityCIIURepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<EconomyActivityCIIU> getAllEconomicActivitysCIIU() {
        return economyActivityCIIURepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public EconomyActivityCIIU getEconomicActivityCIIUById(Long id) {
        return economyActivityCIIURepository.findById(id).orElseThrow();
    }

    
}

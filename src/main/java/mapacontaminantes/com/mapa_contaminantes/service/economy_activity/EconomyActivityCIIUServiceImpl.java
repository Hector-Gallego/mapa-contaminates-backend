package mapacontaminantes.com.mapa_contaminantes.service.economy_activity;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mapacontaminantes.com.mapa_contaminantes.model.ecomomy_activity_ciiu.EconomyActivityCIIU;
import mapacontaminantes.com.mapa_contaminantes.repository.EconomyActivityCIIURepository;

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
        return economyActivityCIIURepository.findById(id).orElseThrow(() -> new NoSuchElementException());
    }

    @Override
    @Transactional(readOnly = true)
    public List<EconomyActivityCIIU> getEconomyActivitysCIIUbyIds(List<Long> ids) {
        return economyActivityCIIURepository.findAllById(ids);
    }

    @Override
    @Transactional(readOnly = true)
    public EconomyActivityCIIU gEconomycActivityCIIUByCode(String code) {
        return economyActivityCIIURepository.findByCode(code).orElseThrow(() -> new NoSuchElementException());
    }

    
}

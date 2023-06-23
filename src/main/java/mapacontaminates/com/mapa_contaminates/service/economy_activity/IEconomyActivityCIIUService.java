package mapacontaminates.com.mapa_contaminates.service.economy_activity;

import java.util.List;

import mapacontaminates.com.mapa_contaminates.model.ecomomy_activity_ciiu.EconomyActivityCIIU;

public interface IEconomyActivityCIIUService {

    List<EconomyActivityCIIU> getAllEconomicActivitysCIIU();
    EconomyActivityCIIU getEconomicActivityCIIUById(Long id);
    
}

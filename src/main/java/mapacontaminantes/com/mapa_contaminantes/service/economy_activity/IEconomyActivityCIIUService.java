package mapacontaminantes.com.mapa_contaminantes.service.economy_activity;

import java.util.List;

import mapacontaminantes.com.mapa_contaminantes.model.ecomomy_activity_ciiu.EconomyActivityCIIU;

public interface IEconomyActivityCIIUService {

    List<EconomyActivityCIIU> getAllEconomicActivitysCIIU();
    EconomyActivityCIIU getEconomicActivityCIIUById(Long id);
    List<EconomyActivityCIIU> getEconomyActivitysCIIUbyIds(List<Long> ids);
    EconomyActivityCIIU gEconomycActivityCIIUByCode(String code);
    
}

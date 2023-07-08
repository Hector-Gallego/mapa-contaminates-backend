package mapacontaminantes.com.mapa_contaminantes.service.central_product_clasification;

import java.util.List;

import mapacontaminantes.com.mapa_contaminantes.model.central_product_clasification_cpc.CentralProductClasificationCPC;

public interface ICentralProductClasificationCPCService {
    
    List<CentralProductClasificationCPC> getAllCentralProductCalsificationCPC();
    CentralProductClasificationCPC getCentralProductClasificationCPClById(Long id);
}

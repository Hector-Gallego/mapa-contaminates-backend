package mapacontaminates.com.mapa_contaminates.service.central_product_clasification;

import java.util.List;

import mapacontaminates.com.mapa_contaminates.model.central_product_clasification_cpc.CentralProductClasificationCPC;

public interface ICentralProductClasificationCPCService {
    
    List<CentralProductClasificationCPC> getAllCentralProductCalsificationCPC();
    CentralProductClasificationCPC getCentralProductClasificationCPClById(Long id);
}

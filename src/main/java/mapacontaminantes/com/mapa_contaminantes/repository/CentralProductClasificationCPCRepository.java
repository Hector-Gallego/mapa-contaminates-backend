package mapacontaminantes.com.mapa_contaminantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mapacontaminantes.com.mapa_contaminantes.model.central_product_clasification_cpc.CentralProductClasificationCPC;

public interface CentralProductClasificationCPCRepository extends JpaRepository<CentralProductClasificationCPC, Long> {
    
}

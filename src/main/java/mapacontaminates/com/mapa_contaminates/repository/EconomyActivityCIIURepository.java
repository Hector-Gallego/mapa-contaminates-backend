package mapacontaminates.com.mapa_contaminates.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mapacontaminates.com.mapa_contaminates.model.ecomomy_activity_ciiu.EconomyActivityCIIU;

public interface EconomyActivityCIIURepository extends JpaRepository<EconomyActivityCIIU, Long>{

    Optional<EconomyActivityCIIU> findByCode(String code);
    
}

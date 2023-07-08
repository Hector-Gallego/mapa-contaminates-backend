package mapacontaminantes.com.mapa_contaminantes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mapacontaminantes.com.mapa_contaminantes.model.ecomomy_activity_ciiu.EconomyActivityCIIU;

public interface EconomyActivityCIIURepository extends JpaRepository<EconomyActivityCIIU, Long>{

    Optional<EconomyActivityCIIU> findByCode(String code);
    
}

package mapacontaminantes.com.mapa_contaminantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mapacontaminantes.com.mapa_contaminantes.model.Administrator;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
    
}

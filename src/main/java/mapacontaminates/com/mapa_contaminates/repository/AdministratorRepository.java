package mapacontaminates.com.mapa_contaminates.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mapacontaminates.com.mapa_contaminates.model.Administrator;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
    
}

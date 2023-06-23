package mapacontaminates.com.mapa_contaminates.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mapacontaminates.com.mapa_contaminates.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    
}

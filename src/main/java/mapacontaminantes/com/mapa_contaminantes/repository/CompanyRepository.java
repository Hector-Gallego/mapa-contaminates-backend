package mapacontaminantes.com.mapa_contaminantes.repository;





import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import mapacontaminantes.com.mapa_contaminantes.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    Page<Company> findAll(Pageable pageable);
   
    
}

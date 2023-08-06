package mapacontaminantes.com.mapa_contaminantes.service.company;

import java.util.List;

import org.springframework.data.domain.Page;

import mapacontaminantes.com.mapa_contaminantes.model.Company;
import mapacontaminantes.com.mapa_contaminantes.model.CompanyDto;

public interface ICompanyService {

    
    List<CompanyDto> getAllCompanys();
    Company getCompanyById(Long id);
    void deleteCompanyById(Long id);
    Company createCompany(Company company);
    Company updateCompany(Company company, Long id);
    Page<Company> getAllCompanysByPages(int page, int size);
    List<Company> getCompaniesByterm(String term);
   
    
}

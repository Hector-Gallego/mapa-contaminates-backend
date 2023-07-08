package mapacontaminantes.com.mapa_contaminantes.service.company;

import java.util.List;

import mapacontaminantes.com.mapa_contaminantes.model.Company;

public interface ICompanyService {

    
    List<Company> getAllCompanys();
    Company getCompanyById(Long id);
    void deleteCompanyById(Long id);
    Company createCompany(Company company);
    Company updateCompany(Company company, Long id);
    
}

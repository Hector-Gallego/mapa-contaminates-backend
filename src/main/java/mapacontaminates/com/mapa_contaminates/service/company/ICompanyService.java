package mapacontaminates.com.mapa_contaminates.service.company;

import java.util.List;

import mapacontaminates.com.mapa_contaminates.model.Company;

public interface ICompanyService {

    
    List<Company> getAllCompanys();
    Company getCompanyById(Long id);
    void deleteCompanyById(Long id);
    Company createCompany(Company company);
    Company updateCompany(Company company, Long id);
    
}

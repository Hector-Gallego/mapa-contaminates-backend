package mapacontaminates.com.mapa_contaminates.service.company;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import mapacontaminates.com.mapa_contaminates.model.Company;
import mapacontaminates.com.mapa_contaminates.model.ecomomy_activity_ciiu.EconomyActivityCIIU;
import mapacontaminates.com.mapa_contaminates.repository.CompanyRepository;
import mapacontaminates.com.mapa_contaminates.service.economy_activity.IEconomyActivityCIIUService;

@Service
public class CompanyServiceImpl implements ICompanyService {

    private final CompanyRepository companyRepository;
    private final IEconomyActivityCIIUService economyActivityCIIUService;

    public CompanyServiceImpl(CompanyRepository companyRepository,
            IEconomyActivityCIIUService economyActivityCIIUService) {
        this.companyRepository = companyRepository;
        this.economyActivityCIIUService = economyActivityCIIUService;
    }

    @Override
    public List<Company> getAllCompanys() {
        return companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException());
    }

    @Override
    public void deleteCompanyById(Long id) {
        getCompanyById(id);
        companyRepository.deleteById(id);
    }

    @Override
    public Company createCompany(Company company) {

        List<Long> economyActivityCIIUsIds = company.getEconomyActivityCIIUs()
                .stream()
                .map(EconomyActivityCIIU::getId)
                .collect(Collectors.toList());

        List<EconomyActivityCIIU> economyActivityCIIUs = economyActivityCIIUService.getEconomyActivitysCIIUbyIds(economyActivityCIIUsIds);

        company.setEconomyActivityCIIUs(economyActivityCIIUs);
        return companyRepository.save(company);


    }

    @Override
    public Company updateCompany(Company company, Long id) {

        Company companyPersist = getCompanyById(id);
        BeanUtils.copyProperties(company, companyPersist, "id");
        return createCompany(companyPersist);

    }

}

package mapacontaminantes.com.mapa_contaminantes.service.company;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import mapacontaminantes.com.mapa_contaminantes.model.Company;
import mapacontaminantes.com.mapa_contaminantes.model.CompanyDto;
import mapacontaminantes.com.mapa_contaminantes.model.MapDto;
import mapacontaminantes.com.mapa_contaminantes.model.ecomomy_activity_ciiu.EconomyActivityCIIU;
import mapacontaminantes.com.mapa_contaminantes.repository.CompanyRepository;
import mapacontaminantes.com.mapa_contaminantes.service.economy_activity.IEconomyActivityCIIUService;

@Service
public class CompanyServiceImpl implements ICompanyService {

    private final CompanyRepository companyRepository;
    private final IEconomyActivityCIIUService economyActivityCIIUService;
    private final MapDto mapDto;

   

    public CompanyServiceImpl(CompanyRepository companyRepository,
            IEconomyActivityCIIUService economyActivityCIIUService, MapDto mapDto) {
        this.companyRepository = companyRepository;
        this.economyActivityCIIUService = economyActivityCIIUService;
        this.mapDto = mapDto;
    }

    @Override
    public List<CompanyDto> getAllCompanys() {

        List<Company> companies =  companyRepository.findAll();

            return companies.stream()
                .map(mapDto::mapToDTO)
                .collect(Collectors.toList());
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

        List<EconomyActivityCIIU> economyActivityCIIUs = economyActivityCIIUService
                .getEconomyActivitysCIIUbyIds(economyActivityCIIUsIds);

        company.setEconomyActivityCIIUs(economyActivityCIIUs);
        return companyRepository.save(company);

    }

    @Override
    public Company updateCompany(Company company, Long id) {

        Company companyPersist = getCompanyById(id);
        BeanUtils.copyProperties(company, companyPersist, "id");
        return createCompany(companyPersist);

    }

    @Override
    public Page<Company> getAllCompanysByPages(int page, int size) {

        Pageable paging = PageRequest.of(page, size);
        return companyRepository.findAll(paging);
    }

    @Override
    public List<Company> getCompaniesByterm(String term) {
        return companyRepository.findAllByNameContainingIgnoreCase(term);
    }

   
}

package mapacontaminantes.com.mapa_contaminantes.service.statistics;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import mapacontaminantes.com.mapa_contaminantes.model.statistics_dto.TotalStatisticsByCompanyDto;
import mapacontaminantes.com.mapa_contaminantes.model.statistics_dto.StatisticsDto;
import mapacontaminantes.com.mapa_contaminantes.model.statistics_dto.TotalAllStatisticsDto;
import mapacontaminantes.com.mapa_contaminantes.repository.statistics_repositories.CompanyStatiticsRepository;
import mapacontaminantes.com.mapa_contaminantes.repository.statistics_repositories.EconomyActivtyStatisticsRepository;
import mapacontaminantes.com.mapa_contaminantes.repository.statistics_repositories.ResidualCurrentStatisticsRepository;

@Service
public class StatisticsServiceImpl implements IStatisticsService {

    private final EconomyActivtyStatisticsRepository ecoActStatisticsRepository;
    private final ResidualCurrentStatisticsRepository resCurrStatisticsRepository;
    private final CompanyStatiticsRepository companyStatiticsRepository;

    public StatisticsServiceImpl(EconomyActivtyStatisticsRepository ecoActStatisticsRepository,
            ResidualCurrentStatisticsRepository resCurrStatisticsRepository,
            CompanyStatiticsRepository companyStatiticsRepository) {
        this.ecoActStatisticsRepository = ecoActStatisticsRepository;
        this.resCurrStatisticsRepository = resCurrStatisticsRepository;
        this.companyStatiticsRepository = companyStatiticsRepository;
    }

    @Override
    public List<StatisticsDto> getEconomyActivitiesCountCompanies() {
        List<Object[]> results = ecoActStatisticsRepository.getEconomyActivitiesCountCompanies();

        List<StatisticsDto> activityCounts = results.stream()
                .map(result -> {
                    String activityName = (String) result[0];
                    String activityCode = (String) result[1];
                    Long count = (Long) result[2];
                    return new StatisticsDto(activityName, activityCode, count);
                })
                .sorted(Comparator.comparingLong(StatisticsDto::getCount).reversed())
                .limit(10)
                .collect(Collectors.toList());

        return activityCounts;
    }

    @Override
    public List<StatisticsDto> getResidualCurrentsCountActivities() {
        List<Object[]> results = resCurrStatisticsRepository.getResidualCurrentsCountActivities();

        List<StatisticsDto> residualsCounts = results.stream()
                .map(result -> {
                    String residualName = (String) result[0];
                    String residualCode = (String) result[1];
                    Long countActEco = (Long) result[2];
                    return new StatisticsDto(residualName, residualCode, countActEco);
                })
                .sorted(Comparator.comparingLong(StatisticsDto::getCount).reversed())
                .limit(10)
                .collect(Collectors.toList());

        return residualsCounts;

    }

    @Override
    public List<StatisticsDto> getResidualCurrentsCountCompanies() {

        List<Object[]> results = resCurrStatisticsRepository.getResidualCurrentsCountCompanies();

        List<StatisticsDto> residualsCompanyCounts = results.stream()
                .map(result -> {
                    String residualName = (String) result[0];
                    String residualCode = (String) result[1];
                    Long countCompanies = (Long) result[2];
                    return new StatisticsDto(residualName, residualCode, countCompanies);
                })
                .sorted(Comparator.comparingLong(StatisticsDto::getCount).reversed())
                .limit(10)
                .collect(Collectors.toList());

        return residualsCompanyCounts;
    }

    @Override
    public List<TotalStatisticsByCompanyDto> getCompaniesCountResidualsAndActivities() {

        List<Object[]> results = companyStatiticsRepository.getCompaniesCountResidualsAndActivities();

        List<TotalStatisticsByCompanyDto> companyResidualEconomyActivity = results.stream()
                .map(result -> {
                    String companyName = (String) result[0];
                    Long residualCount = (Long) result[1];
                    Long activityCount = (Long) result[2];
                    return new TotalStatisticsByCompanyDto(companyName, residualCount, activityCount);
                })
                .sorted(Comparator.comparingLong(TotalStatisticsByCompanyDto::getActivityCount).reversed())
                .limit(10)
                .collect(Collectors.toList());

        return companyResidualEconomyActivity;

    }

    @Override
    public TotalAllStatisticsDto getCountAllCompaniesCountResidualsAndActivities() {
        List<Object[]> results = companyStatiticsRepository.getCountAllCompaniesCountResidualsAndActivities();

        if (!results.isEmpty()) {
            Object[] result = results.get(0);
            Long companyCount = (Long) result[0];
            Long economyActivityCount = (Long) result[1];
            Long residualCurrentCount = (Long) result[2];

            return new TotalAllStatisticsDto(companyCount, economyActivityCount, residualCurrentCount);
        }

        return null; // Manejar caso de resultados vacíos
    }

    @Override
    public TotalAllStatisticsDto getCountAllCompanysActivitiesResiduals() {

        Long totalCompaniesCount = companyStatiticsRepository.getAllCountCompanies();
        Long totalEconomyActivitiesCount = companyStatiticsRepository.getAllCountEconomyActivities();
        Long totalResidualCurrentsCount = companyStatiticsRepository.getAllCountResidualCurrents();

        return new TotalAllStatisticsDto(totalCompaniesCount, totalEconomyActivitiesCount, totalResidualCurrentsCount);

    }

}

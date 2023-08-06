package mapacontaminantes.com.mapa_contaminantes.service.statistics;

import java.util.List;


import mapacontaminantes.com.mapa_contaminantes.model.statistics_dto.TotalStatisticsByCompanyDto;
import mapacontaminantes.com.mapa_contaminantes.model.statistics_dto.TotalAllStatisticsDto;
import mapacontaminantes.com.mapa_contaminantes.model.statistics_dto.StatisticsDto;

public interface IStatisticsService {

    List<StatisticsDto> getEconomyActivitiesCountCompanies();
    List<StatisticsDto> getResidualCurrentsCountActivities();
    List<StatisticsDto> getResidualCurrentsCountCompanies();
    List<TotalStatisticsByCompanyDto> getCompaniesCountResidualsAndActivities();
    TotalAllStatisticsDto getCountAllCompaniesCountResidualsAndActivities();
    TotalAllStatisticsDto getCountAllCompanysActivitiesResiduals();

    
}

package mapacontaminantes.com.mapa_contaminantes.service.statistics;

import java.util.List;


import mapacontaminantes.com.mapa_contaminantes.model.statistics_dto.TotalAllStatistics;
import mapacontaminantes.com.mapa_contaminantes.model.statistics_dto.TotalStatisticsDto;
import mapacontaminantes.com.mapa_contaminantes.model.statistics_dto.StatisticsDto;

public interface IStatisticsService {

    List<StatisticsDto> getEconomyActivitiesCountCompanies();
    List<StatisticsDto> getResidualCurrentsCountActivities();
    List<StatisticsDto> getResidualCurrentsCountCompanies();
    List<TotalAllStatistics> getCompaniesCountResidualsAndActivities();
    TotalStatisticsDto getCountAllCompaniesCountResidualsAndActivities();
    TotalStatisticsDto getCountAllCompanysActivitiesResiduals();

    
}

package mapacontaminantes.com.mapa_contaminantes.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapacontaminantes.com.mapa_contaminantes.model.statistics_dto.TotalAllStatistics;
import mapacontaminantes.com.mapa_contaminantes.model.statistics_dto.StatisticsDto;
import mapacontaminantes.com.mapa_contaminantes.model.statistics_dto.TotalStatisticsDto;
import mapacontaminantes.com.mapa_contaminantes.service.statistics.IStatisticsService;

@RestController
@RequestMapping("/api/statistics")
public class staticsController {

    private final IStatisticsService statisticsService;

    public staticsController(IStatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping("/activity-count-company")
    public ResponseEntity<List<StatisticsDto>> getEconomyActivitiesCountCompanies() {
        return new ResponseEntity<List<StatisticsDto>>(
                statisticsService.getEconomyActivitiesCountCompanies(),
                HttpStatus.OK);
    }

    @GetMapping("/residual-count-activity")
    public ResponseEntity<List<StatisticsDto>> getResidualCurrentsCountActivities() {
        return new ResponseEntity<List<StatisticsDto>>(
                statisticsService.getResidualCurrentsCountActivities(),
                HttpStatus.OK);
    }

    @GetMapping("/residual-count-company")
    public ResponseEntity<List<StatisticsDto>> getResidualCurrentsCountCompanies() {
        return new ResponseEntity<List<StatisticsDto>>(
                statisticsService.getResidualCurrentsCountCompanies(),
                HttpStatus.OK);
    }

    @GetMapping("/company-count-residual-activity")
    public List<TotalAllStatistics> getCompaniesCountResidualsAndActivities() {
        return statisticsService.getCompaniesCountResidualsAndActivities();
    }

    @GetMapping("/total-statistics")
    public TotalStatisticsDto getCountAllCompaniesCountResidualsAndActivities() {
        return statisticsService.getCountAllCompaniesCountResidualsAndActivities();
    }

    @GetMapping("/total-all-statistics")
    public TotalStatisticsDto getCountAllCompanysActivitiesResiduals() {
        return statisticsService.getCountAllCompanysActivitiesResiduals();
    }
}

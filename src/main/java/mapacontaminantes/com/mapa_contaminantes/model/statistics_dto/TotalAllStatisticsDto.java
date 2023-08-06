package mapacontaminantes.com.mapa_contaminantes.model.statistics_dto;

public class TotalAllStatisticsDto {

    private Long countCompany;
    private Long countEconomyActivities;
    private Long countResidualsCurrents;

    

    public TotalAllStatisticsDto() {
    }

    public Long getCountCompany() {
        return countCompany;
    }

    public TotalAllStatisticsDto(Long countCompany, Long countEconomyActivities, Long countResidualsCurrents) {
        this.countCompany = countCompany;
        this.countEconomyActivities = countEconomyActivities;
        this.countResidualsCurrents = countResidualsCurrents;
    }

    public void setCountCompany(Long countCompany) {
        this.countCompany = countCompany;
    }

    public Long getCountEconomyActivities() {
        return countEconomyActivities;
    }

    public void setCountEconomyActivities(Long countEconomyActivities) {
        this.countEconomyActivities = countEconomyActivities;
    }

    public Long getCountResidualsCurrents() {
        return countResidualsCurrents;
    }

    public void setCountResidualsCurrents(Long countResidualsCurrents) {
        this.countResidualsCurrents = countResidualsCurrents;
    }

}

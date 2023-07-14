package mapacontaminantes.com.mapa_contaminantes.model.statistics_dto;

public class TotalAllStatistics {
    
    private String companyName;
    private Long residualCount;
    private Long activityCount;

    
    public TotalAllStatistics() {
    }
    public TotalAllStatistics(String companyName, Long residualCount, Long activityCount) {
        this.companyName = companyName;
        this.residualCount = residualCount;
        this.activityCount = activityCount;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public Long getResidualCount() {
        return residualCount;
    }
    public void setResidualCount(Long residualCount) {
        this.residualCount = residualCount;
    }
    public Long getActivityCount() {
        return activityCount;
    }
    public void setActivityCount(Long activityCount) {
        this.activityCount = activityCount;
    }

    
}

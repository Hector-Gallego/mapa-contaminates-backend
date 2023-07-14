package mapacontaminantes.com.mapa_contaminantes.model.statistics_dto;

public class StatisticsDto {

    private String name;
    private String code;
    private Long count;

    
    
    public StatisticsDto() {
    }
    public StatisticsDto(String name, String code, Long count) {
        this.name = name;
        this.code = code;
        this.count = count;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Long getCount() {
        return count;
    }
    public void setCount(Long count) {
        this.count = count;
    }

    
    
}

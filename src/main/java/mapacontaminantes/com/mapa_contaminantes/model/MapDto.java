package mapacontaminantes.com.mapa_contaminantes.model;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import mapacontaminantes.com.mapa_contaminantes.model.ecomomy_activity_ciiu.EconomyActivityCIIU;

@Service
public class MapDto {

    private final ModelMapper modelMapper;

    public MapDto(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public CompanyDto mapToDTO(Company company) {
        CompanyDto dto = modelMapper.map(company, CompanyDto.class);
        List<String> activityNames = company.getEconomyActivityCIIUs().stream()
                .map(EconomyActivityCIIU::getName)
                .collect(Collectors.toList());
        dto.setEconomyActivities(activityNames);
        return dto;
    }

}

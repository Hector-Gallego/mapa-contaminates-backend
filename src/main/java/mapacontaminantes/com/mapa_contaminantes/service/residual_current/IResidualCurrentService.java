package mapacontaminantes.com.mapa_contaminantes.service.residual_current;

import java.util.List;

import mapacontaminantes.com.mapa_contaminantes.model.ResidualCurrent;

public interface IResidualCurrentService {

    List<ResidualCurrent> getAllresidualCurrents();
    ResidualCurrent getResidualCurrentById(Long id);
       
}

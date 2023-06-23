package mapacontaminates.com.mapa_contaminates.service.residual_current;

import java.util.List;

import mapacontaminates.com.mapa_contaminates.model.ResidualCurrent;

public interface IResidualCurrentService {

    List<ResidualCurrent> getAllresidualCurrents();
    ResidualCurrent getResidualCurrentById(Long id);
       
}

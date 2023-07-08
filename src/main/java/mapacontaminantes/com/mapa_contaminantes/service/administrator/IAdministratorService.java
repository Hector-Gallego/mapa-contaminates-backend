package mapacontaminantes.com.mapa_contaminantes.service.administrator;

import java.util.List;

import mapacontaminantes.com.mapa_contaminantes.model.Administrator;

public interface IAdministratorService {

    List<Administrator> getAllUsers();
    Administrator getAdministratorById(long id);
    void deleteAdministratorById(Long id);
    Administrator createAdministrator(Administrator admin);
    Administrator updateAdministrator(Administrator admin, Long id);
    
}

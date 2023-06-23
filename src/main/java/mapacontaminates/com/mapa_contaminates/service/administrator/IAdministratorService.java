package mapacontaminates.com.mapa_contaminates.service.administrator;

import java.util.List;

import mapacontaminates.com.mapa_contaminates.model.Administrator;

public interface IAdministratorService {

    List<Administrator> getAllUsers();
    Administrator getAdministratorById(long id);
    void deleteAdministratorById(Long id);
    Administrator createAdministrator(Administrator admin);
    Administrator updateAdministrator(Administrator admin, Long id);
    
}

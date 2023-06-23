package mapacontaminates.com.mapa_contaminates.service.administrator;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mapacontaminates.com.mapa_contaminates.model.Administrator;
import mapacontaminates.com.mapa_contaminates.repository.AdministratorRepository;

@Service
public class AdministratorServiceImpl implements IAdministratorService{


    private final AdministratorRepository administratorRepository;

    public AdministratorServiceImpl(AdministratorRepository administratorRepository) {
        this.administratorRepository = administratorRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Administrator> getAllUsers() {
        return administratorRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Administrator getAdministratorById(long id) {
        return administratorRepository.findById(id).orElseThrow();
    }

    @Override
    @Transactional
    public void deleteAdministratorById(Long id) {
        getAdministratorById(id);
        administratorRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Administrator createAdministrator(Administrator admin) {

        return administratorRepository.save(admin);

    }

    @Override
    @Transactional
    public Administrator updateAdministrator(Administrator admin, Long id) {
        
        Administrator adminPersist = administratorRepository.findById(id).orElseThrow();

        BeanUtils.copyProperties(admin, adminPersist, "id");

        return createAdministrator(admin);
    }
    
}

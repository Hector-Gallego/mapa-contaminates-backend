package mapacontaminantes.com.mapa_contaminantes.repository.statistics_repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mapacontaminantes.com.mapa_contaminantes.model.ecomomy_activity_ciiu.EconomyActivityCIIU;

public interface EconomyActivtyStatisticsRepository extends JpaRepository<EconomyActivityCIIU, Long> {

    /*
     * este metodo devuelve una lista con el nombre y el codigo de cada actividad
     * economica. y la cantidad de empresas asociadas a esa actividad economica en
     * orden descendente
     */
    @Query("SELECT ea.name, ea.code, COUNT(c) FROM Company c JOIN c.economyActivityCIIUs ea GROUP BY ea.id")
    List<Object[]> getEconomyActivitiesCountCompanies();

}

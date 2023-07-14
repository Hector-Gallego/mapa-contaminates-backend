package mapacontaminantes.com.mapa_contaminantes.repository.statistics_repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mapacontaminantes.com.mapa_contaminantes.model.ResidualCurrent;

public interface ResidualCurrentStatisticsRepository extends JpaRepository<ResidualCurrent, Long> {

        /*
         * este metodo devuelve una lista con el nombre y el codigo de cada corriente
         * de residuo y la cantidad de actividades economicas asociadas a ese residuo en
         * orden descendente
         */
        @Query("SELECT rc.name, rc.code, COUNT(ea) as activityCount " +
                        "FROM ResidualCurrent rc " +
                        "JOIN rc.economicActivityCIIUs ea " +
                        "GROUP BY rc.id " +
                        "ORDER BY activityCount DESC")
        List<Object[]> getResidualCurrentsCountActivities();

        /*
         * este metodo devuelve una lista con el nombre y el codigo de cada corriente
         * de residuo y la cantidad de empresas asociadas a ese residuo en orden
         * descendente
         */
        @Query("SELECT rc.name, rc.code, COUNT(DISTINCT c.id) as companyCount " +
                        "FROM ResidualCurrent rc " +
                        "JOIN rc.economicActivityCIIUs ea " +
                        "JOIN ea.companys c " +
                        "GROUP BY rc.id " +
                        "ORDER BY companyCount DESC")
        List<Object[]> getResidualCurrentsCountCompanies();

}

package mapacontaminantes.com.mapa_contaminantes.repository.statistics_repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mapacontaminantes.com.mapa_contaminantes.model.Company;

public interface CompanyStatiticsRepository extends JpaRepository<Company, Long> {

        /*
         * este metodo devuelve una lista con el nombre de cada empresa y la cantidad
         * de corrientes de residuo y actividades economicas asociadas a esa empresa
         * en orden descendente
         */

        @Query("SELECT c.name, COUNT(DISTINCT rc) as residualCount, COUNT(DISTINCT ea) as activityCount " +
                        "FROM Company c " +
                        "JOIN c.economyActivityCIIUs ea " +
                        "JOIN ea.residualCurrents rc " +
                        "GROUP BY c.id " +
                        "ORDER BY residualCount DESC, activityCount DESC")
        List<Object[]> getCompaniesCountResidualsAndActivities();

        /*
         * este metodo devuelve un objeto con el total de empresas registradas
         * y el total de actividades economicas y residuos asociados a el total de
         * empresas
         */
        @Query("SELECT COUNT(DISTINCT c.id), COUNT(DISTINCT ea.id), COUNT(DISTINCT rc.id) " +
                        "FROM Company c " +
                        "LEFT JOIN c.economyActivityCIIUs ea " +
                        "LEFT JOIN ea.residualCurrents rc")
        List<Object[]> getCountAllCompaniesCountResidualsAndActivities();

        /*devuelve el total de empresas en la base de datos */
        @Query("SELECT COUNT(DISTINCT c.id) FROM Company c")
        Long getAllCountCompanies();

        /*devuelve el total de actividades economicas en la bas de datos */
        @Query("SELECT COUNT(DISTINCT ea.id) FROM EconomyActivityCIIU ea")
        Long getAllCountEconomyActivities();

        /*devuelve el total de residuos en la base de datos */
        @Query("SELECT COUNT(DISTINCT rc.id) FROM ResidualCurrent rc")
        Long getAllCountResidualCurrents();

}

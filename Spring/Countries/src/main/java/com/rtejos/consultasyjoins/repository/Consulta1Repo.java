package com.rtejos.consultasyjoins.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rtejos.consultasyjoins.models.Citie;

@Repository
public interface Consulta1Repo extends CrudRepository<Citie, Long> {

	
	@Query(value="SELECT c.name, l.language, l.percentage From countries c INNER JOIN languages l"
			+ " ON c.code = l.country_code WHERE l.language = 'slovene' order by l.percentage DESC", nativeQuery=true)
	List<Object[]> buscapaiseshablaSloveno();
	
	
	@Query(value="SELECT co.name, count(ci.name) AS 'Cantidad Ciudades' FROM countries co INNER JOIN cities ci"
			+ " ON co.id = ci.country_id  GROUP BY co.id ORDER BY 'Cantidad Ciudades' DESC", nativeQuery=true)
	List<Object[]> buscaCuidadesPorPais();
	
	
	@Query(value="SELECT co.name PAIS, ci.name CIUDAD, ci.population POPULATION FROM countries co INNER JOIN cities ci"
			+ " ON co.code = ci.country_code WHERE co.code = 'MEX' and ci.population > 500000"
			+ " ORDER BY ci.population DESC", nativeQuery=true)
	List<Object[]> ciudadesMexicoMayoresA();
	
	
	@Query(value="SELECT co.name COUNTRIE, la.language LANGUAGE, la.percentage PERCENTAGE FROM countries co INNER JOIN languages la"
			+ " ON co.id = la.country_id WHERE la.percentage > 89"
			+ " ORDER BY la.percentage DESC", nativeQuery=true)
	List<Object[]> lenguajesPaisMayor89();
	
	
	@Query(value="SELECT co.name COUNTRIE, co.surface_area SURFACE, co.population POPULATION FROM countries co"
			+ " WHERE co.surface_area < 501 and co.population > 100000", nativeQuery=true)
	List<Object[]> paisesSurfacePopulation();
	
	
	@Query(value="SELECT co.name, co.government_form, co.surface_area, co.life_expectancy FROM countries co"
			+ " WHERE co.government_form = 'Constitutional Monarchy' and co.surface_area > 200 and co.life_expectancy > 75", nativeQuery=true)
	List<Object[]> paisesConstitutionalMonarchy();
	
	
	@Query(value="SELECT co.name COUNTRI, ci.name CITIE, ci.district DISTRICT, ci.population POPULATION FROM countries co"
			+ " INNER JOIN cities ci ON co.id = ci.country_id"
			+ " WHERE co.code = 'ARG' and ci.district = 'Buenos Aires' and ci.population > 500000", nativeQuery=true)
	List<Object[]> ciudadeArgBAires();
	
	
	@Query(value="SELECT co.region REGION, COUNT(co.name) 'CANT COUNTRIES' FROM countries co"
			+ " GROUP BY co.region ORDER BY co.name DESC", nativeQuery=true)
	List<Object[]> ciudadesPorRegion();
	
	
	
	
	
}

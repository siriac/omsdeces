package org.sinares.dao;

import java.util.List;

import org.sinares.entities.District;
import org.sinares.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IDistrictRepository extends JpaRepository<District, Long>{
	@Query("select d from District d where d.region.idRegion =:x") 
	public List<District> findparid_region(@Param("x") Long idRegion);
	public District findByCodeDistrict(String codeDistrict);
}

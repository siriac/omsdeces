package org.sinares.dao;

import java.util.List;

import org.sinares.entities.Aire_de_Sante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IASRepository extends JpaRepository<Aire_de_Sante, Long>{
	@Query("select a from Aire_de_Sante a where a.district.idDistrict =:x")
	public List<Aire_de_Sante> getASbyDistric(@Param("x")Long idDistrict);
}

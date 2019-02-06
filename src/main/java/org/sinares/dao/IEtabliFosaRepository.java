package org.sinares.dao;

import java.util.Collection;
import java.util.List;

import org.sinares.entities.Etablissement_FOSA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEtabliFosaRepository extends JpaRepository<Etablissement_FOSA, Long>{
	@Query("select e from Etablissement_FOSA e where e.district.idDistrict =:x") 
	public List<Etablissement_FOSA> findByDistrict(@Param("x") Long idDistrict);
}

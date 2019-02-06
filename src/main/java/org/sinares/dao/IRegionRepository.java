package org.sinares.dao;

import org.sinares.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegionRepository extends JpaRepository<Region, Long>{
	Region findByNomRegion(String nomRegion);

}

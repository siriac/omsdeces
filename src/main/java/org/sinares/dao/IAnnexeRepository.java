package org.sinares.dao;

import java.util.List;

import org.sinares.entities.Annexe_2;
import org.sinares.entities.Maladie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IAnnexeRepository extends JpaRepository<Annexe_2, Long>{

	

}

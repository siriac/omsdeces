package org.sinares.dao;

import java.util.List;

import org.sinares.entities.Maladie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMaladieRepository extends JpaRepository<Maladie, Long>{
	public List<Maladie> findByidMaladie(Long idMaladie);

}

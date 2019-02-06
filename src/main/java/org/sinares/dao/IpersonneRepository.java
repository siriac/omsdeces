package org.sinares.dao;

import org.sinares.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IpersonneRepository extends JpaRepository<Personne, Long>{

}

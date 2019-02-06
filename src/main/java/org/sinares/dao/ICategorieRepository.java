package org.sinares.dao;

import org.sinares.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategorieRepository extends JpaRepository<Categorie, Long> {

}

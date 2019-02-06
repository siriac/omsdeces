package org.sinares.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
public class Personne implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idPersonne;
private String nomPersonne;
private String sexe;
private String poste;
public Long getIdPersonne() {
	return idPersonne;
}
public void setIdPersonne(Long idPersonne) {
	this.idPersonne = idPersonne;
}
public String getNomPersonne() {
	return nomPersonne;
}
public void setNomPersonne(String nomPersonne) {
	this.nomPersonne = nomPersonne;
}
public String getSexe() {
	return sexe;
}
public void setSexe(String sexe) {
	this.sexe = sexe;
}

public String getPoste() {
	return poste;
}
public void setPoste(String poste) {
	this.poste = poste;
}
public Personne() {
	super();
	// TODO Auto-generated constructor stub
}
public Personne(String nomPersonne, String sexe, String poste) {
	super();
	this.nomPersonne = nomPersonne;
	this.sexe = sexe;
	this.poste = poste;
}

}

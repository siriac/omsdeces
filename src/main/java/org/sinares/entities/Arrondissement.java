package org.sinares.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Arrondissement implements Serializable{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idArrondissement;
private String nomArrondissement;
@ManyToOne
@JoinColumn(name="idDepartement")
private Departement departement;
public Long getIdArrondissement() {
	return idArrondissement;
}
public void setIdArrondissement(Long idArrondissement) {
	this.idArrondissement = idArrondissement;
}
public String getNomArrondissement() {
	return nomArrondissement;
}
public void setNomArrondissement(String nomArrondissement) {
	this.nomArrondissement = nomArrondissement;
}
public Departement getDepartement() {
	return departement;
}
public void setDepartement(Departement departement) {
	this.departement = departement;
}
public Arrondissement() {
	super();
	// TODO Auto-generated constructor stub
}
public Arrondissement(Long idArrondissement, String nomArrondissement, Departement departement) {
	super();
	this.idArrondissement = idArrondissement;
	this.nomArrondissement = nomArrondissement;
	this.departement = departement;
}

}

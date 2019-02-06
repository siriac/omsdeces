package org.sinares.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Departement implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idDepartement;
private String nomDepartement;
@OneToMany(mappedBy="departement" ,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
private Collection<Arrondissement> arrondissements;
@ManyToOne
@JoinColumn(name="idRegion")
private Region region;
public Long getIdDepartement() {
	return idDepartement;
}
public void setIdDepartement(Long idDepartement) {
	this.idDepartement = idDepartement;
}
public String getNomDepartement() {
	return nomDepartement;
}
public void setNomDepartement(String nomDepartement) {
	this.nomDepartement = nomDepartement;
}
public Collection<Arrondissement> getArrondissements() {
	return arrondissements;
}
public void setArrondissements(Collection<Arrondissement> arrondissements) {
	this.arrondissements = arrondissements;
}
public Departement() {
	super();
	// TODO Auto-generated constructor stub
}
public Departement(Long idDepartement, String nomDepartement) {
	super();
	this.idDepartement = idDepartement;
	this.nomDepartement = nomDepartement;
}

}

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
public class Aire_de_Sante implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long idAS;
private String nomAS;
private String codeAS;
@ManyToOne
@JoinColumn(name="idDistrict")
private District district;
public Long getIdAS() {
	return idAS;
}
public void setIdAS(Long idAS) {
	this.idAS = idAS;
}
public String getNomAS() {
	return nomAS;
}
public void setNomAS(String nomAS) {
	this.nomAS = nomAS;
}
public String getCodeAS() {
	return codeAS;
}
public void setCodeAS(String codeAS) {
	this.codeAS = codeAS;
}

public District getDistrict() {
	return district;
}
public void setDistrict(District district) {
	this.district = district;
}
public Aire_de_Sante() {
	super();
	// TODO Auto-generated constructor stub
}
public Aire_de_Sante(String nomAS, String codeAS, District district) {
	super();
	this.nomAS = nomAS;
	this.codeAS = codeAS;
	this.district = district;
}


}

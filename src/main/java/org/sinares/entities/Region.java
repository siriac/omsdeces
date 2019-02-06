package org.sinares.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Region implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idRegion;
	private String nomRegion;
	private String codeRegion;
	@OneToMany(mappedBy="region" ,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<District> districts;
	public Long getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(Long idRegion) {
		this.idRegion = idRegion;
	}
	public String getNomRegion() {
		return nomRegion;
	}
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	public String getCodeRegion() {
		return codeRegion;
	}
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}
	@JsonIgnore
	@XmlTransient
	public Collection<District> getDistricts() {
		return districts;
	}
	public void setDistricts(Collection<District> districts) {
		this.districts = districts;
	}
	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Region(String nomRegion, String codeRegion) {
		super();
		this.nomRegion = nomRegion;
		this.codeRegion = codeRegion;
	}

}

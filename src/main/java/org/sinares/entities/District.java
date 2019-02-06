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
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class District implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDistrict;
	private String nomDistrict;
	private String codeDistrict;
	@ManyToOne
	@JoinColumn(name="idRegion")
	private Region region;
	@OneToMany(mappedBy="district" ,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<Aire_de_Sante> aire_de_Santes;
	@OneToMany(mappedBy="district" ,fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<Etablissement_FOSA> etablissement_FOSAs;
	public Long getIdDistrict() {
		return idDistrict;
	}
	public void setIdDistrict(Long idDistrict) {
		this.idDistrict = idDistrict;
	}
	public String getNomDistrict() {
		return nomDistrict;
	}
	public void setNomDistrict(String nomDistrict) {
		this.nomDistrict = nomDistrict;
	}
	public String getCodeDistrict() {
		return codeDistrict;
	}
	public void setCodeDistrict(String codeDistrict) {
		this.codeDistrict = codeDistrict;
	}
	
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	@JsonIgnore
	@XmlTransient
	public Collection<Aire_de_Sante> getAire_de_Santes() {
		return aire_de_Santes;
	}
	public void setAire_de_Santes(Collection<Aire_de_Sante> aire_de_Santes) {
		this.aire_de_Santes = aire_de_Santes;
	}
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}
	public District(String nomDistrict, String codeDistrict, Region region) {
		super();
		this.nomDistrict = nomDistrict;
		this.codeDistrict = codeDistrict;
		this.region = region;
	}
	
	

}

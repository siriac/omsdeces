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
public class Etablissement_FOSA implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEtabFOSA;
	private String nomEtabFOSA;
	@ManyToOne
	@JoinColumn(name="idDistrict")
	private District district;
	public Long getIdEtabFOSA() {
		return idEtabFOSA;
	}
	public void setIdEtabFOSA(Long idEtabFOSA) {
		this.idEtabFOSA = idEtabFOSA;
	}
	public String getNomEtabFOSA() {
		return nomEtabFOSA;
	}
	public void setNomEtabFOSA(String nomEtabFOSA) {
		this.nomEtabFOSA = nomEtabFOSA;
	}
	public Etablissement_FOSA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etablissement_FOSA(String nomEtabFOSA) {
		super();
		this.nomEtabFOSA = nomEtabFOSA;
	}
	

}

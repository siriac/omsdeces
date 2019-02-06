package org.sinares.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Annexe_2 implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAnnexe_2;
	private String region;
	private String district;
	private String categorie;
	private String numIden;
	private String lieuDeces;
	private String dateDeces;
	private String aire_sante;
	private String dateSignature;
	private String personneNotifie;
	private String responsableFOSA;
	private String responsableAS;
	private String chefDistrict;
	private boolean hemorragie_ante_partum;
	private boolean hemorragie_du_post_partum;
	private boolean hematome_retro_plaacentaire;
	private boolean rupture_uterine;
	private boolean anomalie;
	private boolean pre_eclampsie;
	private boolean avortement_septique;
	private boolean embolie_amniotique;
	private boolean maladie_cardio_vasculaire;
	private boolean vihSida;
	private boolean anemies_severes;
	private boolean autre_circonstance;
	private boolean eclampsie;
	private boolean paludisme;
	/*@ManyToOne
	@JoinColumn(name="idCauses_deces")
	private Causes_deces causes_deces;
	public Long getIdAnnexe_2() {
		return idAnnexe_2;
	}*/
	public void setIdAnnexe_2(Long idAnnexe_2) {
		this.idAnnexe_2 = idAnnexe_2;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getNumIden() {
		return numIden;
	}
	public void setNumIden(String numIden) {
		this.numIden = numIden;
	}
	public String getLieuDeces() {
		return lieuDeces;
	}
	public void setLieuDeces(String lieuDeces) {
		this.lieuDeces = lieuDeces;
	}
	public String getDateDeces() {
		return dateDeces;
	}
	public void setDateDeces(String dateDeces) {
		this.dateDeces = dateDeces;
	}
	
	public String getAire_sante() {
		return aire_sante;
	}
	public void setAire_sante(String aire_sante) {
		this.aire_sante = aire_sante;
	}
	public String getDateSignature() {
		return dateSignature;
	}
	public void setDateSignature(String dateSignature) {
		this.dateSignature = dateSignature;
	}
	public String getPersonneNotifie() {
		return personneNotifie;
	}
	public void setPersonneNotifie(String personneNotifie) {
		this.personneNotifie = personneNotifie;
	}
	public String getResponsableFOSA() {
		return responsableFOSA;
	}
	public void setResponsableFOSA(String responsableFOSA) {
		this.responsableFOSA = responsableFOSA;
	}
	public String getResponsableAS() {
		return responsableAS;
	}
	public void setResponsableAS(String responsableAS) {
		this.responsableAS = responsableAS;
	}
	public String getChefDistrict() {
		return chefDistrict;
	}
	public void setChefDistrict(String chefDistrict) {
		this.chefDistrict = chefDistrict;
	}
	
	/*@JsonIgnore
	@XmlTransient
	public Causes_deces getCauses_deces() {
		return causes_deces;
	}
	public void setCauses_deces(Causes_deces causes_deces) {
		this.causes_deces = causes_deces;
	}*/
	
	public boolean isHemorragie_ante_partum() {
		return hemorragie_ante_partum;
	}
	public void setHemorragie_ante_partum(boolean hemorragie_ante_partum) {
		this.hemorragie_ante_partum = hemorragie_ante_partum;
	}
	public boolean isHemorragie_du_post_partum() {
		return hemorragie_du_post_partum;
	}
	public void setHemorragie_du_post_partum(boolean hemorragie_du_post_partum) {
		this.hemorragie_du_post_partum = hemorragie_du_post_partum;
	}
	public boolean isHematome_retro_plaacentaire() {
		return hematome_retro_plaacentaire;
	}
	public void setHematome_retro_plaacentaire(boolean hematome_retro_plaacentaire) {
		this.hematome_retro_plaacentaire = hematome_retro_plaacentaire;
	}
	public boolean isRupture_uterine() {
		return rupture_uterine;
	}
	public void setRupture_uterine(boolean rupture_uterine) {
		this.rupture_uterine = rupture_uterine;
	}
	public boolean isAnomalie() {
		return anomalie;
	}
	public void setAnomalie(boolean anomalie) {
		this.anomalie = anomalie;
	}
	public boolean isPre_eclampsie() {
		return pre_eclampsie;
	}
	public void setPre_eclampsie(boolean pre_eclampsie) {
		this.pre_eclampsie = pre_eclampsie;
	}
	public boolean isAvortement_septique() {
		return avortement_septique;
	}
	public void setAvortement_septique(boolean avortement_septique) {
		this.avortement_septique = avortement_septique;
	}
	
	public boolean isEmbolie_amniotique() {
		return embolie_amniotique;
	}
	public void setEmbolie_amniotique(boolean embolie_amniotique) {
		this.embolie_amniotique = embolie_amniotique;
	}
	public boolean isMaladie_cardio_vasculaire() {
		return maladie_cardio_vasculaire;
	}
	public void setMaladie_cardio_vasculaire(boolean maladie_cardio_vasculaire) {
		this.maladie_cardio_vasculaire = maladie_cardio_vasculaire;
	}
	public boolean isVihSida() {
		return vihSida;
	}
	public void setVihSida(boolean vihSida) {
		this.vihSida = vihSida;
	}
	public boolean isAnemies_severes() {
		return anemies_severes;
	}
	public void setAnemies_severes(boolean anemies_severes) {
		this.anemies_severes = anemies_severes;
	}
	public Long getIdAnnexe_2() {
		return idAnnexe_2;
	}
	
	public boolean isAutre_circonstance() {
		return autre_circonstance;
	}
	public void setAutre_circonstance(boolean autre_circonstance) {
		this.autre_circonstance = autre_circonstance;
	}
	
	public boolean isEclampsie() {
		return eclampsie;
	}
	public void setEclampsie(boolean eclampsie) {
		this.eclampsie = eclampsie;
	}
	public boolean isPaludisme() {
		return paludisme;
	}
	public void setPaludisme(boolean paludisme) {
		this.paludisme = paludisme;
	}
	public Annexe_2() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*public Annexe_2(String region, String district, String numIden, String lieuDeces, String dateDeces,
			String causeDeces, String dateSignature, String personneNotifie, String responsableFOSA,
			String responsableAS, String chefDistrict) {
		super();
		this.region = region;
		this.district = district;
		this.numIden = numIden;
		this.lieuDeces = lieuDeces;
		this.dateDeces = dateDeces;
		this.causeDeces = causeDeces;
		this.dateSignature = dateSignature;
		this.personneNotifie = personneNotifie;
		this.responsableFOSA = responsableFOSA;
		this.responsableAS = responsableAS;
		this.chefDistrict = chefDistrict;
		
	}*/
	public Annexe_2(String region, String district, String categorie, String numIden, String lieuDeces,
			String dateDeces, String aire_sante, String dateSignature, String personneNotifie, String responsableFOSA,
			String responsableAS, String chefDistrict, boolean hemorragie_ante_partum,
			boolean hemorragie_du_post_partum, boolean hematome_retro_plaacentaire, boolean rupture_uterine,
			boolean anomalie, boolean pre_eclampsie, boolean avortement_septique, boolean embolie_amniotique,
			boolean maladie_cardio_vasculaire, boolean vihSida, boolean anemies_severes, boolean autre_circonstance,
			boolean eclampsie, boolean paludisme) {
		super();
		this.region = region;
		this.district = district;
		this.categorie = categorie;
		this.numIden = numIden;
		this.lieuDeces = lieuDeces;
		this.dateDeces = dateDeces;
		this.aire_sante = aire_sante;
		this.dateSignature = dateSignature;
		this.personneNotifie = personneNotifie;
		this.responsableFOSA = responsableFOSA;
		this.responsableAS = responsableAS;
		this.chefDistrict = chefDistrict;
		this.hemorragie_ante_partum = hemorragie_ante_partum;
		this.hemorragie_du_post_partum = hemorragie_du_post_partum;
		this.hematome_retro_plaacentaire = hematome_retro_plaacentaire;
		this.rupture_uterine = rupture_uterine;
		this.anomalie = anomalie;
		this.pre_eclampsie = pre_eclampsie;
		this.avortement_septique = avortement_septique;
		this.embolie_amniotique = embolie_amniotique;
		this.maladie_cardio_vasculaire = maladie_cardio_vasculaire;
		this.vihSida = vihSida;
		this.anemies_severes = anemies_severes;
		this.autre_circonstance = autre_circonstance;
		this.eclampsie = eclampsie;
		this.paludisme = paludisme;
	}
	
	
}

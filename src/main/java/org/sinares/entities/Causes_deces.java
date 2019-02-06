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
public class Causes_deces implements Serializable{
	
private Long idCause_deces;
private boolean hemorragie_ante_partum;
private boolean hemorragie_du_post_partum;
private boolean hematome_retro_plaacentaire;
private boolean rupture_uterine;
private boolean anomalie;
private boolean pre_eclampsie;
private boolean avortement_septique;
private boolean Embolie_amniotique;
private boolean maladie_cardio_vasculaire;
private boolean vihSida;
private boolean anemies_severes;
private Collection<Annexe_2> deces;
public Long getIdCause_deces() {
	return idCause_deces;
}
public void setIdCause_deces(Long idCause_deces) {
	this.idCause_deces = idCause_deces;
}
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
	return Embolie_amniotique;
}
public void setEmbolie_amniotique(boolean embolie_amniotique) {
	Embolie_amniotique = embolie_amniotique;
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
public Collection<Annexe_2> getDeces() {
	return deces;
}
public void setDeces(Collection<Annexe_2> deces) {
	this.deces = deces;
}
public Causes_deces() {
	super();
	// TODO Auto-generated constructor stub
}
public Causes_deces(Long idCause_deces, boolean hemorragie_ante_partum, boolean hemorragie_du_post_partum,
		boolean hematome_retro_plaacentaire, boolean rupture_uterine, boolean anomalie, boolean pre_eclampsie,
		boolean avortement_septique, boolean embolie_amniotique, boolean maladie_cardio_vasculaire, boolean vihSida,
		boolean anemies_severes) {
	super();
	this.idCause_deces = idCause_deces;
	this.hemorragie_ante_partum = hemorragie_ante_partum;
	this.hemorragie_du_post_partum = hemorragie_du_post_partum;
	this.hematome_retro_plaacentaire = hematome_retro_plaacentaire;
	this.rupture_uterine = rupture_uterine;
	this.anomalie = anomalie;
	this.pre_eclampsie = pre_eclampsie;
	this.avortement_septique = avortement_septique;
	Embolie_amniotique = embolie_amniotique;
	this.maladie_cardio_vasculaire = maladie_cardio_vasculaire;
	this.vihSida = vihSida;
	this.anemies_severes = anemies_severes;
}


}
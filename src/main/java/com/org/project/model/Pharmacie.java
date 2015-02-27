package com.org.project.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The persistent class for the pharmacie database table.
 * 
 */
@Entity
public class Pharmacie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	private String adresse;

	private double latitude;

	private double longitude;
    @Column(unique=true)
	private String nom;

	private String telephone;
	

	public Pharmacie() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
	

	@Override
	public String toString() {
		return "Pharmacie [id=" + id + ",telephone=" + telephone + ", nom=" + nom
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", adresse=" + adresse + "]";
	};

}
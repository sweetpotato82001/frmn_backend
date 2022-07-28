package com.example.demo.model.nageur;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="nageur")
public class Nageur {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String prenom;
	private String sexe;
	@Temporal(value=TemporalType.DATE)
    @JsonFormat(pattern="MM-dd-yyyy")
	private Date dateNaissance;
	private String nationalite;
	private String civilite;
	private String lieu_de_naissance;
	private String responsable;
	private String adresse;
	private String supplement_adresse;
	private String zip;
	private String localite;
	private String telephone;
	private String fax;
	private String federation;
	private String club;
	@Temporal(value=TemporalType.DATE)
    @JsonFormat(pattern="MM-dd-yyyy")
	private Date obliteration;
	private String licence;
	private String type_licence1;
	private String type_licence2;
	private String type_licence3;
	@Temporal(value=TemporalType.DATE)
    @JsonFormat(pattern="MM-dd-yyyy")
	private Date depot;
	private boolean sportive=false;
	private boolean synchro=false;
	private boolean water_polo=false;
	private boolean plongeon=false;
	private boolean dirigeant=false;
	private boolean maitre=false;
	private boolean eau_libre=false;
	private String medecin;
	@Temporal(value=TemporalType.DATE)
    @JsonFormat(pattern="MM-dd-yyyy")
	private Date derniere_visite;
	private String observation;	
	
	
	public Nageur() {}

	public Nageur(String nom, String prenom, String sexe, Date date_naissance, String nationalite, String civilite,
			String lieu_de_naissance, String responsable, String adresse, String supplement_adresse, String zip,
			String localite, String telephone, String fax, String federation, String club, Date obliteration,
			String licence, String type_licence1, String type_licence2, String type_licence3, Date depot,
			boolean sportive, boolean synchro, boolean water_polo, boolean plongeon, boolean dirigeant, boolean maitre,
			boolean eau_libre, String medecin, Date derniere_visite, String observation) {
		super();
		this.nom = nom;
		
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = date_naissance;
		this.nationalite = nationalite;
		this.civilite = civilite;
		this.lieu_de_naissance = lieu_de_naissance;
		this.responsable = responsable;
		this.adresse = adresse;
		this.supplement_adresse = supplement_adresse;
		this.zip = zip;
		this.localite = localite;
		this.telephone = telephone;
		this.fax = fax;
		this.federation = federation;
		this.club = club;
		this.obliteration = obliteration;
		this.licence = licence;
		this.type_licence1 = type_licence1;
		this.type_licence2 = type_licence2;
		this.type_licence3 = type_licence3;
		this.depot = depot;
		this.sportive = sportive;
		this.synchro = synchro;
		this.water_polo = water_polo;
		this.plongeon = plongeon;
		this.dirigeant = dirigeant;
		this.maitre = maitre;
		this.eau_libre = eau_libre;
		this.medecin = medecin;
		this.derniere_visite = derniere_visite;
		this.observation = observation;
	}
	
	
}

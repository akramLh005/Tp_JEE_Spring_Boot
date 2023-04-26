package com.example.tp_2.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;

@Entity
@Table( name = "Departement")
public class Departement {
	@Id
	private int idd ; 
	private String nom; 
	private speciality Speciality ;
	

	@ManyToOne
	University univ;
	@ManyToMany
	private java.util.List<Enseignant> e;
	@OneToMany
	private java.util.List<Etudiant> et;
	
	
	public int getIdd() {
		return idd;
	}
	public void setIdd(int idd) {
		this.idd = idd;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public speciality getSpeciality() {
		return Speciality;
	}
	public void setSpeciality(speciality speciality) {
		Speciality = speciality;
	}  

	
	
}

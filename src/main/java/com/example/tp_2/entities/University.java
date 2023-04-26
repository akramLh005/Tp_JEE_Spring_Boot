package com.example.tp_2.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity

public class University implements Serializable  {
	@Id

private int id ; 
private String nom ; 
private String address ;

@OneToMany
private List<Departement> d;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
} 

}

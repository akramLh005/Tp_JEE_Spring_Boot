package com.example.tp_2.entities;

import javax.persistence.Column; import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity


public class Enseignant implements Serializable {

@Id

@GeneratedValue (strategy = GenerationType.IDENTITY)

@Column(name="EMPL_ID")

private int id; // Clé primaire

@ManyToMany
private List<Departement> dd;


@Column(name="EMPL_NAME")

private String name;

// Constructeur et accesseurs (getters) et mutateurs (setters)


}

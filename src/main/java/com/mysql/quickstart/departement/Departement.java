package com.mysql.quickstart.departement;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.mysql.quickstart.employe.Employe;


@Entity(name = "dept")
public class Departement {

	@Id private String nd;
	private String nom;
	private String ville;
	private String nbemp;
	@OneToMany private Collection<Employe> employes;
	
	
	// constructor
	public Departement() {
		
	}


	public Departement(String nd, String nom, String ville, String nbemp, Collection<Employe> employes) {
		this.nd = nd;
		this.nom = nom;
		this.ville = ville;
		this.nbemp = nbemp;
		this.employes = employes;
	}


	
	// getters and setters
	public String getNd() {
		return nd;
	}


	public void setNd(String nd) {
		this.nd = nd;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getNbemp() {
		return nbemp;
	}


	public void setNbemp(String nbemp) {
		this.nbemp = nbemp;
	}


	public Collection<Employe> getEmployes() {
		return employes;
	}


	public void setEmployes(Collection<Employe> employes) {
		this.employes = employes;
	}
		
}

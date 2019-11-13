package com.mysql.quickstart.employe;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "emp")
public class Employe {

	// fields
	@Id private int ne;
	private String nom;
	private String job;
	private Date datemb; // TODO : afficher un format date
	private String sal;
	private String comm;
	private int nd;
	private int neChef;
	

	// consructors
	public Employe() {
		
	}
	
	
	public Employe(int ne, String nom, String job, Date datEmb, String sal, String comm, int nd, int neChef) {
		this.ne = ne;
		this.nom = nom;
		this.job = job;
		this.datemb = datEmb;
		this.sal = sal;
		this.comm = comm;
		this.nd = nd;
		this.neChef = neChef;
	}


	// Getters and Setters
	public int getNe() {
		return ne;
	}


	public void setNe(int ne) {
		this.ne = ne;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public Date getDatEmb() {
		return datemb;
	}


	public void setDatEmb(Date datEmb) {
		this.datemb = datEmb;
	}


	public String getSal() {
		return sal;
	}


	public void setSal(String sal) {
		this.sal = sal;
	}


	public String getComm() {
		return comm;
	}


	public void setComm(String comm) {
		this.comm = comm;
	}


	public int getNd() {
		return nd;
	}


	public void setNd(int nd) {
		this.nd = nd;
	}


	public int getNeChef() {
		return neChef;
	}


	public void setNeChef(int neChef) {
		this.neChef = neChef;
	}
		
}

package com.inti.model;

public class Produit {

	private String code;
	private String libelle;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Produit() {
		super();
	}
	public Produit(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	
	
}

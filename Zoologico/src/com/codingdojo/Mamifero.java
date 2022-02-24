package com.codingdojo;

public class Mamifero {
	
	private int nivelDeEnergia;
	
	public Mamifero() {
		this.nivelDeEnergia = 300;
	}
	
	public Mamifero(int nivelDeEnergia) {
		this.nivelDeEnergia = nivelDeEnergia;
	}
	
	public int getNivelDeEnergia() {
		return nivelDeEnergia;
	}

	public void setNivelDeEnergia(int nivelDeEnergia) {
		this.nivelDeEnergia = nivelDeEnergia;
	}

	public String mostrarEnergia() {
		
		return "Energia : " + this.nivelDeEnergia;
		
	}
}

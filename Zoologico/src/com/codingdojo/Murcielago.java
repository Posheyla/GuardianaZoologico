package com.codingdojo;

public class Murcielago extends Mamifero{

	public Murcielago() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean volar(){
		if (getNivelDeEnergia()>0) {
			System.out.println("Zuuuuum!");
			setNivelDeEnergia(getNivelDeEnergia()-50);
			return true;
		}
		else {
			return false;
		}
	}
	public boolean comerHumanos() {
		if (getNivelDeEnergia()<300) {
			System.out.println("Murcielago comio humano");
			setNivelDeEnergia(getNivelDeEnergia()+25);
			return true;
		}
		else {
			return false;
		}
	}
	public boolean atacarPueblos() {
		if (getNivelDeEnergia()>0) {
			System.out.println("Murcielago atacó pueblo");
			setNivelDeEnergia(getNivelDeEnergia()-100);
			return true;
		}
		else {
			return false;
		}
	}

}

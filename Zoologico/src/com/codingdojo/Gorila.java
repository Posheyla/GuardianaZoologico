package com.codingdojo;

public class Gorila extends Mamifero{

	public Gorila(int nivelDeEnergia) {
		super(nivelDeEnergia);
		// TODO Auto-generated constructor stub
	}
	
	public boolean lanzarAlgo() {
		if (getNivelDeEnergia()>0) {
			System.out.println("El gorila lanzo algo");
			setNivelDeEnergia(getNivelDeEnergia()-5);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean comerBananas() {
		if (getNivelDeEnergia()<=100) {
			System.out.println("Yummy yummy");
			setNivelDeEnergia(getNivelDeEnergia()+5);
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean escalar() {
		if (getNivelDeEnergia()>0) {
			System.out.println("El gorila ha trepado un arbol");
			setNivelDeEnergia(getNivelDeEnergia()-10);
			return true;
		}
		else {
			return false;
		}
	}
	
}

package com.codingdojo;

public class TestGorila {
	public static void main (String [] args) {
		Gorila donkeyKong = new Gorila(100);
		Murcielago murcielago1 = new Murcielago();
		
		donkeyKong.lanzarAlgo();
		donkeyKong.lanzarAlgo();
		donkeyKong.lanzarAlgo();
		donkeyKong.comerBananas();
		donkeyKong.comerBananas();
		donkeyKong.escalar();
		System.out.println(donkeyKong.mostrarEnergia());
		
		murcielago1.atacarPueblos();
		murcielago1.atacarPueblos();
		murcielago1.atacarPueblos();
		murcielago1.comerHumanos();
		murcielago1.comerHumanos();
		murcielago1.volar();
		murcielago1.volar();
		System.out.println(murcielago1.mostrarEnergia());
		
	}
}

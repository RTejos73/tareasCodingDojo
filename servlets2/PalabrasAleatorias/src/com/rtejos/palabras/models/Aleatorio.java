package com.rtejos.palabras.models;

import java.util.concurrent.ThreadLocalRandom;

public class Aleatorio {

	private String palabraAleatoria;
	
	
	public Aleatorio() {
		
	}


	public String creaPalabra() {
		
		String cadena = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String aleatoria = "";
		int longitud = 15;
		for(int i=0; i<longitud; i++) {
			int indice = ThreadLocalRandom.current().nextInt(0,cadena.length()-1);
			char carac1 = cadena.charAt(indice);
			aleatoria += carac1;
		}
		
		return aleatoria;
	}
	
	
	public String getPalabraAleatoria() {
		return palabraAleatoria;
	}


	public void setPalabraAleatoria(String palabraAleatoria) {
		this.palabraAleatoria = palabraAleatoria;
	}
	
	
	
	
	
	
	
}

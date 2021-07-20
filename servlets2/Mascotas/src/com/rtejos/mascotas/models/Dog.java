package com.rtejos.mascotas.models;

public class Dog extends Animal implements Pet{

	@Override 
	public String showAffection() {
		String resp = "";
		if(getWeight() >= 1 && getWeight() < 30) {
			resp = "happend into your lap and cuddied you";
		}else if (getWeight() >= 30) {
			resp = "have them curl up next to you.";
		} else {
			resp = "empyti";
		}
		
		return resp;
		
	}
	
}

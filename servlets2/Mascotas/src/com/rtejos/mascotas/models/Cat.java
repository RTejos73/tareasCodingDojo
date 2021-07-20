package com.rtejos.mascotas.models;

public class Cat extends Animal implements Pet {

	@Override
	public String showAffection() {
		return "looked at you with some affection. You thik.";
	}
	
}

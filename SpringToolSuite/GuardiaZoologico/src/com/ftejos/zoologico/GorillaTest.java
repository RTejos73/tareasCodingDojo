package com.ftejos.zoologico;

public class GorillaTest {

	public static void main(String[] args) {
		
		Gorilla gori1 = new Gorilla();
		Gorilla gori2 = new Gorilla();
		int actual;
		
		gori1.throwSomething();
		gori1.throwSomething();
		gori1.eatBananas();
		gori1.throwSomething();
		gori1.climb();
		gori1.eatBananas();
		
		actual = gori1.displayEnergy();
		System.out.println(actual + "\n");
		
				
		
		gori2.throwSomething();
		gori2.throwSomething();
		gori2.eatBananas();
		gori2.throwSomething();
		gori2.climb();
		gori2.eatBananas();
	
		actual = gori2.displayEnergy();
		System.out.println(actual + "\n");
	}

}

package com.rtejos.zoologico2;
//import com.rtejos.zoologico.*;



public class BatTest{

	public static void main(String[] args) {
		
		Bat bat1 = new Bat();
		int actual;
		
		
		
		bat1.fly();
		bat1.fly();
		bat1.eatHumans();
		bat1.attackTown();
		bat1.attackTown();
		bat1.eatHumans();
		bat1.attackTown();
		
		
		actual = bat1.displayEnergy();
		System.out.println(actual + "\n");
		
		
	}

}

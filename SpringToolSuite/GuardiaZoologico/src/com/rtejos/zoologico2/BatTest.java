package com.rtejos.zoologico2;
//import com.rtejos.zoologico.*;



public class BatTest{

	public static void main(String[] args) {
		
		Bat bat1 = new Bat();
		
		System.out.println(bat1.displayEnergy() + "\n");
		
		bat1.fly();
		bat1.fly();
		bat1.eatHumans();
		bat1.attackTown();
		bat1.attackTown();
		bat1.eatHumans();
		bat1.attackTown();	
		System.out.println(bat1.displayEnergy() + "\n");
	}

}

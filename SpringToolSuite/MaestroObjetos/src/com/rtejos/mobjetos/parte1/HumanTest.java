package com.rtejos.mobjetos.parte1;

import com.rtejos.mobjetos.parte2.*;

public class HumanTest {

	public static void main(String[] args) {
		
		 Human human1 = new Human();
		 Human human2 = new Human();
		
		Wizard wi = new Wizard();
		
		wi.fireBall(human1);
		wi.heal(human1);
		
		Ninja n1 = new Ninja();
		Ninja n2 = new Ninja();
		
		System.out.println(n1.getHealth());
		System.out.println(n2.getHealth());
		n1.steal(n2);
		System.out.println(n1.getHealth());
		System.out.println(n2.getHealth());
		n1.runAway();
		n1.runAway();
		n1.runAway();
		System.out.println(n1.getHealth());
		
		
		Samurai samurai1 = new Samurai();
		Samurai samurai2 = new Samurai();
		System.out.println(samurai1.howMany());
		System.out.println(samurai2.howMany());
		Samurai samurai3 = new Samurai();
		System.out.println(samurai3.howMany());
		
		human1.attack(human2);
		human1.attack(human2);
		human1.attack(human2);
		human1.attack(human2);
		human1.attack(human2);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human2.attack(human1);
		human1.displayHealth();
		human2.displayHealth();
		
		
		
		
		

	}

}

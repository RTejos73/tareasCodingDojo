package com.rtejos.moparte1;

import javax.swing.JOptionPane;

public class HumanTest {
	public static String atacante, atacado;
	public static int strengthAtacante, vidaatacado;

	public static void main(String[] args) {
		
		Wizard w1 = new Wizard("Wizard");
		Ninja n1 = new Ninja("Ninja");
		Samurai s1 = new Samurai("Samurai");
		
		/*
		int op=0;
        String menu="";
        do{
            menu="";
            menu+="****** Men� ******\n";
            menu+="1.- Mostrar mensaje 1 \n";
            menu+="2.- Mostrar mensaje 2 \n";
            menu+="3.- Salir \n";
            menu+="Elia una opci�n";
            op=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op){
            case 1:
                JOptionPane.showMessageDialog(null, "Programar es f�cil en TutosPOO");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Recuerda esto... Un programa no tiene que quedar bien en la primera vez... Pero si la �ltima");
                break;    
            }
        }while(op!=3);
        */
		
		
		
		
		int seleccion1 = JOptionPane.showOptionDialog(
				   null,
				   "Seleccione Huamno Atacante", 
				   "Selector de opciones",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null,    // para un icono
				   new Object[] { "Wizard", "Ninja", "Samurai" },   // null para YES, NO y CANCEL
				   "opcion 1");
		
		int seleccion2 = JOptionPane.showOptionDialog(
				   null,
				   "Seleccione Huamno Atacado", 
				   "Selector de opciones",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   null,    // para un icono
				   new Object[] { "Wizard", "Ninja", "Samurai" },   // null para YES, NO y CANCEL
				   "opcion 1");

		switch (seleccion1) {
			case 0 : 
					atacante = w1.name;
					strengthAtacante = w1.strength;
					switch (seleccion2) {
					case 0:
							atacado = w1.name;
							w1.attack(strengthAtacante);
							vidaatacado = w1.health;
							break;
					case 1:
							atacado = n1.name;
							n1.attack(strengthAtacante);
							vidaatacado = n1.health;
							break;
					case 2:
							atacado = s1.name;
							s1.attack(strengthAtacante);
							vidaatacado = s1.health;
							break;
					}
					break;
			case 1 :
					atacante = n1.name;
					strengthAtacante = n1.strength;
					switch (seleccion2) {
					case 0:
							atacado = w1.name;
							w1.attack(strengthAtacante);
							vidaatacado = w1.health;
							break;
					case 1:
							atacado = n1.name;
							n1.attack(strengthAtacante);
							vidaatacado = n1.health;
							break;
					case 2:
							atacado = s1.name;
							s1.attack(strengthAtacante);
							vidaatacado = s1.health;
							break;
					}				
					break;
			case 2 : 
					atacante = s1.name;
					strengthAtacante = s1.strength;
					switch (seleccion2) {
					case 0:
							atacado = w1.name;
							w1.attack(strengthAtacante);
							vidaatacado = w1.health;
							break;
					case 1:
							atacado = n1.name;
							n1.attack(strengthAtacante);
							vidaatacado = n1.health;
							break;
					case 2:
							atacado = s1.name;
							s1.attack(strengthAtacante);
							vidaatacado = s1.health;
							break;
					}				
					break;		
		
		}
		
				
		
		
		
//		int actual1, actual2, actual3;
//		actual1 = w1.dispalyHealth();
//		//System.out.println("la salud es de " + actual1);
//		actual2 = n1.dispalyHealth();
//		//System.out.println("la salud es de " + actual2);
//		actual3 = s1.dispalyHealth();
//		//System.out.println("la salud es de " + actual3);
		
	//	int dcto = w1.strength;
	//	int actual = s1.attack(dcto);
		System.out.println(atacante + " ha atacado a " + atacado);
		System.out.println("La vida de " + atacado + " es de " + vidaatacado);

	}

}

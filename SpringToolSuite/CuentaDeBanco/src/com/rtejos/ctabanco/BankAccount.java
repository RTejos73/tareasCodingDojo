package com.rtejos.ctabanco;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class BankAccount {
	
	private String numberOfAccount;
	private double currentAccountBalance;    //saldo cta cte
	private double savingsAccountBalance;    //saldo cta ahorro
	public static int numberOfAccountBalance=0;		// para contar las cuentas creadas
	public static double ammountAccountBalance=0;	//	rastrear cant dinero en cada cta creada
	
	public BankAccount() {
		numberOfAccount = createAccount();
		numberOfAccountBalance++;
		currentAccountBalance = 0;
		savingsAccountBalance = 0;
	}
	
	
	public String getNumberOfAccount() {
		return numberOfAccount;
	}


	public double getCurrentAccountBalance() {
		return currentAccountBalance;
	}


	public double getSavingsAccountBalance() {
		return savingsAccountBalance;
	}
	
	
	public void setCurrentAccountBalance(double currentAccountBalance) {
		this.currentAccountBalance += currentAccountBalance;
	}


	public void setSavingsAccountBalance(double savingsAccountBalance) {
		this.savingsAccountBalance += savingsAccountBalance;
	}


	private String createAccount() {
		String cadena = "1234567890";
		String accountBalance = "";
		int longitud = 10;
		for(int i=0; i<longitud; i++) {
			int indice = ThreadLocalRandom.current().nextInt(0,cadena.length()-1);
			char carac1 = cadena.charAt(indice);
			accountBalance += carac1;
		}
		return accountBalance;
	}
	
	
	public void depositCurrent() {
	
		String menu = "";
		int op = 0;
		int montoDeposito = 0, montoRetiro =0;
		
		do
		{
			menu = "";
			menu += "****** Menú ******\n";
			menu += "1.- Depositar a Cuenta Corriente \n";
			menu += "2.- Depositar a Cuenta de Ahorro \n";
			menu += "3.- Girar desde Cuenta Corriente \n";
			menu += "4.- Girar desde Cuenta de Ahorro \n";
			menu += "5.- Ver Saldo Disponible \n";
			menu += "6.- Salir \n";
			menu += "Elia una opción";
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:	
					String seleccion = JOptionPane.showInputDialog(
						   null,
						   "Ingrese Monto a Depositar en su Cuenta Corriente",
						   JOptionPane.QUESTION_MESSAGE);
					montoDeposito = Integer.parseInt(seleccion);
					setCurrentAccountBalance(montoDeposito);
				
					break;
			case 2:
					String seleccion2 = JOptionPane.showInputDialog(
						   null,
						   "Ingrese Monto a Depositar en su Cuenta de Ahorro",
						   JOptionPane.QUESTION_MESSAGE);
					montoDeposito = Integer.parseInt(seleccion2);
					setSavingsAccountBalance(montoDeposito);
				
					break;
			
			case 3:
					String seleccion3 = JOptionPane.showInputDialog(
						   null,
						   "Ingrese Monto a Retirar de su Cuenta Corriente",
						   JOptionPane.QUESTION_MESSAGE);
					montoRetiro = Integer.parseInt(seleccion3);
					if(getCurrentAccountBalance() > montoRetiro) {
						setCurrentAccountBalance(montoRetiro*-1);
					}else {
						System.out.println("Saldo insuficiente");
					}
					break;
			case 4:
					String seleccion4 = JOptionPane.showInputDialog(
						   null,
						   "Ingrese Monto a Retirar de su Cuenta Corriente",
						   JOptionPane.QUESTION_MESSAGE);
					montoRetiro = Integer.parseInt(seleccion4);
					if(getCurrentAccountBalance() > montoRetiro) {
						setSavingsAccountBalance(montoRetiro*-1);
					}else {
						System.out.println("Saldo insuficiente");
					}
					setSavingsAccountBalance(montoRetiro*-1);
					break;
			case 5:
				System.out.println("Su saldo en la Cta Cte es de " +getCurrentAccountBalance());
				System.out.println("Su Saldo en la Cta de Ahorro es de " +getSavingsAccountBalance());
				break;
			}
			
		}while(op != 6);
	}















	
	
	
	
	
}

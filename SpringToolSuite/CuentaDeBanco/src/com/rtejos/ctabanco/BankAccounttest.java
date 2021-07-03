package com.rtejos.ctabanco;

public class BankAccounttest {
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		
		String cta = ba.getNumberOfAccount();
		System.out.println(cta);
	//	System.out.println(ba.getCurrentAccountBalance());
		
		ba.depositCurrent();
		System.out.println(ba.getCurrentAccountBalance());
	
	}
	

}

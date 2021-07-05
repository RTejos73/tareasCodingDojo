package com.rtejos.telefonos;

public class IPhone extends Phone implements Ringable {
	
	
	// estos metodos los hereda de Phone por ser una clase abstracta
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);		
	}

	@Override
	public void displayInfo() {		
		System.out.println("iPhone " + super.getVersionNumber() + " from " + super.getCarrier());		
	}
	
	
	// estos metodos los hereda de Ringable por ser una interface
	@Override
	public String ring() {
		String retorno = "iPhone " + super.getVersionNumber() + " says " + super.getRingTone();
		return retorno;
	}
	
	
	@Override
	public String unlock() {	
		return "Unlocking via faciel recognition";		
	}
	
}

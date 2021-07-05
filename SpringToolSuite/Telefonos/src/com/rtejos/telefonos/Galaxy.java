package com.rtejos.telefonos;

public class Galaxy extends Phone implements Ringable {
	
	
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);			
	}
	
	
	@Override
	public void displayInfo() {
		System.out.println("Galaxy " + super.getVersionNumber() + " from " + super.getCarrier());
	}

	
	@Override
	public String ring() {
		String retorno = "Galaxy " + super.getVersionNumber() + " says " + super.getRingTone();
		return retorno;
	}

	
	@Override
	public String unlock() {		
		return "Unlocking via finger print";
	}

}

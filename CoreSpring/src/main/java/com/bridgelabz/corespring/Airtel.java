package com.bridgelabz.corespring;

public class Airtel implements Sim {
	
	private	String number;

	public void setNumber(String number) {
		this.number = number;
	}


   
	public Airtel() {
		
	}
    
	public void calling() {
		System.out.println("Airtel sim calling from number "+number);
	}

	public void data() {
		System.out.println("Airtel data "+number);

	}

}

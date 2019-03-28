package com.bridgelabz.corespring;

public class Jio implements Sim {
	private	String number;

	
	public Jio(String number) {
	
		this.number = number;
	}

	public void calling() {
	System.out.println("Jio sim Calling from "+number);

	}

	public void data() {
	System.out.println("Jio data "+number);

	}

}

package com.bridgelabz.corespring.autowire;

public class Human {
//public Human(Heart heart) {
//		
//		this.heart = heart;
//	}
	public Human() {
		// TODO Auto-generated constructor stub
	}
private Heart heart1;


public void setHeart1(Heart heart1) {
	this.heart1 = heart1;
}
public void startPumping()
{
	this.heart1.Pump();
}
}

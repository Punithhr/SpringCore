package com.bridgelabz.corespring;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSim {
public static void main(String[] args) {
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	Sim sim=ctx.getBean("airtel",Airtel.class);
	sim.calling();
ctx.close();
}
}

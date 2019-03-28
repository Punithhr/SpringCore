package com.bridgelabz.corespring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSim {
public static void main(String[] args) {
ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	Sim sim1=(Airtel)ctx.getBean("airtel");
	Sim sim2 =ctx.getBean("jio",Jio.class);
	sim1.calling();
	sim2.data();
	//for scope
	HelloWorld helloObj=ctx.getBean("helloworld",HelloWorld.class);
	helloObj.setName("Punith");
	System.out.println("name is "+helloObj.getName());
	HelloWorld helloObj2=ctx.getBean("helloworld",HelloWorld.class);
	
	System.out.println("New Object is given name is "+helloObj2.getName());
	
	
	
}
}

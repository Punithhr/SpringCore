package com.bridgelabz.corespring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("springs.xml");
	Human human=ctx.getBean("human",Human.class);
	human.startPumping();
	
}
}

package com.bridgelabz.corespring.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {
public static void main(String[] args) {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(CollegeConfig.class);
	College collegeObj=ctx.getBean("college",College.class);
	System.out.println("Object is created");
	collegeObj.test();
}
}

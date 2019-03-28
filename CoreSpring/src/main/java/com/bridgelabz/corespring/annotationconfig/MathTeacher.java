package com.bridgelabz.corespring.annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	public void teach() {
		System.out.println("Solving the Math Problems");

	}

}

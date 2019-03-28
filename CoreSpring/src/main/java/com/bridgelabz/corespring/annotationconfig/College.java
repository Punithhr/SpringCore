package com.bridgelabz.corespring.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class College {
	@Value("${college.name}")
	private String name;
	
private Principal principal;
	
	private Teacher teacher;

/*public College(Principal principal) {
	this.principal = principal;
}*/
	
	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public void test()
	{
		principal.principalInfo();
		teacher.teach();
		System.out.println("College name is "+name);
		System.out.println("Test as been conducted in college");
	}

}

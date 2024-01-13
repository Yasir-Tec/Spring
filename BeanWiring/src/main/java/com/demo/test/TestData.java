package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Address;
import com.demo.model.Employee;
import com.demo.model.MyUser;
import com.demo.model.Person;
import com.demo.model.Student;

public class TestData {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		
		
//		Address addr = (Address) ctx.getBean("addr1");
//		System.out.println(addr);
		
//		Employee emp = (Employee) ctx.getBean("e1");
//		System.out.println(emp);
		
//		Person p = (Person) ctx.getBean("p1");
//		System.out.println(p);
		
		MyUser user1 = (MyUser) ctx.getBean("u2");
		System.out.println(user1);
		
		Student s=(Student)ctx.getBean("st1");
		System.out.println(s);
		
		
	}

}

package com.demo.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestResourceBundling {

	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		int choice=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Marathi\n2.US english\nUk English\n4. France\n choice: ");
		choice=sc.nextInt();
		MessageSource vk = (MessageSource) ctx.getBean("messageSource");
		String m=null,w=null,d=null,c=null;
		Locale locale = null;
		switch(choice) {
		case 1:
			locale = new Locale("marathi","IN");
			System.out.println("language : "+locale.getLanguage()+" Country :"+locale.getCountry());
			break;
		case 2:
			locale = locale.US;
			System.out.println("language : "+locale.getLanguage()+" Country :"+locale.getCountry());
			break;
		case 3:
			locale = locale.UK;
			System.out.println("language : "+locale.getLanguage()+" Country :"+locale.getCountry());
			break;
		case 4:
			locale=Locale.FRANCE;
			System.out.println("language : "+locale.getLanguage()+"----country: "+locale.getCountry());
			break;
		default:
			System.out.println("wrong choice");
		}
		
		m = vk.getMessage("msg.pay", null, locale);
		w = vk.getMessage("msg.welcome",new Object[]{"Kishori"}, locale);
		d = vk.getMessage("msg.data",null, locale);
		c = vk.getMessage("msg.currency",null, locale);
		
		System.out.println("pay: "+m);
		System.out.println("welcome: "+w);
		System.out.println("data : "+d);
		System.out.println("currency: "+ c);

		
	}
}

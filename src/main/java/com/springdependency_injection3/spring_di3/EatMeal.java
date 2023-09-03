package com.springdependency_injection3.spring_di3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EatMeal {

	public static void main(String[] args) {
		/*
		 * System.out.println("Main method started...");
		 * Customer_1 customer_1 = new Customer_1();
		 * customer_1.setDiningHall(new DiningHall());
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Beans.xml loaded...");
		Customer_1 customer1 = context.getBean("customer_1", Customer_1.class);
		customer1.eatFood();
		Customer_2 customer2 = context.getBean("customer_2", Customer_2.class);
		customer2.eatFood();
	}

}

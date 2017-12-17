package com.ivan.practice.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ivan.practice.service.DemoService;

/**
 * Hello world!
 *
 */
public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
				"consumer.xml");

		DemoService demoService = (DemoService) appContext
				.getBean("demoService");

		System.out.println(demoService.sayHello());
	}
}

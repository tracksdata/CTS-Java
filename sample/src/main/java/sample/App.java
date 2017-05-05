package sample;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.service.SomeService;

public class App {

	public static void main(String[] args) {

		// Init
		ConfigurableApplicationContext applicationContext = null;
		applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("-------------------------------------------");
		// Use
		
		SomeService someService=applicationContext.getBean("service1",SomeService.class);
		someService.doService();
		someService.doService();
		someService.doService();

		
		System.out.println("-------------------------------------------");
		// destroy
		applicationContext.close();

	}

}

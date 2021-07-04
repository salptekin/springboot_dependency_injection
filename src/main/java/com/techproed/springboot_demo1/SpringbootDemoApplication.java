package com.techproed.springboot_demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {
	
	/*
	 	As you see, in SpringBoot Object Creation is done in Object Container and the application is created in another part.
	 	This is called "Inversion Of Control" ==> "IOC"
	 	
	 	When you run the application, objects come from Object Container. Object Container is outside the Application, it means
	 	our application is getting sth from outside to inside, this is "Injection". Because of the, this process is called
	 	"Dependency Injection"
	*/

	public static void main(String[] args) {
		
		ConfigurableApplicationContext con = SpringApplication.run(SpringbootDemoApplication.class, args);
		
		/*
		  If you use getBean() method after putting @Component annotation 
		  at the top of the Laptop Class, you will have a single object in SpringBoot
		  container and SpringBoot will use that single object for all objects.
		  
		  This feature is called "Singleton Design Pattern"
		*/
		Laptop l1 = con.getBean(Laptop.class);
		Laptop l2 = con.getBean(Laptop.class);

		/*
		 	If you use "new" keyword to create object
		 	you will create objects in every "new" keyword usage.
		 	It means you will have many objects in the memory, this is not good to save memory area
		*/
//		Laptop l1 = new Laptop();
//		Laptop l2 = new Laptop();
		
		l1.turnOnLaptop();
		l2.turnOnLaptop();
		
		
	}

}

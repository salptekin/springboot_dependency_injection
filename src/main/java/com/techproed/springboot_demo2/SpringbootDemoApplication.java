package com.techproed.springboot_demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {	
		
		ConfigurableApplicationContext con = SpringApplication.run(SpringbootDemoApplication.class, args);
		
		Laptop l1 = con.getBean(Laptop.class);
		//BatteryA bA = con.getBean(BatteryA.class);
		l1.use(con.getBean(BatteryA.class));
		
		Laptop l2 = con.getBean(Laptop.class);
		BatteryB bB = con.getBean(BatteryB.class);
		l2.use(bB);
	
		con.close();
		
	}

}

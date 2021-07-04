package com.techproed.springboot_demo2;

import org.springframework.stereotype.Component;

@Component
public class BatteryB implements BatteryI {

	public int price;
	
	BatteryB(){
		System.out.println("BatteryB is created...");
	}
	
	@Override
	public void use() {
		System.out.println("BatteryB is used...");		
	}

}

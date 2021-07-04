package com.techproed.springboot_demo1;

import org.springframework.stereotype.Component;

@Component("bS")
public class BatteryS {
	
	private String name;
	private int duration;
	
	BatteryS(){
		System.out.println("BatteryS is created...");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public void use() {
		System.out.println("BatterS is used...");
	}
}

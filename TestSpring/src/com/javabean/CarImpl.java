package com.javabean;

import org.springframework.beans.factory.annotation.Value;

public class CarImpl implements Car {
	
	@Override
	public String toString() {
		return "CarImpl [colour=" + colour + ", price=" + price + "]";
	}
	private String colour;
	private String price;
	public String getColour() {
		return colour;
	}
	@Value("blank")
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getPrice() {
		return price;
	}
	@Value("2873468148")
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public void run() {
		System.out.println("run run run");
	}
	@Override
	public void stop() {
		System.out.println("stop stop stop");
	}

}

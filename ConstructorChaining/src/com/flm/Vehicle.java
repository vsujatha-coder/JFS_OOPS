package com.flm;

public class Vehicle {
		int carCapacity;
		String colour="red";
		Vehicle() {
			this(20);
			System.out.println("Car obj created");
		}
		Vehicle(int fuel){
			this("Black");
			this.carCapacity=fuel;
			System.out.println(fuel);
		}
		Vehicle(String colour){
			this.colour=colour;
			System.out.println(colour);
		}
}


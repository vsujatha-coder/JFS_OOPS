package com.flm;

import java.util.Scanner;

public class Circle extends Shape {
	
	
	@Override
	void getArea(Scanner sc) {
		
		System.out.println("Enter radius on circle");
		double radius = sc.nextDouble();
		double area = Math.PI*radius*radius;
		System.out.println("Area of Cicle is : "+area);
		
	}
	
	@Override
	void getPerimeter(Scanner sc) {
		
		System.out.println("Enter radius on circle");
		double radius = sc.nextDouble();
		double perimeter = Math.PI*2*radius;
		System.out.println("Area of Cicle is : "+perimeter);
		
	}

}

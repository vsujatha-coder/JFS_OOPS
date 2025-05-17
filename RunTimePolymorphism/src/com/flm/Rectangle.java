package com.flm;

import java.util.Scanner;

public class Rectangle extends Shape{
	@Override
	void getArea(Scanner sc) {
		System.out.println("Enter length of Rectangle");
		int length = sc.nextInt();
		System.out.println("Enter width of Rectangle");
		int width = sc.nextInt();
		int area = length*width;
		System.out.println("Area of Rectangle is : "+area);
		
	}
	
	@Override
	void getPerimeter(Scanner sc) {
		System.out.println("Enter length of Rectangle");
		int length = sc.nextInt();
		System.out.println("Enter width of Rectangle");
		int width = sc.nextInt();
		int perimeter = 2*(length+width);
		System.out.println("Area of Rectangle is : "+perimeter);
		
	}

}

package com.flm;

import java.util.Scanner;

public class Shape_MainClass {
	
	public static void main(String[] args) {
		Circle circle = new Circle ();
		Rectangle rectangle = new Rectangle();
		
		//Area Calculation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input to calculate area : \n"
				+ "1.Calculate Area and Perimeter of Circle \n"
				+ "2.Calculate Area and Perimeter of Rectangle");
		int areaInput = sc.nextInt();
		switch(areaInput) {
		case 1: circle.getArea(sc);
				circle.getPerimeter(sc);
		break;
		case 2: rectangle.getArea(sc);
				rectangle.getPerimeter(sc);
		break;
		}
		
		
	sc.close();
	}
		
		
		
}



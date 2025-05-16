package com.flm;

import java.util.Scanner;

public class MethodOverLoading {
		
		static void pay(int amount) {
			System.out.println(amount);
		}
		
		static void pay(int amount,int accnum ,Scanner s) {
			System.out.println(amount+","+accnum);
		}
		
		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 
			 
			 System.out.println("enter option: 1 or 2");
			 int option = sc.nextInt();
			 
			 switch(option) {
			 case 1: MethodOverLoading.pay(1000);
			 break;
			 case 2: System.out.println("enter acc num");
			 int accn = sc.nextInt();
			 MethodOverLoading.pay(1000,accn,sc);
			 }
		}

	

}

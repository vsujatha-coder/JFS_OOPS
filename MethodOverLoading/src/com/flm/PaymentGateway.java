package com.flm;

import java.util.Scanner;

public class PaymentGateway {
	
	void Payment(int amount) {
		System.out.println(amount+" has paid via COD. ");
	}
	
	void Payment(int amount,int cardNumber) {
		System.out.println(amount+" has paid via "+cardNumber);
	}
	
	void Payment(int amount,String upiID) {
		System.out.println(amount+" has paid via "+upiID);
	}
	
	void Payment(int amount,int bankAcountNumber,String Password) {
		System.out.println(amount+" has paid via "+bankAcountNumber+" throught internetbanking");
	}
	
	void Payment() {
		System.out.println("payment has done successfully through wallet");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Payment Type \n COD : Option 1 \n using Card : Option 2 \n using upiID : Option 3 \n using netbanking ;Option 4 \n using wallet : Option 5");
		
		int option = sc.nextInt();
		
		PaymentGateway paymentobj = new PaymentGateway();
		
		switch(option) {
		
		case 1: paymentobj.Payment(1000);
		break;
		
		case 2: paymentobj.Payment(1000,123456);
		break;
		
		case 3: paymentobj.Payment(1000,"123@upi");
		break;
		
		case 4: paymentobj.Payment(1000,123456789,"abcD@123");
		break;
		
		case 5: paymentobj.Payment();
		break;
		
		}
		
		sc.close();
	}
	
	

}

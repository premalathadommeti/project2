package com.tns.abstractmethod3;

import java.util.Scanner;

import com.tns.abstractmethod.Accounts;
import com.tns.abstractmethod2.Nonprime;

public class Amazon {
	
	public static void main(String[] args) {
		//TODD Auto-generated method stub
		int amt;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter amount");
	amt=sc.nextInt();
	Accounts a;
	a=new Nonprime(amt);
	a.deliverycharges(amt);
	}

}

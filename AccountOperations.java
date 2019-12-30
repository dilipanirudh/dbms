package utils;

import java.util.Scanner;

public class AccountOperations {
	Account[] accounts = new Account[5];
	public AccountOperations() {
		accounts[0] = new Account(10011, "deloitte", 8000);
		accounts[1] = new Account(10012, "deloitte", 12000);
		accounts[2] = new Account(10013, "deloitte", 15000);
		accounts[3] = new Account(10014, "deloitte", 5000);
		accounts[4] = new Account(10015, "deloitte", 18000);
	}
	void deposit(int acno,double amount){
		Scanner sc=new Scanner(System.in);
		acno=sc.nextInt();
		try{
		if(acno!=10011||acno!=10012||acno!=10013||acno!=10014||acno!=10015)
		{
			throw new EmpNotFoundException();
			
		}
		}
		
	}
	void withdraw(int acno,double amount){
		
	}
	void checkBalance(int acno){
		
	}
}

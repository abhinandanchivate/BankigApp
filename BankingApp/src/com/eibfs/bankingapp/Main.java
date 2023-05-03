package com.eibfs.bankingapp;

import java.time.LocalDate;

import com.eibfs.bankingapp.dto.Account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Account account = new Account(); 
		
		
		// when you will print the ref. then 
		// it will call toString method implicitly.
		account.setAccountNumber("AD001");
		account.setAccountHolderName("abhi");
		account.setAccountType("saving");
		account.setAddress("pune");
		account.setBalance(400);
		account.setContactNumber("9975477764");
		account.setActive(true);
		//account.setAccountCreated(LocalDate.now());
		System.out.println(account);
		System.out.println(account.toString());

	}

}

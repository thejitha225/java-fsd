package com.simplilearn.demo;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Mailvalidation {
	
	public static void main(String[] args) {
		 
		 ArrayList<String> emailID = new ArrayList<String>();
		 
		 emailID.add("thejitha@gmail.com");
		 emailID.add("abhishek@gmail.com");
		 emailID.add("ammu@gmail.com");
		 emailID.add("kanna@gmail.com");
		 emailID.add("itrak3@gmail.com");
		 emailID.add("babi657@gmail.com");
		 emailID.add("jaji25@gmail.com");
		 
		 String searchElement;
		 System.out.println("E-mail: ");
		 Scanner scanner = new Scanner(System.in);
		 searchElement = scanner.nextLine();
		 String regex = "^(.+)@(.+)$";
		 
		 Matcher matcher = Pattern.compile(regex).matcher(searchElement);

		 if (matcher.matches() && emailID.stream().anyMatch(mail ->
mail.equals(searchElement))) {
			 System.out.println(searchElement + " = is present");
		  } 
		 else {
			 System.out.println("Not a valid or is not present");
		 }
	     }
		  
}




package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
	
		int[] birthDate = new int[3];
		
		Scanner sc = new Scanner(System.in); 
		//ask the name
		System.out.println("Your name is: ");
		String name = sc.nextLine(); 
		
		//ask the surname
		System.out.println("Your surname is: ");
		String surname = sc.nextLine();
		
		//ask the favorite color
		System.out.println("Your favorite color is: ");
		String favoriteColor = sc.nextLine(); 
		
		//ask the birth day 
		System.out.println("Your birth year is: ");
		 birthDate[2] = sc.nextInt(); 
		 
		 System.out.println("Your birth month is (number): ");
		 birthDate[1] = sc.nextInt(); 
		 
		 System.out.println("Your birth day is: ");
		 birthDate[0] = sc.nextInt(); 
		 
		 //sum the date
		 int birthDateSum = birthDate[0] + birthDate[1] + birthDate[2];
		 
		 //generate password
		 
		 String password = name + '-' + surname + '-' + favoriteColor + '-' + birthDateSum;
		 System.out.println(password);
		
		
	}
}

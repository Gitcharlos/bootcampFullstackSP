package challenge;

import java.util.Random;
import java.util.Scanner;

public class Randomization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please type Class A or Class B: ");	
		String t = input.nextLine();
		
		Randomization al = new Randomization();
		
		String number = al.random(t);
		
		System.out.println(number);
	}

	public String random(String clasS) {
		
		String numbers = "0123456789";
		String n = "";
		String forPrint = "";
		Random r = new Random();
		
		for (int i=0;i<numbers.length();i++) {
			 char c = numbers.charAt(r.nextInt(numbers.length()));
			 n += c;	
			 
			 if ("Class A".equalsIgnoreCase(clasS)||"a".equalsIgnoreCase(clasS)) {
				 n = "54";
				 for (i=2;i<numbers.length();i++) {
					 c = numbers.charAt(r.nextInt(numbers.length()));
					 n += c;	
					 forPrint = "Class A: " + n;
				 }
			 }
			 
			 else {
			 
				 if ("Class B".equalsIgnoreCase(clasS)||"b".equalsIgnoreCase(clasS)) {
					 n = "08";
					 for (i=2;i<numbers.length();i++) {
						 c = numbers.charAt(r.nextInt(numbers.length()));
						 n += c;
						 forPrint = "Class B: " + n;
					}
				 }
				 
				 else {
					 forPrint = "Undefined Class: " + n;
				 }
			 }
			 
				 
		}	 
		return forPrint;
	}
}


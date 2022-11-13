package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please type Class A or Class B: ");	
		String t = input.nextLine();
		
		Challenge1 al = new Challenge1();
		
		String number = al.random(t);
		
		System.out.println(number);
		
		Scanner inputColor = new Scanner(System.in);
		System.out.println("Please type the color: ");
		String col = inputColor.nextLine();
		
		Challenge1 co = new Challenge1();
		
		boolean r = co.isItIncluded(col);
		
		System.out.println(r);
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
	
	public boolean isItIncluded(String color) {
		
		List<String> colors = new ArrayList<String>();
		colors.add("Purple");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Black");
		colors.add("White");
		colors.add("Red");
		colors.add("Orange");
		
		boolean rr = true;
		int i=0;
		
		while (i<colors.size()) {
			
			String c = colors.get(i);
			i++;
			
			if (c.equalsIgnoreCase(color)) {
				
				rr = false;
				break;
				
			}
				
			else {
				rr = true;
			}
		}
			
		return rr;	
	}
}

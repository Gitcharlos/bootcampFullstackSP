package challenge;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Includes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputColor = new Scanner(System.in);
		System.out.println("Please type the color: ");
		String col = inputColor.nextLine();
		
		Includes co = new Includes();
		
		boolean r = co.isItIncluded(col);
		
		System.out.println(r);
		
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


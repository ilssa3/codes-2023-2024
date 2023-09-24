package zadachi1visrok;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class hotelskastaq {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double cena = 0 ;
		String room = "";
		int days = 0;
		
		System.out.println("For your stay:");
		
		System.out.println("⁕--------------⁕");
		
		System.out.print("Month:");
		String month = sc.next();	
		
		if (month.equals("May")||month.equals("June")||month.equals("July")||month.equals("August")
				||month.equals("September")||month.equals("October")) {
		
		System.out.print("Num of days:");
		days = sc.nextInt();
		
		if (days>0&&days<201)
		{System.out.print("Room type:");
		 room = sc.next();	
		}else System.out.println("Error! Enter the right amount of days!!!");
		}
		
		else System.out.println("Error! Enter the right month!!!");
		
		if (month.equals("May")||month.equals("October")) {
			if (room.equals("Apartment")) {cena = days * 65; }
			else if (room.equals("Studio")) {cena = days * 50;}
			else System.out.println("Error! Enter right room type!!!");
			
					
			if (room.equals("Studio")&&days>14) {cena = cena *0.7;}
			else if (room.equals("Studio")&&days>7) {cena = cena *0.95;}
		}
		
		if (month.equals("June")||month.equals("September")) {
			if (room.equals("Apartment")) {cena = days * 68.70; }
			else if (room.equals("Studio")) {cena = days * 75.20;}
			else System.out.println("Error! Enter right room type!!!");
			
			if (room.equals("Studio")&&days>14) {cena = cena *0.8;}
		}
		
		if (month.equals("July")||month.equals("August")) {
			if (room.equals("Apartment")) {cena = days * 77; }
			else if (room.equals("Studio")) {cena = days * 76;}
			else System.out.println("Error! Enter right room type!!!");
		}
		
		if (room.equals("Apartment")&&days>14) {cena = cena *0.9;}
		
		
		BigDecimal bd = new BigDecimal(cena).setScale(2, RoundingMode.HALF_UP);
		double newNum = bd.doubleValue();
		
		System.out.println("⁕-----------------⁕");
		System.out.println(room +" : "+newNum+" lv.");
	}

}

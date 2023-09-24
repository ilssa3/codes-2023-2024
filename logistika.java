package zadachi1visrok;

import java.util.Scanner;

public class logistika {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int ton;
	double val = 0;
	double all = 0;
	int cMic = 0;
	int cLorry = 0;
	int cTrain = 0;
	
	
	
	System.out.print("Enter loads' num : ");
		int cLoad = sc.nextInt();
		System.out.println("--------------------------------");
	if (cLoad>0&&cLoad<1001) {
		System.out.println("Enter each load's weigth: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for ( int i = 1; i<=cLoad ; i++) {
			
			ton = sc.nextInt() ;
			
			if (ton<=3) {val = ton *200; cMic=cMic+ton;}
			else if (ton <=11) {val = ton*175;cLorry=cLorry+ton;}
			else {val = ton*120;cTrain=cTrain+ton;}
			
			all = all +val;
			
		}
	}else System.out.println("Error!Enter the right amount!");
	double allTons = cMic+cLorry+cTrain;
	double average = all/allTons;
	System.out.println("---------------------------------");
	System.out.println("all Tons : " +allTons);
	System.out.printf("Average value : "+"%.2f",average);
	System.out.println("");
	System.out.println("---------------------------------");
	System.out.println("% w Microbus? : "+ ((cMic/allTons)*100)+"%");
	System.out.println("% w Lorry : "+ ((cLorry/allTons)*100)+"%");
	System.out.println("% w Train : "+ ((cTrain/allTons)*100)+"%");
	}

}

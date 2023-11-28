package Files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UchenikMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Брой ученици :");
		int n = Integer.parseInt(sc.nextLine());
		
		final String fileNameNormal = "normal.txt";
		final String fileNameVeryWell = "veryWell.txt"; //>5
		
		Uchenik [] arrS = new Uchenik [n] ;
			
		for (int i = 0; i<n ; i++) {
			System.out.println("Име и ср.оценка :");
		arrS[i] = new Uchenik(sc.nextLine(),Double.parseDouble(sc.nextLine()));	
		}
		
		for (int i = 0; i<n ; i++) {			
			System.out.println(arrS[i].toString());
		}
		writeToFile(fileNameNormal ,arrS);
		writeVeryWell(fileNameVeryWell,arrS);
		sorting(fileNameNormal,arrS);
	}

	public static void writeToFile(String filename,Uchenik[] arrS) {
	try {	FileWriter fw=new FileWriter(filename);
		PrintWriter pw=new PrintWriter(fw);
		fw.write("Ime  | Ocenka"+"\n");
		fw.write("============="+"\n");
		for(int i=0;i<arrS.length;i++) {
			String text = arrS[i].getName()+" | "+arrS[i].getAverageGrade()+ "\n";
			fw.write(text);
		}
		pw.close();
		fw.close();
	}
	catch(IOException e ) {
		System.out.println("Error!");
		e.printStackTrace();
		}
	}
	
	public static void writeVeryWell(String filename,Uchenik[] arrS) {
	try {	FileWriter fw=new FileWriter(filename);
		PrintWriter pw=new PrintWriter(fw);
		fw.write("Ime  | Ocenka"+"\n");
		fw.write("============="+"\n");
		for(int i=0;i<arrS.length;i++) {
			if(arrS[i].getAverageGrade()>=5.00) {
			String text = arrS[i].getName()+" | "+arrS[i].getAverageGrade()+ "\n";
			fw.write(text);}
			
		}
		pw.close();
		fw.close();
	}
	catch(IOException e ) {
		System.out.println("Error!");
		e.printStackTrace();
		}
	}
	public static void sorting(String filename,Uchenik[] arrS) {
		try { 
		    FileWriter fw=new FileWriter(filename);
		    PrintWriter pw=new PrintWriter(fw);
		    Uchenik swap;
		    
		    for(int i=0;i<arrS.length;i++) {
		        for(int j=1;j<arrS.length-i;j++){
		        if(arrS[j-1].getAverageGrade()>arrS[j].getAverageGrade()) {
		            swap=arrS[j-1];
		            arrS[j-1]=arrS[j];
		            arrS[j]=swap;}
		    }  
		    String text = arrS[i].getName()+" | "+arrS[i].getAverageGrade()+ "\n";
			fw.write(text);
			}
		    pw.close();
			fw.close();
		}	
	
	catch(IOException e ) {
		System.out.println("Error!");
		e.printStackTrace();
		}
	}
}

package br.com.Ex3;

import java.util.Scanner;

public class Ex3while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan = new Scanner(System.in);
		
		int years = 0, contador21 = 0, contador50 = 0;
		
				
		 while(years !=-99) {
			 
			 System.out.println("Digite sua idade: ");
			 years = scan.nextInt();
			 
			 if(years <21 && years != -99 ) {
				 contador21++;
			 }if(years >50 && years != -99) {
			 contador50++;
		
			 }if(years ==-99) {
				 System.out.println("Fim do Programa!");
			
			 }
		 }
		 System.out.println("\nTotal de pessoas com menos de 21 é "+contador21+ " e pessoas com mais de 50 é " +contador50);
		 
		 scan.close();
	}
}
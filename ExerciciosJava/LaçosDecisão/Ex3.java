package br.com.generationExerciciohj;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
		
		int years;
		
		System.out.println("Digite a idade da pessoa: ");
		years = scan.nextInt();
		
		if(years <10) {
			System.out.println("Est� pessoa � categorizada como Beb�.");
		
		}if(years >=10 && years <=14) {
			System.out.println("Est� pessoa � categorizada como Infantil.");
			
		}if(years>=15 && years <=17) {
			System.out.println("Est� pessoa � categorizada como juvenil.");
		}if(years>=18 && years <=25) {
			System.out.println("Est� pessoa � categorizada como Adulto.");
		}else if(years > 25){
			System.out.println("Est� pessoa � categorizada como Pai ou M�e.");
		}
			scan.close();
	}



	}



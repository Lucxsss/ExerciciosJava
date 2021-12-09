package br.com.generation.exercicio02;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System. in);
		
		int dias, meses, anos;
		
		System.out.println("Digite sua idade em Dias: " );
		 dias = leia. nextInt();
		 
		 anos = dias/365;

		 meses = dias/12;
			
		 
		System.out.println
		("Você está vivo à " + anos + " anos, " + meses + " meses e " + dias+ " dias." ); 
		
 leia. close();
			 
	}

}

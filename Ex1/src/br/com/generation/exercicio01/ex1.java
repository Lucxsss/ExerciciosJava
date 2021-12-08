package br.com.generation.exercicio01;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia =  new Scanner(System. in);
		
		int anos, meses, dias;
		int diasAnos, diasMeses, total;
		
		diasAnos = 365;
		diasMeses = 30;
		
		System.out.println("Digite sua idade em... " );
		System.out.println("Anos: " );
		
		anos = leia. nextInt();
		
		System.out.println("Meses" );
meses = leia. nextInt();
		
		System.out.println("Dias" );
dias = leia. nextInt();

		total = ((anos*365)+(meses*30)+dias);
		
		System.out.println("Você está vivo faz "  + total +  " dias! " );	
	}

}

package br.com.matrizevetores.java;

import java.util.Scanner;

public class MatrizeVetores {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		double[]notas =  new double[5];
		double  mp = 0.0;
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite a "+(i+1)+"� pontua��o do aluno: ");
			notas[i] = scan.nextDouble();
			
			if(notas[i] >= mp) {
				mp = notas[i];
				
			}
		}
		for(int i = 0; i <4; i++) {
			System.out.println("A "+(i+1)+"� pontua��o do aluno foi: "+notas[i]);
		}
		
		System.out.println("A maior pontua��o foi: "+mp);
		
		scan.close();
	}
}

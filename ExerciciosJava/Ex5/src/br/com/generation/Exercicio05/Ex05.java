package br.com.generation.Exercicio05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, media;
		double p1 = 0.2, p2 = 0.3, p3 = 0.5;
		
		System.out.println("Digite sua primeira nota: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		n3 = leia.nextDouble();
		
		media = ((n1 * p1 ) + (n2 * p2) + (n3 * p3)) ;
		
		System.out.println("A sua m�dia � " + media);
		
		leia.close();
	}

}

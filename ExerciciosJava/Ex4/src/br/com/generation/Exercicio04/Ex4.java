package br.com.generation.Exercicio04;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, r, s;
		
		System.out.println("Escreva o Valor A: ");
		a = leia.nextInt();
		
		System.out.println("Escreva o Valor B: ");
		b = leia.nextInt();
		
		System.out.println("Escreva o Valor C: ");
		c = leia.nextInt();
		
		r = (int) Math.pow((a+b),2.0);//(a+b)*(a+b);
				
		s = (int) Math.pow((b+c),2.0);//(b+c)*(b+c);
		
		d = (r+s)/2;
		
		System.out.println("O resultado da express�o �: "+d);
		
		leia.close();
	}

}

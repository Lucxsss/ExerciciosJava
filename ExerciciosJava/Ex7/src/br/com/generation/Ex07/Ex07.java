package br.com.generation.Ex07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e1, f;
		double x, y;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = leia.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		e1 = leia.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = leia.nextDouble();
		
		x = (c * e1) - (b * f) / (a * e1) - (b * d);
		
		y = (a * f) - (c * d) / (a * e1) - (b * d);
		
		System.out.println("Resultado de X � : " + x + " e Y � : " + y);
		
		leia.close();
	}

}

package br.com.generationExerciciohj;

import java.util.Scanner;

public class scanner {

	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1, n2,n3;
		
		System.out.println("Digite o primeiro n�mero inteiro: ");
		n1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero inteiro: ");
		n2 = scan.nextInt();
		
		System.out.println("Digite o terceiro n�mero inteiro: ");
		n3 = scan.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O maior n�mero �: "+n1);
		}if(n2>n1 && n2>n3) {
			System.out.println("O maior n�mero �: "+n2);
		}if(n3>n1 && n3>n2) {
			System.out.println("O maior n�mero �: "+n3);
		}else {
			System.out.println("Digite um valor v�lido");
		}
			
		scan.close();
		
	} 
}

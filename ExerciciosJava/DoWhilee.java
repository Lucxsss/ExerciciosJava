package dowhile;

import java.util.Scanner;

public class DoWhilee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Digite um número ");
			num = scan.nextInt();
			
			soma += num;
			}while (num != 0 );
			System.out.println("Sua soma é "+ soma);
		
			
				
			scan.close();
		
	}
}
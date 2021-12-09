package br.com.generation.Ex08;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leia = new Scanner(System.in);
		
		double cusCar, porcentDistr = 0.28, porcentImp = 0.45, t1, t2, t3;
		
		System.out.println("Custo do carro: ");
		cusCar = leia.nextDouble();
		
		t1 = cusCar * porcentDistr;
		t2 = cusCar * porcentImp;
		t3 = cusCar + t1 + t2;
		
		System.out.println("Custo para o consumidor será de R$ " + t3);
		leia.close();
	}

}

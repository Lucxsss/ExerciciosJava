package br.com.generation.Exercicio03;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int evento, horas, min, seg;
		
		System.out.println("Qual o tempo de dura��o do seu evento em Segundos: ");
		evento = leia.nextInt();
		
		horas = evento / 3600;
		min = (evento % 3600) / 60;
		seg = (min % 60);
		
		System.out.println("O evento durou " + horas + " horas, " + min + " minutos, " + seg + " segundos.");
		
		leia.close();
		
	}
	}



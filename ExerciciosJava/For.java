package br.com.generation.repeti�ao;

public class Repeti�aoJava {

	public static void main(String[] args) {
		
		int valor = 0;
		for(int i = 1000 ; i < 2000; i++) {
			if(i%11==5) {
				valor++;
				System.out.println("Este � o �" +valor+": " +i);
			}
		}
		
		
	}
}

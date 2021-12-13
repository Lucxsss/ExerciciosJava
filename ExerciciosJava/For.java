package br.com.generation.repetiçao;

public class RepetiçaoJava {

	public static void main(String[] args) {
		
		int valor = 0;
		for(int i = 1000 ; i < 2000; i++) {
			if(i%11==5) {
				valor++;
				System.out.println("Este é o º" +valor+": " +i);
			}
		}
		
		
	}
}

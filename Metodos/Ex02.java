package br.com.generation.ex01;

public class Ex02 {

	public static void main(String[] args) {
	}	

	//Atributos do avi�o
	private String modelo;
	private String cor;
	private String tipomotor;
	private double alturaMax;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipomotor() {
		return tipomotor;
	}
	public void setTipomotor(String tipomotor) {
		this.tipomotor = tipomotor;
	}
	public double getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(double alturaMax) {
		this.alturaMax = alturaMax;
	}
	
	void permissao() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Seu Avi�o est� apto a entrar no espa�o a�reo Brasileiro.");
	}
	
}

	



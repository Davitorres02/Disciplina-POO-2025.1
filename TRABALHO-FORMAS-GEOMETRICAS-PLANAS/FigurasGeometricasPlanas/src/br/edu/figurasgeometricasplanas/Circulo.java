
package br.edu.figurasgeometricasplanas;

public class Circulo {
	private double raio;
	private double area;
	
	
	public void recebeRaio(double pRaio) {
		raio = pRaio;
	}

	public double retornaRaio() {
		System.out.println("O valor do raio �: "+ raio);
		return raio;
	}

	public void calcArea() {
		double pi = 3.14;
		area = pi * (Math.pow(raio, 2));
	}
	public void mostrarArea() {
		System.out.println("O valor da Ar�a �: "+ area);		
	}
	public double retornaArea() {
		System.out.println("O valor da Ar�a �: "+ area);
		return area; 
	}
	
	public void listaAtributos() {
		System.out.println("Raio: "+raio);
		System.out.println("Ar�a: "+area);
	}
	
}

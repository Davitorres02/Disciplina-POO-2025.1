
package br.edu.figurasgeometricasplanas;

public class Hexagono {
	private double lado;
	private double area;
	
	
	public Hexagono() {
		lado = 0;
		area = 0;
	}
	
	
	public void recebaLado(double lado) {
		this.lado = lado; 
	}
	
	public void calcArea() {
		area = (3 * Math.sqrt(3) * lado * lado) / 2;
	}
	
	public void mostrarArea () {
		System.out.println("A �rea do Hexagono �: " + area);
	}

	public double mostrarAreaComRetorno () {
		System.out.println(area);
		return area;
	}


}



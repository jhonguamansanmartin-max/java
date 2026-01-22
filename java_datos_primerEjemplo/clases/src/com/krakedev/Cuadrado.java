package com.krakedev;

public class Cuadrado {
	public int lado;
	
	public double calcularArea() {
		int area;
		area=lado*lado;
		return area;
	}
	
	public double calcularPerimetro() {
		int Perimetro;
		Perimetro=4*lado;
		return Perimetro;
	}
}

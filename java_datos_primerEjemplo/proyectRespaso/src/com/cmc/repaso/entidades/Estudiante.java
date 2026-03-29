package com.cmc.repaso.entidades;

public class Estudiante {
	
	//atribibutos 
	private String nombre;
	private double nota;
	private String  resultado;
	
	//constructor
	public Estudiante(String nombre) {
		this.nombre=nombre;
	}
	
	//metodo 
	public void calificar(double nota) {
		this.nota=nota;
		if (nota<8) {
			this.resultado = "F"; // Reprobo 
		}else {
			this.resultado = "A";// Aprobo
		}
		
	}
	
	public void MostrarResultado() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Nota : " + nota );
		System.out.println("Resultado: " + resultado);
		
	}
	
	
}

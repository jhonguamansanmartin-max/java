package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante est1 = new Estudiante("Carlos");
		est1.calificar(9.5);
		est1.MostrarResultado();
		
		System.out.println("======================");
		
		Estudiante est2 = new Estudiante ("Jhon");
		est2.calificar(5);
		est2.MostrarResultado();
		
		System.out.println("======================");
		
		Estudiante est3 =  new Estudiante("jazmin");
		est3.calificar(0);
		est3.MostrarResultado();
		
		

	}

}

package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado a=new Cuadrado();
		Cuadrado a1=new Cuadrado();
		Cuadrado a2=new Cuadrado();
		
		Cuadrado p1 =new Cuadrado();
		Cuadrado p2 =new Cuadrado();
		Cuadrado p3 =new Cuadrado();
		
		double cuadrado1;
		double cuadrado2;
		double cuadrado3;
		
		double perimetro;
		double perimetro1;
		double perimetro2;
		a.lado=4;
		a1.lado=2;
		a2.lado=5;
		
		p1.lado=3;
		p2.lado=2;
		p3.lado=4;
		
		System.out.println("---AREA---");
		cuadrado1=a.calcularArea();
		cuadrado2=a1.calcularArea();
		cuadrado3=a2.calcularArea();
		System.out.println("El perimetro es :" + cuadrado1);
		System.out.println("El perimetro es :" + cuadrado2);
		System.out.println("El perimetro es :" + cuadrado3);
		
		System.out.println("---PERIMETRO-----");
		perimetro=p1.calcularPerimetro();
		perimetro1=p2.calcularPerimetro();
		perimetro2=p3.calcularPerimetro();
		
		System.out.println("El perimetro es : " + perimetro);
		System.out.println("El perimetro es : " + perimetro1);
		System.out.println("El perimetro es : " + perimetro2);
	}

}

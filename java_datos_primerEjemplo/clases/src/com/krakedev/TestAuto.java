package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto a1 = new Auto("Chevrolet", 2002 ,1985.34f);
		Auto a2 = new Auto("kia", 1987 ,1000.34f);
	

		
	System.out.println("--Atributos a1--");
		a1.setMarca("chevrolet");   
		a1.setAño(2002);
		a1.setPrecio(1985.10f);
		
		System.out.println("a1.Marca : "+a1.getMarca() );
		
		System.out.println("a1.Año : " +a1.getAño());
		
		System.out.println("a1.precio : "+a1.getPrecio() );
	
		System.out.println("--Atributos a2--");
		a2.setMarca("aveo");   
		a2.setAño(2014);
		a2.setPrecio(1978.10f);	
		
		System.out.println("a2.Marca : "+a2.getMarca());
		
		System.out.println("a2.Año : " +a2.getAño());
		
		System.out.println("a2.precio : "+a2.getPrecio() );
	

	}

}

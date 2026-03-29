package com.cmc.repaso.test;


import com.cmc.repaso.entidades.Productos;


public class TestProducto {

	public static void main(String[] args) {
		Productos p1 =new Productos("Laptop" , -1200);
		p1.mostrarInfo();
		
		System.out.println("");
		
		p1.setPrecio(-500);
		p1.mostrarInfo();
		
		System.out.println("");
		
		double promo = p1.calcularPrecioPromo(10);
		System.out.println("Precio con promo: " + promo);
		
		System.out.println("");
		
		Productos p2 =new Productos("gatore" , 0.50);
		
		p2.setPrecio(450);
		p2.mostrarInfo();
		
		System.out.println();

	}

}

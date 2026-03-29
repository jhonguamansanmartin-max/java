package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {
	 public static void main(String[] args) {
	        // Primer producto
	        Item item1 = new Item("Celular");
	        item1.setProductosActuales(20);
	        item1.imprimir();

	        // Probar vender
	        item1.vender(5);
	        item1.imprimir();

	        // Probar devolver
	        item1.devolver(2);
	        item1.imprimir();

	        // Segundo producto
	        Item item2 = new Item("Laptop");
	        item2.setProductosActuales(15);
	        item2.imprimir();

	        item2.vender(3);
	        item2.imprimir();

	        item2.devolver(1);
	        item2.imprimir();
	    }


}

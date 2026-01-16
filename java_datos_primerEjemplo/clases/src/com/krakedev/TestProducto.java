package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Productos productoA = new Productos();
		Productos productoB = new Productos();
		Productos productoC = new Productos();
		
		System.out.println("----Producto A---");
		productoA.Nombre = "PARACETAMOL" ;
		productoA.Descripcion= "Para uso de la fiebre";
		productoA.Precio =10.45f ;
		productoA.StockActual = 25 ;
		
			System.out.println("nombre : " + productoA.Nombre );
			System.out.println("Descripcion : " + productoA.Descripcion );
			System.out.println("Precio : " + productoA.Precio );
			System.out.println("Stock Actual : " + productoA.StockActual );
		
		System.out.println("----Producto B---");
		productoB.Nombre = "Complejo B" ;
		productoB.Descripcion= "ayuda a la piel";
		productoB.Precio =7.80f ;
		productoB.StockActual = 25 ;
		
		System.out.println("nombre : " + productoB.Nombre );
		System.out.println("Descripcion : " + productoB.Descripcion );
		System.out.println("Precio : " + productoB.Precio );
		System.out.println("Stock Actual : " + productoB.StockActual );
		
		
		System.out.println("----Producto C---");
		productoC.Nombre = "Vitamina 'C' " ;
		productoC.Descripcion= "refuerza las defensas del niños";
		productoC.Precio =5.50f ;
		productoC.StockActual = 25 ;
		
		System.out.println("nombre : " + productoC.Nombre );
		System.out.println("Descripcion : " + productoC.Descripcion );
		System.out.println("Precio : " + productoC.Precio );
		System.out.println("Stock Actual : " + productoC.StockActual );
		
		
		
		
		
	}

}

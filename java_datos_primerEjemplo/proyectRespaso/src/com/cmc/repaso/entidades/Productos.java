package com.cmc.repaso.entidades;

public class Productos {
	//atributos
	private String nombre;
	private double precio;
	
	//contructor
	public  Productos(String nombre, double precio){
		this.nombre=nombre;
		setPrecio(precio);
	}
	
	public void setPrecio(double precio) {
		if (precio<0) {
			this.precio=precio*-1;
		}else {
			this.precio=precio;
		}
	}
		
	public double calcularPrecioPromo(double porcentajeDescuento){
		double descuento = precio * (porcentajeDescuento/100);
		return precio - descuento;
		}
	
	public void mostrarInfo(){
		System.out.println("Nombre: " +nombre);
		System.out.println("precio: " +precio);
	}
	
	

}

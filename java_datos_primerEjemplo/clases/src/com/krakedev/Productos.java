package com.krakedev;

public class Productos {
	private String Nombre;
	private String Descripcion;
	private float Precio;
	private int StockActual;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public float getPrecio() {
		return Precio;
	}
	public void setPrecio(float precio) {
		Precio = precio;
	}
	public int getStockActual() {
		return StockActual;
	}
	public void setStockActual(int stockActual) {
		StockActual = stockActual;
	}
	
}

package com.krakedev;

public class Mensajeria {
	private String mensaje;
	
	public Mensajeria(String mensaje ){
		this.setMensaje(mensaje);
		
	}
	public Mensajeria(){
		
		
	}
	
	public void saludar() {
		System.out.println("hola mundo");
		
	}
	public void saludarAmigo(String nombre,String apellido ) {
			System.out.println("hola " + nombre +" "+apellido);
		}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}

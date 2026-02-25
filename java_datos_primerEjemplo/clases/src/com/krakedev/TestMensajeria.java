package com.krakedev;

public class TestMensajeria {
	public static void main(String[] args) {
		Mensajeria m;
		Mensajeria m1 = new Mensajeria("hoy es lunes ");
		
		System.out.println(m1.getMensaje());
		
		m=new Mensajeria();
		m.saludar();
		m.saludarAmigo("jhon", "guaman");
	}

}

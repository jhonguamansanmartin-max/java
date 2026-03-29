package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidar {

	public static void main(String[] args) {
		Validador validador=new Validador();
		validador.validarEdad(10);
		validador.validarEdad(20);
		validador.validarEdad(30);
		validador.validarEdad(40);
		validador.validarEdad(50);
		validador.validarEdad(12);
		validador.validarEdad(-3);
	}

}

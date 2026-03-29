package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion val = new Validacion();
		
		System.out.println("Monto 100 " + val.ValidarMonto(100));
		System.out.println("Monto 0 " + val.ValidarMonto(0));
		System.out.println("Monto -78 " + val.ValidarMonto(-78));

	}

}

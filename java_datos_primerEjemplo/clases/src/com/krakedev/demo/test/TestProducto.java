package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {
    public static void main(String[] args) {
        // Instanciar un objeto Producto usando el constructor
        Producto prod1 = new Producto(101, "Laptop");

        // Modificar la descripción y el peso
        prod1.setDescripcion("Laptop de alto rendimiento");
        prod1.setPeso(2.5);

        // Mostrar los valores en pantalla
        System.out.println("Código: " + prod1.getCodigo());
        System.out.println("Nombre: " + prod1.getNombre());
        System.out.println("Descripción: " + prod1.getDescripcion());
        System.out.println("Peso: " + prod1.getPeso() + " kg");
    }
}
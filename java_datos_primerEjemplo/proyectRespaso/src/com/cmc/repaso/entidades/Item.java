package com.cmc.repaso.entidades;

public class Item {
    private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    // Constructor opcional
    public Item(String nombre) {
        this.nombre = nombre;
    }

    // Método imprimir
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Productos actuales: " + productosActuales);
        System.out.println("Productos devueltos: " + productosDevueltos);
        System.out.println("Productos vendidos: " + productosVendidos);
    }

    // Método vender
    public void vender(int cantidad) {
        productosActuales -= cantidad;
        productosVendidos += cantidad;
    }

    // Método devolver
    public void devolver(int cantidad) {
        productosActuales += cantidad;
        productosVendidos -= cantidad;
        productosDevueltos += cantidad;
    }

    // Setter para productosActuales
    public void setProductosActuales(int productosActuales) {
        this.productosActuales = productosActuales;
    }
}

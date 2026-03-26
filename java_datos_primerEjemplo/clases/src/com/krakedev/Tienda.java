package com.krakedev;

public class Tienda {
    
    // Atributos
    String nombreTienda;
    String[] productos;
    int totalProductos;
    
    // Constructor
    public Tienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
        this.productos = new String[10];
        this.totalProductos = 0;
    }
    
    // Métodos
    public void registrarProducto(String nombre) {
        productos[totalProductos] = nombre;
        totalProductos++;
        System.out.println("Producto registrado: " + nombre);
    }
    
    public void buscarProducto(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < totalProductos; i++) {
            if (productos[i].equals(nombre)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Encontrado: " + nombre);
        } else {
            System.out.println("No encontrado: " + nombre);
        }
    }
    
    public void generarReporte() {
        System.out.println("Tienda: " + nombreTienda);
        System.out.println("Total de productos registrados: " + totalProductos);
        System.out.println("Catálogo de productos:");
        for (int i = 0; i < totalProductos; i++) {
            System.out.println((i + 1) + ". " + productos[i]);
        }
    }
}

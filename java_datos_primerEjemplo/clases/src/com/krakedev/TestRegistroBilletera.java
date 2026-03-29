package com.krakedev;


/**
 * Clase de prueba para RegistroBilletera
 * 
 * Demuestra el uso correcto de la clase RegistroBilletera con diferentes
 * escenarios de prueba.
 * 
 * @author AnthonyCh05
 * @version 1.0
 */
public class TestRegistroBilletera {
    
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE REGISTRO DE BILLETERAS ===\n");
        
        // Prueba 1: Crear registro y agregar billeteras
        pruebaRegistroBasico();
        
        // Prueba 2: Búsqueda de cuentas
        pruebaBusquedaCuentas();
        
        // Prueba 3: Validación de capacidad máxima
        pruebaCapacidadMaxima();
        
        // Prueba 4: Manejo de errores
        pruebaManejoErrores();
    }
    
    /**
     * Prueba básica de registro de billeteras
     */
    private static void pruebaRegistroBasico() {
        System.out.println("\n--- PRUEBA 1: Registro Básico ---");
        
        RegistroBilletera registro = new RegistroBilletera("Banco Pichincha");
        
        // Registrar varias billeteras
        registro.registrarBilletera("1234567890", "Juan Pérez");
        registro.registrarBilletera("0987654321", "María González");
        registro.registrarBilletera("1122334455", "Carlos Rodríguez");
        
        // Mostrar registro completo
        registro.mostrarRegistro();
    }
    
    /**
     * Prueba de búsqueda de cuentas
     */
    private static void pruebaBusquedaCuentas() {
        System.out.println("\n--- PRUEBA 2: Búsqueda de Cuentas ---");
        
        RegistroBilletera registro = new RegistroBilletera("Banco Guayaquil");
        
        registro.registrarBilletera("1111111111", "Ana Torres");
        registro.registrarBilletera("2222222222", "Luis Morales");
        registro.registrarBilletera("3333333333", "Elena Castro");
        
        // Buscar cuentas existentes
        System.out.println("\nBúsqueda de cuenta existente:");
        registro.buscarCuenta("2222222222");
        
        // Buscar cuenta no existente
        System.out.println("\nBúsqueda de cuenta inexistente:");
        registro.buscarCuenta("9999999999");
    }
    
    /**
     * Prueba de capacidad máxima
     */
    private static void pruebaCapacidadMaxima() {
        System.out.println("\n--- PRUEBA 3: Capacidad Máxima ---");
        
        RegistroBilletera registro = new RegistroBilletera("Banco Internacional");
        
        System.out.println("Registrando 10 billeteras (capacidad máxima)...\n");
        
        // Llenar el registro hasta la capacidad máxima
        for (int i = 1; i <= 10; i++) {
            String cuenta = String.format("100000000%d", i);
            String propietario = "Cliente " + i;
            registro.registrarBilletera(cuenta, propietario);
        }
        
        System.out.println("\nIntentando agregar una billetera más (debe fallar):");
        boolean exito = registro.registrarBilletera("9999999999", "Cliente Extra");
        
        if (!exito) {
            System.out.println("Como se esperaba, no se pudo agregar más billeteras.");
        }
        
        // Mostrar información del registro
        System.out.println("\nEstado del registro:");
        System.out.println("Total registros: " + registro.getTotalRegistros());
        System.out.println("Está lleno: " + registro.estaLleno());
    }
    
    /**
     * Prueba de manejo de errores y validaciones
     */
    private static void pruebaManejoErrores() {
        System.out.println("\n--- PRUEBA 4: Manejo de Errores ---");
        
        try {
            // Intento de crear registro con nombre nulo
            System.out.println("Intentando crear registro con nombre null:");
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado correctamente: " + e.getMessage());
        }
        
        try {
            // Intento de crear registro con nombre vacío
            System.out.println("\nIntentando crear registro con nombre vacío:");
            RegistroBilletera registroVacio = new RegistroBilletera("   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado correctamente: " + e.getMessage());
        }
        
        RegistroBilletera registro = new RegistroBilletera("Banco Test");
        
        try {
            // Intento de registrar cuenta nula
            System.out.println("\nIntentando registrar cuenta null:");
            registro.registrarBilletera(null, "Propietario");
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado correctamente: " + e.getMessage());
        }
        
        try {
            // Intento de registrar propietario nulo
            System.out.println("\nIntentando registrar propietario null:");
            registro.registrarBilletera("1234567890", null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado correctamente: " + e.getMessage());
        }
        
        // Registrar una cuenta válida
        registro.registrarBilletera("1234567890", "Cliente Válido");
        
        // Intentar registrar cuenta duplicada
        System.out.println("\nIntentando registrar cuenta duplicada:");
        registro.registrarBilletera("1234567890", "Otro Cliente");
        
        try {
            // Intento de buscar cuenta nula
            System.out.println("\nIntentando buscar cuenta null:");
            registro.buscarCuenta(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado correctamente: " + e.getMessage());
        }
    }
}
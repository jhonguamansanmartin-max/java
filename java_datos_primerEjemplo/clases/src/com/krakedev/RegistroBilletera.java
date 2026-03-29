package com.krakedev;

public class RegistroBilletera {

	// Constantes

	private static final int CAPACIDAD_MAXIMA = 10;
	private static final String MENSAJE_REGISTRO = "Billetera registrada: ";
	private static final String MENSAJE_ENCONTRADA = "Cuenta encontrada: ";
	private static final String MENSAJE_NO_ENCONTRADA = "Cuenta no encontrada: ";
	private static final String SEPARADOR = " - ";
	private static final String SEPARADOR_PROPIETARIO = " | Propietario: ";

	// Atributos privados

	private final String nombreBanco;
	private final String[] cuentas;
	private final String[] propietarios;
	private int totalRegistros;

	// Constructor registro

	public RegistroBilletera(String nombreBanco) {

		// Validación

		if (nombreBanco == null || nombreBanco.trim().isEmpty()) {
			throw new IllegalArgumentException("El nombre del banco no puede ser null o vacío");
		}

		this.nombreBanco = nombreBanco.trim();
		this.cuentas = new String[CAPACIDAD_MAXIMA];
		this.propietarios = new String[CAPACIDAD_MAXIMA];
		this.totalRegistros = 0;
	}

	// registra un nuevo

	public boolean registrarBilletera(String cuenta, String propietario) {

		// Validación de parámetros

		if (cuenta == null || cuenta.trim().isEmpty()) {
			throw new IllegalArgumentException("La cuenta no puede ser null o vacía");
		}
		if (propietario == null || propietario.trim().isEmpty()) {
			throw new IllegalArgumentException("El propietario no puede ser null o vacío");
		}

		// Verificar capacidad

		if (totalRegistros >= CAPACIDAD_MAXIMA) {
			System.out.println("Error: Capacidad máxima alcanzada (" + CAPACIDAD_MAXIMA + " billeteras)");
			return false;
		}

		// Verificar si la cuenta ya existe (evitar duplicados)
		if (cuentaExiste(cuenta)) {
			System.out.println("Error: La cuenta " + cuenta + " ya está registrada");
			return false;
		}

		// Registrar la billetera
		cuentas[totalRegistros] = cuenta.trim();
		propietarios[totalRegistros] = propietario.trim();
		totalRegistros++;

		// Imprimir confirmación
		System.out.println(MENSAJE_REGISTRO + cuenta.trim() + SEPARADOR + propietario.trim());

		return true;
	}

	// busca

	public boolean buscarCuenta(String cuenta) {

		// Validación

		if (cuenta == null || cuenta.trim().isEmpty()) {
			throw new IllegalArgumentException("La cuenta a buscar no puede ser null o vacía");
		}

		String cuentaBuscar = cuenta.trim();

		// Búsqueda(arreglo)

		for (int i = 0; i < totalRegistros; i++) {
			if (cuentas[i].equals(cuentaBuscar)) {
				System.out.println(MENSAJE_ENCONTRADA + cuentaBuscar + SEPARADOR_PROPIETARIO + propietarios[i]);
				return true;
			}
		}

		// no existe
		System.out.println(MENSAJE_NO_ENCONTRADA + cuentaBuscar);
		return false;
	}

	// registro completo

	public void mostrarRegistro() {
		System.out.println("\n========================================");
		System.out.println("Banco: " + nombreBanco);
		System.out.println("Total de billeteras registradas: " + totalRegistros);
		System.out.println("========================================");

		if (totalRegistros == 0) {
			System.out.println("No hay billeteras registradas.");
		} else {
			for (int i = 0; i < totalRegistros; i++) {
				System.out.println((i + 1) + ". Cuenta: " + cuentas[i] + SEPARADOR_PROPIETARIO + propietarios[i]);
			}
		}

		System.out.println("========================================\n");
	}

	// verifica cuentas(existentes)

	private boolean cuentaExiste(String cuenta) {
		String cuentaVerificar = cuenta.trim();
		for (int i = 0; i < totalRegistros; i++) {
			if (cuentas[i].equals(cuentaVerificar)) {
				return true;
			}
		}
		return false;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public int getTotalRegistros() {
		return totalRegistros;
	}

	public int getCapacidadMaxima() {
		return CAPACIDAD_MAXIMA;
	}

	public boolean estaLleno() {
		return totalRegistros >= CAPACIDAD_MAXIMA;
	}

	public boolean estaVacio() {
		return totalRegistros == 0;
	}
}
package clearminds.cuentas;

public class Cuenta {
    // Atributos privados
    private String id;
    private String tipo;
    private double saldo;

    // Constructor que recibe solo el id
    public Cuenta(String id) {
        this.id = id;
        this.tipo = "A";  // Valor por defecto
        this.saldo = 0.0;  // Valor por defecto
    }

    // Constructor que recibe los tres parámetros
    public Cuenta(String id, String tipo, double saldo) {
        this.id = id;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    // Getters y Setters
    // id solo tiene getter (no se puede modificar)
    public String getId() {
        return id;
    }

    // tipo tiene getter y setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // saldo tiene getter y setter
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método imprimir con formato especificado
    public void imprimir() {
        System.out.println("********************");
        System.out.println("CUENTA");
        System.out.println("********************");
        System.out.println("Número de Cuenta: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Saldo: USD " + saldo);
        System.out.println("********************");
    }

    // Método imprimirConMiEstilo con formato personalizado
    public void imprimirConMiEstilo() {
        System.out.println("╔════════════════════════════╗");
        System.out.println("║   INFORMACIÓN DE CUENTA    ║");
        System.out.println("╠════════════════════════════╣");
        System.out.println("║ ID: " + String.format("%-20s", id) + "║");
        System.out.println("║ Tipo: " + String.format("%-17s", tipo) + "║");
        System.out.println("║ Saldo: USD " + String.format("%-12.2f", saldo) + "║");
        System.out.println("╚════════════════════════════╝");
    }
}
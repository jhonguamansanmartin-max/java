package clearminds.cuentas;



public class CuentaTest {
    public static void main(String[] args) {
        // Creo el objeto Cuenta y lo referencio con cuenta1
        Cuenta cuenta1 = new Cuenta("03476");
        
        // Coloco un valor de saldo en la cuenta1
        cuenta1.setSaldo(675);
        
        // Creo el objeto Cuenta y lo referencio con cuenta2
        Cuenta cuenta2 = new Cuenta("03476", "C", 98);
        
        // Creo el objeto Cuenta y lo referencio con cuenta3
        Cuenta cuenta3 = new Cuenta("03476");
        
        // Modifico el tipo de cuenta
        cuenta3.setTipo("C");
        
        // Imprimo cuenta1, cuenta2 y cuenta3
        System.out.println("--------Valores Iniciales---------");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        
        // Modificar el saldo de la cuenta1 a 444
        cuenta1.setSaldo(444);
        
        // Modificar el saldo de la cuenta3 a 567
        cuenta3.setSaldo(567);
        
        // Modificar el tipo de la cuenta2 a D
        cuenta2.setTipo("D");
        
        // Imprimir los nuevos valores de cuenta1, cuenta2 y cuenta3
        System.out.println("--------Valores modificados---------");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        
        // Crear una cuenta4 utilizando el constructor que recibe el Id de cuenta
        Cuenta cuenta4 = new Cuenta("0987");
        // La cuenta4 ya tiene Tipo: 'A' y Saldo: 0 por defecto
        // Modificar el saldo a 10
        cuenta4.setSaldo(10);
        
        // Crear una cuenta5 utilizando el constructor que recibe los tres parámetros
        Cuenta cuenta5 = new Cuenta("0557", "C", 10);
        // Esta cuenta ya tiene los valores correctos
        
        // Crear una cuenta6 utilizando cualquier constructor
        // Usar constructor con id y modificar atributos con menor código posible
        Cuenta cuenta6 = new Cuenta("0666");
        // Tipo: 'A' y Saldo: 0 ya están establecidos por defecto
        
        // Imprimir los valores de cuenta4, cuenta5 y cuenta6 usando imprimirConMiEstilo
        System.out.println("\n--------Cuentas 4, 5 y 6---------");
        cuenta4.imprimirConMiEstilo();
        cuenta5.imprimirConMiEstilo();
        cuenta6.imprimirConMiEstilo();
    }
}
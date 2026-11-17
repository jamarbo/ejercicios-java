/*
 * Estudia métodos, parámetros, valores de retorno y estructuras repetitivas.
 * Concepto: descomponer un problema en una operación reutilizable y comprobar
 * divisibilidad.
 * Consigna: crea un método que reciba un entero y devuelva si es primo; úsalo
 * para clasificar varios números ingresados.
 */

import java.util.Scanner;

public class EsPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantos numeros vas a ingresar: ");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            scanner.close();
            return;
        }

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (esPrimo(numero)) {
                System.out.println(numero + " es primo.");
            } else {
                System.out.println(numero + " no es primo.");
            }
        }

        scanner.close();
    }

    private static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        int limite = (int) Math.sqrt(numero);
        for (int divisor = 2; divisor <= limite; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}

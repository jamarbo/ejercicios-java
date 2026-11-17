/*
 * Estudia recursividad, caso base y reducción del problema.
 * Concepto: expresar una operación mediante la llamada del método a sí mismo.
 * Consigna: calcula el factorial de un entero entre 0 y 20 mediante un método
 * recursivo y valida la entrada.
 */

import java.util.Scanner;

public class FactorialRecursivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un entero entre 0 y 20: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Entrada invalida: debes ingresar un entero.");
            scanner.close();
            return;
        }

        int numero = scanner.nextInt();
        if (numero < 0 || numero > 20) {
            System.out.println("El numero debe estar entre 0 y 20.");
            scanner.close();
            return;
        }

        System.out.println(numero + "! = " + factorial(numero));
        scanner.close();
    }

    private static long factorial(int numero) {
        if (numero == 0) {
            return 1;
        }
        return numero * factorial(numero - 1);
    }
}

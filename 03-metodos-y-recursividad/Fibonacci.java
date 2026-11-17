/*
 * Estudia métodos, iteración y secuencias numéricas.
 * Concepto: construir la sucesión de Fibonacci a partir de sus términos
 * anteriores.
 * Consigna: muestra los primeros N términos de Fibonacci y evita cálculos
 * innecesarios al generar la secuencia.
 */

/**
 * Fibonacci
 */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Ingresa un numero: ");
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();

        mostrarFibonacci(numero);

    }

    static void mostrarFibonacci(int num) {
        if (num < 1 || num > 93) {
            System.out.println("Ingresa una cantidad entre 1 y 93.");
            return;
        }

        long anterior = 0;
        long actual = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(anterior);
            if (i < num - 1) {
                System.out.print(" ");
                long siguiente = anterior + actual;
                anterior = actual;
                actual = siguiente;
            }
        }
        System.out.println();
    }
}

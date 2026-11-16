/*
 * Estudia índices, recorridos y manipulación de arreglos.
 * Concepto: invertir el orden de los elementos de una colección.
 * Consigna: recibe un arreglo de enteros e invierte sus elementos sin crear
 * otro arreglo del mismo tamaño.
 */

import java.util.Random;

class InvertirArreglo {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        System.out.println("Arreglo Normal:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int temp;

        // invertir arreglo

        for (int i = 0; i < numeros.length / 2; i++) {

            temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;

        }

        System.out.println("Arreglo invertido:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}

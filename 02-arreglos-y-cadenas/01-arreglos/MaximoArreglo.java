/*
 * Estudia arreglos, recorridos y comparaciones.
 * Concepto: búsqueda del valor máximo en una colección de números.
 * Consigna: recibe varios números en un arreglo y determina cuál es el mayor.
 */

import java.util.Scanner;

class MaximoArreglo {

    public static void main(String[] args) {
        int tamano;
        Scanner s = new Scanner(System.in);
        System.out.print("Digita el tamano: ");
        tamano = s.nextInt();
        double[] numeros = new double[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.print("ingresa numero: " + i + " ");
            numeros[i] = s.nextDouble();
        }
        double mayor = numeros[0];
        for (int j = 1; j < tamano; j++) {

            if (numeros[j] > mayor) {
                mayor = numeros[j];
            }

        }
        System.out.println("mayor es: " + mayor);
        s.close();
    }

}
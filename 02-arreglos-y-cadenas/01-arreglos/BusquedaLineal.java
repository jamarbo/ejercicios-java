/*
 * Estudia recorridos secuenciales y banderas booleanas.
 * Concepto: búsqueda lineal en un arreglo.
 * Consigna: solicita un valor y determina si aparece en un arreglo; si aparece,
 * informa la posición de su primera aparición.
 */

import java.util.Scanner;

class BusquedaLineal {

    public static void main(String[] args) {
        int[] numeros = { 45, 20, 30, 12 };
        int numero;
        boolean found = false;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite el numero a buscar: ");
        numero = s.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero) {
                found = true;
                System.out.println("numero " + numero + " encontrado en la posicion " + " " + i);
                break;
            }

        }
        if (found == false)
            System.out.println("no se encontro");

    }

}
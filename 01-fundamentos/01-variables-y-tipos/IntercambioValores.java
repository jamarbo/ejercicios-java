/*
 * Estudia asignación de variables y uso de una variable auxiliar.
 * Concepto: intercambiar valores almacenados en dos variables.
 * Consigna: recibe dos valores, intercámbialos y muestra ambos después del
 * intercambio.
 */

import java.util.Scanner;

class IntercambioValores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, temporal;

        System.out.println("digita el numero a: ");

        a = sc.nextInt();

        System.out.println("digite el numero b: ");

        b = sc.nextInt();

        temporal = a;
        a = b;
        b = temporal;

        System.out.println("Las variables fueron intercambiadas ");
        System.out.println("valor de A: "+a);
        System.out.println("valor de B: "+b);

        sc.close();

    }

}
/*
 * Estudia operadores lógicos y condiciones compuestas.
 * Concepto: aplicar reglas de divisibilidad para clasificar un año.
 * Consigna: lee un año e indica si es bisiesto según las reglas del calendario
 * gregoriano.
 */

import java.util.Scanner;

class AnioBisiesto {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int anio;
        System.out.println("Ingresa el anio: ");
        anio = s.nextInt();

        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0)
            System.out.println("es bisiesto");
        else
            System.out.println("no es bisiesto");
        s.close();
    }
}
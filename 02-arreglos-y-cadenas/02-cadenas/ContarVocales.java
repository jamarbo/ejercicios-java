/*
 * Estudia String, recorrido de caracteres y normalización de texto.
 * Concepto: clasificar y contar caracteres de una cadena.
 * Consigna: lee una frase y cuenta cuántas vocales contiene, sin distinguirú
 * entre mayúsculas y minúsculas.
 */

import java.util.Scanner;

class ContarVocales {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            char minuscula = Character.toLowerCase(caracter);
            if (minuscula == 'a' || minuscula == 'e' || minuscula == 'i' || minuscula == 'o' || minuscula == 'u'
                    || minuscula == 'á' || minuscula == 'é' || minuscula == 'í' || minuscula == 'ó' || minuscula == 'ú')

                contador++;
        }

        System.out.println("Hay " + contador + " Vocales");

        scanner.close();

    }
}
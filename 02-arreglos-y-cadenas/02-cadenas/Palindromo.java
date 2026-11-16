/*
 * Estudia manipulación de cadenas, índices y comparación de caracteres.
 * Concepto: reconocer texto que se lee igual en ambos sentidos.
 * Consigna: determina si una frase es palíndroma ignorando espacios,
 * puntuación, tildes y diferencias entre mayúsculas y minúsculas.
 */

import java.util.Scanner;
import java.util.Locale;

/**
 * Palindromo
 */
public class Palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        String fraseNormalizada = frase.toLowerCase(Locale.ROOT)
                .replace('\u00E1', 'a')
                .replace('\u00E9', 'e')
                .replace('\u00ED', 'i')
                .replace('\u00F3', 'o')
                .replace('\u00FA', 'u')
                .replaceAll("[^\\p{L}\\p{N}]", "");

        int izquierda = 0;
        int derecha = fraseNormalizada.length() - 1;
        boolean flag = true;
        while (izquierda < derecha) {
            char incial = fraseNormalizada.charAt(izquierda);
            char _final = fraseNormalizada.charAt(derecha);

            if (incial == _final) {
                izquierda++;
                derecha--;
            } else {
                flag = false;
                break;
            }

        }

        System.out.println("Frase ingresada: " + frase);
        if (flag) {
            System.out.println("Es palindroma");
        } else {
            System.out.println("No es palindroma");
        }
        scanner.close();
    }
}
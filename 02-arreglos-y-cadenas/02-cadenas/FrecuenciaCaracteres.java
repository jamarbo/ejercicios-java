/*
 * Estudia recorridos de cadenas y conteo de ocurrencias.
 * Concepto: calcular la frecuencia de caracteres en un texto.
 * Consigna: lee una frase e informa cuántas veces aparece cada letra,
 * ignorando mayúsculas y espacios.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FrecuenciaCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        Map<Character, Integer> frecuencias = new HashMap<>();

        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (Character.isLetter(c)) {
                frecuencias.put(c, frecuencias.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entrada : frecuencias.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        scanner.close();
    }
}

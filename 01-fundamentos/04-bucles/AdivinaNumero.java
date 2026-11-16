/*
 * Estudia bucles while, generación de valores aleatorios y condiciones de
 * salida.
 * Concepto: repetir una interacción hasta que se cumpla una condición.
 * Consigna: genera un número secreto dentro de un rango y permite que el
 * usuario intente adivinarlo, indicando si cada intento es mayor o menor.
 */

import java.util.Scanner;

class AdivinaNumero {

    public static void main(String[] args) {
        int adivina = 0;
        int numero = 0;
        adivina = (int) (Math.random() * 100) + 1;
        Scanner n = new Scanner(System.in);
        System.out.println("Adivina el numero entre 1 y 100");
        System.out.println("------------------------------");

        while (true) {

            System.out.print("Digita el numero: ");
            numero = n.nextInt();

            if (numero == adivina) {
                System.out.println("Adivinaste correcto el numero era: " + adivina);
                break;
            } else {
                if (numero < adivina) {
                    System.out.println("El numero es mayor");
                } else
                    System.out.println("El numero es menor");

            }

        }
        n.close();

    }
}
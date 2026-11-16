/*
 * Estudia comparaciones y condiciones encadenadas.
 * Concepto: seleccionar el mayor entre varios valores.
 * Consigna: lee tres números e informa cuál es el mayor, contemplando también
 * que pueda haber valores iguales.
 */

import java.util.Scanner;

class MayorDeTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double primero = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double segundo = scanner.nextDouble();
        System.out.print("Ingresa el tercer número: ");
        double tercero = scanner.nextDouble();

        double mayor;
        if (primero >= segundo && primero >= tercero) {
            mayor = primero;
        } else if (segundo >= primero && segundo >= tercero) {
            mayor = segundo;
        } else {
            mayor = tercero;
        }

        System.out.println("El mayor valor es: " + mayor);
        scanner.close();
    }
}

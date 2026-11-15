/*
 * Estudia variables, tipos numéricos y expresiones aritméticas.
 * Concepto: conversión entre escalas de temperatura.
 * Consigna: lee una temperatura en grados Celsius y muestra su equivalente
 * en Fahrenheit y Kelvin.
 */

import java.util.Scanner;

class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradosCelsius, fahrenheit, kelvin;

        while (true) {
            System.out.println("Digite la temperatura en grados celsius: ");
            if (scanner.hasNextDouble()) {
                gradosCelsius = scanner.nextDouble();
                if (Double.isFinite(gradosCelsius) && gradosCelsius >= -273.15) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Entrada invalida. La entrada debe ser igual o mayor que -273.15 grados celsius");
        }

        fahrenheit = (gradosCelsius * 9.0 / 5.0) + 32.0;
        kelvin = gradosCelsius + 273.15;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        scanner.close();
    }
}
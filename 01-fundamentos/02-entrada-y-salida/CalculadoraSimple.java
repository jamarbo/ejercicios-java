/*
 * Estudia lectura de números y operadores aritméticos.
 * Concepto: realizar operaciones a partir de datos ingresados por el usuario.
 * Consigna: solicita dos números y muestra su suma, resta, multiplicación y
 * división, controlando el caso de división por cero.
 */

import java.util.Scanner;

class CalculadoraSimple {

    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);

        System.out.println("digita a ");
        a = s.nextInt();
        System.out.println("digita b");
        b = s.nextInt();
        int suma = a + b;
        int resta = a - b;
        int producto = a * b;

        System.out.println("suma " + suma);
        System.out.println("resta " + resta);
        System.out.println("multiplicacion " + producto);

        if (b != 0) {
            double division = (double) a / b;
            System.out.println("Division " + division);
        } else {
            System.out.println("No se puede dividir entre cero");
        }

        s.close();
    }

}
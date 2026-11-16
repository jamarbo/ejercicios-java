/*
 * Estudia expresiones booleanas y la estructura condicional if/else.
 * Concepto: determinar una propiedad de un entero usando el operador módulo.
 * Consigna: lee un número entero e informa si es par o impar.
 */

import java.util.Scanner;

class ParOImpar {
    public static void main(String[] args) {
        System.out.println("Digita un numero: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num % 2 == 0)
            System.out.println("es par");
        else
            System.out.println("es impar");
        s.close();
    }
}
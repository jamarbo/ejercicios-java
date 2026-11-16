
/*
 * Estudia bucles for y repetición controlada por contador.
 * Concepto: generar una secuencia de resultados aplicando una operación.
 * Consigna: lee un número y muestra su tabla de multiplicar del 1 al 10.
 */
import java.util.Scanner;

class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite un numero: ");
        int a = s.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(a + " x " + i + " = " + (a * i));

        s.close();

    }

}
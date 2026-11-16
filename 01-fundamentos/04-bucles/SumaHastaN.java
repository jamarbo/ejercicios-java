
/*
 * Estudia bucles y acumuladores.
 * Concepto: combinar una secuencia de enteros mediante una suma acumulada.
 * Consigna: lee un entero positivo N y calcula la suma de todos los enteros
 * desde 1 hasta N.
 */
import java.util.Scanner;

class SumaHastaN {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum = sum + i;
        System.out.println("La suma de todos los numeros hasta " + n + " es igual a " + sum);
        s.close();
    }
}
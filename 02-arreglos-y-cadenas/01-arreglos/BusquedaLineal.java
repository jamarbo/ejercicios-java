/*
 * Estudia índices, recorridos y manipulación de arreglos.
 * Concepto: invertir el orden de los elementos de una colección.
 * Consigna: recibe un arreglo de enteros e invierte sus elementos sin crearece,
 * otro arreglo del mismo tamaño.era aparición.
 */

import java.util.Random;;

class InvertirArreglo {
    public static void main(String[] args) {
    public static void main(String[] args) {
        int[] numeros = new int[10];, 12 };
        Random random = new Random();
        boolean found = false;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);a buscar: ");
        }umero = s.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }       found = true;
                System.out.println("numero " + numero + " encontrado en la posicion " + " " + i);
        int var1 = numeros[1];
        int var2 = numeros[10];
        int temp;
        }
        //invertir arreglo)
        for (int i = 0, j = numeros.length - 1; i < j; i++, j--) {            System.out.println("no se encontro");
            temp = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temp;
        }}        System.out.println("Arreglo invertido:");        for (int i = 0; i < numeros.length; i++) {            System.out.println(numeros[i]);
        }
    }
}

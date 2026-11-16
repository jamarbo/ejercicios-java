/*Concepto:resumir un conjunto de datos mediante una medida estadística
básica.
Consigna:lee una cantidad de notas,guárdalas en un arreglo y muestra el
promedio y cuántas notas están por encima de ese promedio.*/

import java.util.Scanner;

class PromedioNotas {

    public static void main(String[] args) {
        double promedio = 0;
        Scanner s = new Scanner(System.in);
        double nota = 0;
        int i = 0;
        System.out.println("Cuantas notas vas a ingresar: ");
        int tamano = s.nextInt();
        double[] notas = new double[tamano];

        while (true) {

            System.out.print("digita la nota: " + i + " : ");
            notas[i] = s.nextDouble();
            i = i + 1;
            if (i >= tamano) {
                break;
            }

        }

        s.close();

        for (int j = 0; j < tamano; j++) {

            nota = notas[j];
            promedio = promedio + nota;

        }

        promedio = promedio / notas.length;
        int cuantas = 0;

        for (int k = 0; k < tamano; k++)

            if (notas[k] > promedio)
                cuantas++;

        System.out.println("el promedio es " + promedio);
        System.out.println("Hay: " + cuantas + " por encima del promedio");

    }

}
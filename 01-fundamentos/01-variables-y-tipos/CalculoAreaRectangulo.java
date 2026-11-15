/*
 * Estudia declaración de variables y operaciones aritméticas.
 * Concepto: representar medidas y calcular el área de una figura.
 * Consigna: lee el ancho y el alto de un rectángulo y muestra su área y su
 * perímetro.
 */

import java.util.Scanner;

class CalculoAreaRectangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ancho; 
        double area;
        double alto; 
        double perimetro;

        while (true) {
            System.out.println("Digite el ancho del rectangulo");
            if (scanner.hasNextDouble()){
                ancho = scanner.nextDouble();
                if (Double.isFinite(ancho) && ancho > 0 ){
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Entrada invalida. La entrada debe ser un numero mayor que cero.");
        }



        while (true) {
            System.out.println("Digite el alto del rectangulo");
            if (scanner.hasNextDouble()){
                alto = scanner.nextDouble();
                if (Double.isFinite(alto) && alto > 0 ){
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Entrada invalida. La entrada debe ser un numero mayor que cero.");
        }


    area = ancho * alto;
    perimetro =  2 * (ancho + alto);
    System.out.println ("el area del rectangulo es : "+area);
    System.out.println("El perimetro es: "+perimetro);

    scanner.close();


    }       
}

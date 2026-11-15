/*
 * Estudia lectura de datos desde la consola y salida de texto.
 * Concepto: entrada y salida básica de un programa.
 * Consigna: solicita el nombre y la edad de una persona y muestra un saludo
 * que incluya esos datos.
 */
import java.util.Scanner;

class SaludoPersonalizado{

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digita tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Digita la edad: ");
        int edad = sc.nextInt();
        System.out.println("Saludos "+nombre+" tienes "+edad+" anios");  
        sc.close();

    }

}
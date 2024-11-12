package EJERCICIO8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner ingreso = new Scanner(System.in);

        try {
            // Solicitar datos
            System.out.print("Ingrese la velocidad inicial del proyectil en m/s: ");
            double velocidadInicial = Double.parseDouble(ingreso.nextLine()); //convertir a tipo double

            System.out.print("Ingrese el angulo del primer proyectil en grados: ");
            double angulo1 = Double.parseDouble(ingreso.nextLine());    //convertir a tipo double

            System.out.print("Ingrese el angulo del segundo proyectil en grados: ");
            double angulo2 = Double.parseDouble(ingreso.nextLine());    //convertir a tipo double

            //crear nuevo objeto
            PROYECTIL proyectil1 = new PROYECTIL(velocidadInicial, angulo1);
            PROYECTIL proyectil2 = new PROYECTIL(velocidadInicial, angulo2);

            double alcance1 = proyectil1.calcularAlcance();     //llamar a la función calcularAlcance()
            double alcance2 = proyectil2.calcularAlcance();     //llamar a la función calcularAlcance()

            // Mostrar los resultados
            System.out.println("El alcance del primer proyectil (ángulo " + proyectil1.getAngulo() + "°) es: " + alcance1 + " metros.");
            System.out.println("El alcance del segundo proyectil (ángulo " + proyectil2.getAngulo() + "°) es: " + alcance2 + " metros.");


        } catch (NumberFormatException e) {
            System.out.println("Entrada no valida.");

        } finally {
            // Cerrar scanner
            ingreso.close();
        }
    }
}



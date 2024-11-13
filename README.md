
# Manejo de Excepciones y Conversiones y la Aplicación de Principios de POO 

Ejercicio 8
Se disparan dos proyectiles desde el suelo, ambas con velocidad inicial de 20 m/s y ángulos de 50 y 40 grados. ¿Cómo son los alcances de ambos proyectiles?


## Documentation




•	Creación de la clase “PROYECTIL”.

 
•	Creación de la clase “PROYECTIL”.
 

•	Asignación de atributos a la clase “PROYECTIL”.
 

•	Creación del Constructor
 




•	Método getter para obtener el ángulo.
 

•	Método getter para obtener la velocidad inicial.
 

•	Método getter para obtener la velocidad inicial en x.
 

•	Método getter para obtener la velocidad inicial en y.
 

•	Método personalizado para calcular el tiempo de vuelo.
 

•	Método personalizado para calcular el alcance.
 



•	Importación del Scanner.
 

•	Creación de la clase Main y creación del objeto Scanner.
 

•	Solicitar datos al usuario y conversión de datos al tipo double.
 

•	Creación de un objeto de la clase PROYECTIL.
 

•	Llamar a la función calcularAlcance().
 

•	Mostrar los resultados.
 


•	Manejo de la excepción que puede generarse.
 

•	Cerrar el Scaner.
 



Script:

Clase PROYECTIL

package EJERCICIO8;

public class PROYECTIL {

    //Atributos
    double GRAVEDAD = 9.8;
    double PI = 3.1416;
    private double velocidadInicial;
    private double angulo;
    private double vox;
    private double voy;

    // Constructor
    public PROYECTIL(double velocidadInicial, double angulo) {
        this.velocidadInicial = velocidadInicial;
        this.angulo = angulo;
        double anguloRad = Math.toRadians(angulo);
        this.vox = velocidadInicial * Math.cos(anguloRad); // Horizontal
        this.voy = velocidadInicial * Math.sin(anguloRad);  // Vertical
    }

    // Métodos getters

    public double getAngulo() {         // obtener el ángulo
        return angulo;
    }

    public double getVelocidadInicial() {    // obtener la velocidad inicial
        return velocidadInicial;
    }

    public double getVox() {     // obtener la velocidad inicial en x
        return vox;
    }

    public double getVoy() {    // obtener la velocidad inicial en y
        return voy;
    }

    // Metodos personalizados
    public double calcularTiempoVuelo() {
        return (2 * voy) / GRAVEDAD;  // calcular Tiempo vuelo
    }

    public double calcularAlcance() {
        double tiempoVuelo = calcularTiempoVuelo();
        return vox * tiempoVuelo;  // calcular Alcance
    }


}

Clase Main

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







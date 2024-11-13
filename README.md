
# Manejo de Excepciones y Conversiones y la Aplicación de Principios de POO 

Ejercicio 8
Se disparan dos proyectiles desde el suelo, ambas con velocidad inicial de 20 m/s y ángulos de 50 y 40 grados. ¿Cómo son los alcances de ambos proyectiles?



## Documentation




•	Creación de la clase “PROYECTIL”.

![Captura de pantalla 2024-11-12 172736](https://github.com/user-attachments/assets/bec38561-ca48-47d4-9872-1f960c432e0c)
 
•	Asignación de atributos a la clase “PROYECTIL”.
 
![Captura de pantalla 2024-11-12 172754](https://github.com/user-attachments/assets/ffd0282c-ee0c-405c-9640-84e7c1174aa9)

•	Creación del Constructor
 
![Captura de pantalla 2024-11-12 172805](https://github.com/user-attachments/assets/5044af13-24e5-4e11-9ca7-e00d76a8f840)

•	Método getter para obtener el ángulo.

![Captura de pantalla 2024-11-12 172825](https://github.com/user-attachments/assets/c4f52c57-fe08-461e-9ca8-5d358ea9b114)

•	Método getter para obtener la velocidad inicial.

![Captura de pantalla 2024-11-12 172837](https://github.com/user-attachments/assets/decf6772-96b6-4f12-a5b0-d7dd3f728bd2)

•	Método getter para obtener la velocidad inicial en x.

![Captura de pantalla 2024-11-12 172847](https://github.com/user-attachments/assets/ef16fc21-4b46-474b-9490-1a3558fefac2)

•	Método getter para obtener la velocidad inicial en y.

![Captura de pantalla 2024-11-12 172901](https://github.com/user-attachments/assets/c5d14b24-fea2-4788-9100-5310748e3a95)

•	Método personalizado para calcular el tiempo de vuelo.

![Captura de pantalla 2024-11-12 172910](https://github.com/user-attachments/assets/7fa5c662-4cf0-4504-94f0-83bd8494b11b)

•	Método personalizado para calcular el alcance.
 
![Captura de pantalla 2024-11-12 172924](https://github.com/user-attachments/assets/f5a72002-8a9a-47da-a52e-583c63eb39bc)

•	Importación del Scanner.

![Captura de pantalla 2024-11-12 172937](https://github.com/user-attachments/assets/dd263f03-ec02-41cc-a868-6da4d52edcba)

•	Creación de la clase Main y creación del objeto Scanner.

![Captura de pantalla 2024-11-12 172948](https://github.com/user-attachments/assets/f6fedc46-cc56-477d-ae0c-e6b5d6c532d7)

•	Solicitar datos al usuario y conversión de datos al tipo double.

![Captura de pantalla 2024-11-12 173009](https://github.com/user-attachments/assets/9633015a-143c-44ec-9e99-c8bcad83cb80)

•	Creación de un objeto de la clase PROYECTIL.

![Captura de pantalla 2024-11-12 173042](https://github.com/user-attachments/assets/a59294bb-593c-4b23-a835-6341062f54e3)

•	Llamar a la función calcularAlcance().

![Captura de pantalla 2024-11-12 173053](https://github.com/user-attachments/assets/be833b5c-0ba5-4a73-b649-44f04bfa99e0)

•	Mostrar los resultados.

![Captura de pantalla 2024-11-12 173117](https://github.com/user-attachments/assets/b21fe104-d693-408a-a032-15f5bbf648a8)

•	Manejo de la excepción que puede generarse.

![Captura de pantalla 2024-11-12 173138](https://github.com/user-attachments/assets/651283d0-ce89-40a4-9a37-5dbac0710347)

•	Cerrar el Scaner.

![Captura de pantalla 2024-11-12 173147](https://github.com/user-attachments/assets/c925fd77-fd50-4add-8f61-7c9fce92d0d0)


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







package EJERCICIO8;

public class PROYECTIL {

    //Ejercicio 8
    //Se disparan dos proyectiles desde el suelo, ambas con velocidad inicial de 20 m/s
    // y ángulos de 50 y 40 grados. ¿Cómo son los alcances de ambos proyectiles?

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

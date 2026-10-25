
public class ControlVelocidad {
    private double velocidadActual;
    private double velocidadMaximaPermitida;

    public ControlVelocidad(double velocidadMaximaPermitida) {
        if (velocidadMaximaPermitida > 0) {
            this.velocidadMaximaPermitida = velocidadMaximaPermitida;
        } else {
            this.velocidadMaximaPermitida = 120;
            System.out.println("Límite inválido. Se establece en 120 km/h.");
        }

        this.velocidadActual = 0;
    }

    public void acelerar(double incremento) {
        if (incremento > 0 &&
                velocidadActual + incremento <= velocidadMaximaPermitida) {

            velocidadActual = velocidadActual + incremento;
            System.out.println("Aceleración realizada.");
        } else {
            System.out.println("Aceleración no permitida.");
        }
    }

    public void frenar(double decremento) {
        if (decremento <= 0) {
            System.out.println("El decremento debe ser mayor que cero.");
        } else if (decremento >= velocidadActual) {
            velocidadActual = 0;
            System.out.println("El vehículo quedó detenido.");
        } else {
            velocidadActual = velocidadActual - decremento;
            System.out.println("Frenado realizado.");
        }
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }
}


public class Main {
    public static void main(String[] args) {
        ControlVelocidad control = new ControlVelocidad(120);

        System.out.println("Velocidad inicial: "
                + control.getVelocidadActual() + " km/h");

        control.acelerar(100);
        System.out.println("Velocidad actual: "
                + control.getVelocidadActual() + " km/h");

        control.acelerar(30);
        System.out.println("Velocidad actual: "
                + control.getVelocidadActual() + " km/h");

        control.frenar(40);
        System.out.println("Velocidad actual: "
                + control.getVelocidadActual() + " km/h");

        control.frenar(200);
        System.out.println("Velocidad final: "
                + control.getVelocidadActual() + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        ControlVelocidad v1 = new ControlVelocidad(158);

        v1.acelerar(15);
        v1.frenar(80);
        v1.frenar(15);
        v1.acelerar(120);
        System.out.println(v1.getVelocidadActual());
    }
}
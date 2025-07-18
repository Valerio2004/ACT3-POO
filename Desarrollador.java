public class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador(String nombre, double salario, String lenguaje) {
        super(nombre, salario);
        this.lenguaje = lenguaje;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Lenguaje: " + lenguaje);
    }
}

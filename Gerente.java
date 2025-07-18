public class Gerente extends Empleado {
    private int numEmpleadosACargo;

    public Gerente(String nombre, double salario, int numEmpleadosACargo) {
        super(nombre, salario);
        this.numEmpleadosACargo = numEmpleadosACargo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Empleados a cargo: " + numEmpleadosACargo);
    }
}

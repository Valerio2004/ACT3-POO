public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Desarrollador("Ana", 45000, "Java");
        Empleado emp2 = new Gerente("Luis", 60000, 5);

        System.out.println("=== Desarrollador ===");
        emp1.mostrarDatos();

        System.out.println("\n=== Gerente ===");
        emp2.mostrarDatos();
    }
}

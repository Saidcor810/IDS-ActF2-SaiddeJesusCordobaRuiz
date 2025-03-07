

// Clase principal: Empleado
class Empleado {
    // Atributos
    private final String nombre;
    private final int edad;
    private double salario;
    
    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    // Métodos
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
    }
    
    public void aumentarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
        System.out.println("Nuevo salario de " + nombre + ": $" + salario);
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Instanciación de objetos
        Empleado empleado1 = new Empleado("Juan Perez", 30, 25000);
        Empleado empleado2 = new Empleado("Ana Lopez", 28, 27000);
        Empleado empleado3 = new Empleado("Misael Cordoba", 15, 37000);
        // Llamada a métodos
        empleado1.mostrarInformacion();
        empleado1.aumentarSalario(10);
        
        System.out.println("-----------------");
        
        empleado2.mostrarInformacion();
        empleado2.aumentarSalario(5);
        
        System.out.println("-----------------");
        
        empleado3.mostrarInformacion();
        empleado3.aumentarSalario(5);
    }
}

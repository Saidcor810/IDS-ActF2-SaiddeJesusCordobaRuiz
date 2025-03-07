// Clase base: Empleado
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

    // Método para mostrar información del empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
    }

    // Método para aumentar el salario
    public void aumentarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
        System.out.println("Nuevo salario de " + nombre + ": $" + salario);
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Getter para el salario
    public double getSalario() {
        return salario;
    }
}

// Clase derivada: Gerente
class Gerente extends Empleado {
    // Atributo único de Gerente
    private String departamento;

    // Constructor
    public Gerente(String nombre, int edad, double salario, String departamento) {
        // Llama al constructor de la clase base (Empleado)
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    // Método único de Gerente
    public void gestionarProyecto() {
        System.out.println("El gerente " + getNombre() + " esta gestionando un proyecto en el departamento de " + departamento);
    }

    // Sobrescribir el método mostrarInformacion para incluir el departamento
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la clase base
        System.out.println("Departamento: " + departamento);
    }
}

// Clase derivada: Desarrollador
class Desarrollador extends Empleado {
    // Atributo único de Desarrollador
    private final String lenguaje;

    // Constructor
    public Desarrollador(String nombre, int edad, double salario, String lenguaje) {
        // Llama al constructor de la clase base (Empleado)
        super(nombre, edad, salario);
        this.lenguaje = lenguaje;
    }

    // Método único de Desarrollador
    public void escribirCodigo() {
        System.out.println("El desarrollador " + getNombre() + " esta escribiendo codigo en " + lenguaje);
    }

    // Sobrescribir el método mostrarInformacion para incluir el lenguaje
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de la clase base
        System.out.println("Lenguaje de programacion: " + lenguaje);
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Instanciación de objetos
        Empleado empleado1 = new Empleado("Juan Perez", 30, 25000);
        Gerente gerente1 = new Gerente("Ana Lopez", 28, 27000, "Ventas");
        Desarrollador desarrollador1 = new Desarrollador("Misael Cordoba", 15, 37000, "Python");

        // Llamada a métodos para empleado base
        empleado1.mostrarInformacion();
        empleado1.aumentarSalario(10);

        System.out.println("-----------------");

        // Llamada a métodos para gerente
        gerente1.mostrarInformacion();
        gerente1.gestionarProyecto();
        gerente1.aumentarSalario(15);

        System.out.println("-----------------");

        // Llamada a métodos para desarrollador
        desarrollador1.mostrarInformacion();
        desarrollador1.escribirCodigo();
        desarrollador1.aumentarSalario(5);
    }
}
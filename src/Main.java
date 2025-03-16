// Clase abstracta Producto
abstract class Producto {
    // Atributos comunes
    protected String nombre;
    protected double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método abstracto para calcular el precio
    public abstract double calcularPrecio();

    // Método abstracto para mostrar detalles
    public abstract void mostrarDetalles();
}
// Subclase Electrónico
class Electronico extends Producto {
    // Atributo específico
    private final int garantia; // Garantía en meses

    // Constructor
    public Electronico(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    // Implementación del método calcularPrecio
    @Override
    public double calcularPrecio() {
        // Aplicar un impuesto del 10% para productos electrónicos
        return precio * 1.10;
    }

    // Implementación del método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Electronico: " + nombre);
        System.out.println("Precio base: $" + precio);
        System.out.println("Precio con impuesto: $" + calcularPrecio());
        System.out.println("Garantia: " + garantia + " meses");
    }
}
// Subclase Alimento
class Alimento extends Producto {
    // Atributo específico
    private final String caducidad; // Fecha de caducidad

    // Constructor
    public Alimento(String nombre, double precio, String caducidad) {
        super(nombre, precio);
        this.caducidad = caducidad;
    }

    // Implementación del método calcularPrecio
    @Override
    public double calcularPrecio() {
        // No se aplica impuesto a los alimentos
        return precio;
    }

    // Implementación del método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Alimento: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Fecha de caducidad: " + caducidad);
    }
}
// Subclase Ropa
class Ropa extends Producto {
    // Atributo específico
    private final String talla; // Talla de la ropa

    // Constructor
    public Ropa(String nombre, double precio, String talla) {
        super(nombre, precio);
        this.talla = talla;
    }

    // Implementación del método calcularPrecio
    @Override
    public double calcularPrecio() {
        // Aplicar un descuento del 5% para ropa
        return precio * 0.95;
    }

    // Implementación del método mostrarDetalles
    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Ropa: " + nombre);
        System.out.println("Precio base: $" + precio);
        System.out.println("Precio con descuento: $" + calcularPrecio());
        System.out.println("Talla: " + talla);
    }
}
public class Main {
    public static void main(String[] args) {
        // Crear objetos de las subclases
        Producto electronico = new Electronico("Smartphone", 500.0, 12);
        Producto alimento = new Alimento("Manzanas", 2.5, "2023-12-31");
        Producto ropa = new Ropa("Camiseta", 20.0, "M");

        // Demostrar polimorfismo
        Producto[] productos = {electronico, alimento, ropa};

        for (Producto producto : productos) {
            producto.mostrarDetalles(); // Llamada polimórfica
            System.out.println("-----------------------------");
        }
    }
}
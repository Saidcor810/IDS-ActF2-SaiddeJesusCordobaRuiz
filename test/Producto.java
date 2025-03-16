// Clase abstracta que representa un producto genérico
public abstract class Producto {
    protected int id;
    protected String nombre;
    protected double precio;
    protected int cantidad;

    // Constructor
    /**
     * @param id
     * @param nombre
     * @param precio
     * @param cantidad
     */
    public Producto(int id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método abstracto para calcular el precio total
    public abstract double calcularPrecio();

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
}

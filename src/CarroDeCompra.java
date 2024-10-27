import java.util.ArrayList;

public class CarroDeCompra extends Transaccion {
    // Atributos adicionales
    private String cliente;
    private ArrayList<String> productos;  // Lista de productos
    private ArrayList<Integer> cantidades; // Cantidades correspondientes a cada producto
    private double total;  // Total del carrito

    // Constructor actualizado
    public CarroDeCompra(String idTransaccion, double monto, String metodoPago, String cliente, String tipoMoneda, String detalles) {
        super(idTransaccion, monto, metodoPago, tipoMoneda, detalles);  // Herencia de Transaccion con todos los parámetros
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.cantidades = new ArrayList<>();
        this.total = 0.0;
    }

    // Métodos getters y setters
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    // Método para añadir un producto y su cantidad
    public void agregarProducto(String producto, int cantidad) {
        productos.add(producto);
        cantidades.add(cantidad);
        System.out.println("Producto " + producto + " agregado al carro con cantidad: " + cantidad);
        actualizarTotal();
    }

    // Método para eliminar un producto
    public void eliminarProducto(String producto) {
        int index = productos.indexOf(producto);
        if (index >= 0) {
            productos.remove(index);
            cantidades.remove(index);
            System.out.println("Producto " + producto + " eliminado del carro.");
            actualizarTotal();
        } else {
            System.out.println("Producto no encontrado en el carro.");
        }
    }

    // Método para vaciar el carrito
    public void vaciarCarrito() {
        productos.clear();
        cantidades.clear();
        total = 0.0;
        System.out.println("Carrito vaciado.");
    }

    // Método para mostrar el contenido del carro
    public void mostrarContenido() {
        System.out.println("Productos en el carro:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println("- " + productos.get(i) + " (Cantidad: " + cantidades.get(i) + ")");
        }
        System.out.println("Total del carro: $" + total);
    }

    // Método privado para actualizar el total del carrito
    private void actualizarTotal() {
        double nuevoTotal = 0.0;
        for (int i = 0; i < productos.size(); i++) {
            // Suponiendo que cada producto tiene un precio ficticio (por ejemplo, 10.0 por producto)
            double precio = 10.0;
            nuevoTotal += precio * cantidades.get(i);
        }
        this.total = nuevoTotal;
    }
}

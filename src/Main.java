public class Main {
    public static void main(String[] args) {
        // Crear una nueva transacción
        Transaccion transaccion1 = new Transaccion("T001", 100.0, "Tarjeta de Crédito", "USD", "Compra de videojuego");
        transaccion1.confirmar();

        // Crear un carrito de compras para un cliente
        CarroDeCompra carrito = new CarroDeCompra("C001", 200.0, "PayPal", "Cliente123", "USD", "Compra de varios productos");
        carrito.agregarProducto("Videojuego 1", 1);
        carrito.agregarProducto("DLC 1", 2);
        carrito.mostrarContenido();

        // Configurar el sistema de pago con un proveedor específico
        SistemaDePago sistemaPago = new SistemaDePago("Stripe");

        // Procesar el pago del carrito
        sistemaPago.procesarPago(carrito);

        // Procesar pago con descuento
        sistemaPago.procesarPago(carrito, 20.0);

        // Mostrar total procesado en el sistema de pago
        System.out.println("Monto total procesado en el sistema de pago: " + sistemaPago.getMontoTotalProcesado());
    }
}

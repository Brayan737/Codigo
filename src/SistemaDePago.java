import java.util.ArrayList;

public class SistemaDePago {
    // Atributos
    private String proveedorDePago;  // Nombre del proveedor del sistema de pago (ej. PayPal, Stripe)
    private ArrayList<Transaccion> transacciones;  // Lista de transacciones procesadas
    private double montoTotalProcesado;  // Total de todas las transacciones procesadas

    // Constructor
    public SistemaDePago(String proveedorDePago) {
        this.proveedorDePago = proveedorDePago;
        this.transacciones = new ArrayList<>();
        this.montoTotalProcesado = 0.0;
    }

    // Método polimórfico para procesar pago
    public void procesarPago(Transaccion transaccion) {
        System.out.println("Procesando pago con método: " + transaccion.getMetodoPago() + " a través de " + proveedorDePago);
        transaccion.confirmar();
        registrarTransaccion(transaccion);
    }

    // Sobrecarga de método para procesar pago con descuento
    public void procesarPago(Transaccion transaccion, double descuento) {
        double montoFinal = transaccion.getMonto() - descuento;
        System.out.println("Procesando pago con descuento. Monto final: " + montoFinal);
        transaccion.setMonto(montoFinal);
        transaccion.confirmar();
        registrarTransaccion(transaccion);
    }

    // Método para registrar transacciones en la lista y actualizar el monto total procesado
    private void registrarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
        montoTotalProcesado += transaccion.getMonto();
        System.out.println("Transacción registrada. Monto total procesado: " + montoTotalProcesado);
    }

    // Métodos getters y setters
    public String getProveedorDePago() {
        return proveedorDePago;
    }

    public void setProveedorDePago(String proveedorDePago) {
        this.proveedorDePago = proveedorDePago;
    }

    public double getMontoTotalProcesado() {
        return montoTotalProcesado;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }
}

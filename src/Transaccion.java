import java.time.LocalDateTime;

public class Transaccion {
    // Atributos encapsulados
    private String idTransaccion;
    private double monto;
    private String metodoPago;
    private String estado;
    private LocalDateTime fecha;
    private String tipoMoneda;
    private String detalles;

    // Constructor
    public Transaccion(String idTransaccion, double monto, String metodoPago, String tipoMoneda, String detalles) {
        this.idTransaccion = idTransaccion;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.estado = "Pendiente";
        this.fecha = LocalDateTime.now();
        this.tipoMoneda = tipoMoneda;
        this.detalles = detalles;
    }

    // Métodos getters y setters (Encapsulación)
    public String getIdTransaccion() {
        return idTransaccion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    // Método para confirmar la transacción
    public void confirmar() {
        if (!this.estado.equals("Completada")) {
            this.estado = "Completada";
            System.out.println("Transacción confirmada.");
        } else {
            System.out.println("La transacción ya está completada.");
        }
    }

    // Método para cancelar la transacción
    public void cancelar() {
        if (!this.estado.equals("Cancelada")) {
            this.estado = "Cancelada";
            System.out.println("Transacción cancelada.");
        } else {
            System.out.println("La transacción ya está cancelada.");
        }
    }
}

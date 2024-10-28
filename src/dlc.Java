import java.util.Date;
public class Dlc extends Videojuego {
    // Atributo adicional específico de los DLCs
    private String nombreDlc;
    private String descripcion;
    private double precioDlc;
    private Date fechaLanzamientoDlc;
    private double tamanioDlc;
    // Constructor
    public Dlc(int idVideojuego, String nombreDlc, String descripcion, double precioDlc, Date fechaLanzamientoDlc, double tamanioDlc, String nombre, String desarrollador, double precio, String genero, Date fechaLanzamiento, String requisitosMinimos) {
        super(idVideojuego, nombre, desarrollador, precio, genero, fechaLanzamiento, requisitosMinimos);
        this.nombreDlc = nombreDlc;
        this.descripcion = descripcion;
        this.precioDlc = precioDlc;
        this.fechaLanzamientoDlc = fechaLanzamientoDlc;
        this.tamanioDlc = tamanioDlc;
    }
   
    // Getters y Setters (encapsulamiento)

    public String getNombreDlc() {
        return nombreDlc;
    }

    public void setNombreDlc(String nombreDlc) {
        this.nombreDlc = nombreDlc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioDlc() {
        return precioDlc;
    }

    public void setPrecioDlc(double precioDlc) {
        this.precioDlc = precioDlc;
    }

    public Date getFechaLanzamientoDlc() {
        return fechaLanzamientoDlc;
    }

    public void setFechaLanzamientoDlc(Date fechaLanzamientoDlc) {
        this.fechaLanzamientoDlc = fechaLanzamientoDlc;
    }

    public double getTamanioDlc() {
        return tamanioDlc;
    }

    public void setTamanioDlc(double tamanioDlc) {
        this.tamanioDlc = tamanioDlc;
    }
    

    // Sobrescritura de método (polimorfismo)
    @Override
    public void mostrarInfo() {
        System.out.println("DLC: " + this.nombreDlc + " para el juego " + this.nombre + ", Precio: " + this.precio);
    }
    public void proveerDLC(int idBiblioteca) {
        System.out.println("Este método permite que la biblioteca de id " + idBiblioteca + " tenga disponible el DLC " + this.nombreDlc + " del videojuego con nombre " + this.getNombre());
    }

}
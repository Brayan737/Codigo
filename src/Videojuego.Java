import java.util.Date;
public class Videojuego {
    // Atributos privados (encapsulamiento)
    protected String nombre;
    protected int id;
    protected String desarrollador;
    protected double precio;
    protected boolean estaDisponible;
    protected String genero;
    protected Date fechaLanzamiento;
    protected String requisitosMinimos;
    protected double tamanio;
    // Constructor
    public Videojuego(int id, String nombre, String desarrollador, double precio, String genero, Date fechaLanzamiento, String requisitosMinimos) {
        this.nombre = nombre;
        this.id= id;
        this.desarrollador = desarrollador;
        this.precio = precio;
        this.estaDisponible = false;  // Inicialmente no está disponible en la tienda
        this.genero=genero;
        this.fechaLanzamiento=fechaLanzamiento;
        this.requisitosMinimos=requisitosMinimos;
    }

    // Getters y Setters (encapsulamiento)
    public String getNombre() {
        return this.nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }
    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getEstaDisponible() {
        return this.estaDisponible;
    }

    public void proveerAcceso() {
        this.estaDisponible = true;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String g){
        this.genero=g;
    }
    
    public Date getFechaLanzamiento(){
        return this.fechaLanzamiento;
    }
    
    public void setFechaLanzamiento(Date fl){
        this.fechaLanzamiento=fl;
    }
    
    public String getRequisitosMinimos(){
        return this.requisitosMinimos;
    }
    
    public void setRequisitosMinimos(String rm){
        this.requisitosMinimos=rm;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    
    // Método que puede ser sobrescrito (polimorfismo)
    public void mostrarInfo() {
        System.out.println("Videojuego: " + this.nombre + ", del género: " + this.genero+", Desarrollado por: " + this.desarrollador + ", Precio: " + this.precio);
    }
    public void proveerSuAccesoABiblioteca(int idBbiblioteca){
        System.out.println("Este método permite que la biblioteca de id " + idBbiblioteca + " tenga disponible el videojuego " +this.nombre);
    }
    
    public void proveerActualizacion(String versionActualizacion){
        System.out.println("Este método permite que el videojuego " + this.nombre + " Sea actualizado por la actualización de versión" + versionActualizacion );
    }

    
}
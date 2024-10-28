package sistemasii;
//Importamos la clase Comparator para poder comparar distintos valores.
import java.util.Comparator;
//Importamos la clase Date para poder guardar fechas.
import java.util.Date;
//Importamos la clase List para almacenar los distintos datos en listas dinamicas.
import java.util.List;


public class Forocomunidad {
    
    //Creacion de las variables que se deberan utilizar.
    private String nombre;
    private int cantPublicaciones;
    private Date fechaCreacion;
    private int cantMiembros;
    //Creamos listas dinamicas para poder almacenar los distintos datos.
    private List<String> temasPrincipales; 
    //Creamos la lista de publicaciones de la clase Publicacion.
    private List<Publicacion> publicaciones;
    
    //Creamos el constructor

    public Forocomunidad() {
    }

    public Forocomunidad(String nombre, int cantPublicaciones, Date fechaCreacion, int cantMiembros, List<String> temasPrincipales, List<Publicacion> publicaciones) {
        this.nombre = nombre;
        this.cantPublicaciones = cantPublicaciones;
        this.fechaCreacion = fechaCreacion;
        this.cantMiembros = cantMiembros;
        this.temasPrincipales = temasPrincipales;
        this.publicaciones = publicaciones;
    }
    
    //Creamos el procedimiento almacenarPublicacion donde recibe de parametro la publicacion de la clase Publicacion.
    public void almacenarPublicacion(Publicacion publicacion){
        publicaciones.add(publicacion); //Guardamos la publicacion en la lista.
        cantPublicaciones++; //Aumentamos la cantidad de publicaciones.
    }
    
    //Creamos el procedimiento para ordenar publicaciones por fecha.
    public void ordenarPublicacionesPorFecha(){
        publicaciones.sort(Comparator.comparing(Publicacion::getFechaPublicacion)); //Comparamos a traves de la fecha de publicacion las listas y las ordenamos a traves del metodo sort
    }
    
    //Creamos el procedimiento para ordenar por popularidad
    public void ordenarPublicacionPorPopularidad(){
        publicaciones.sort(Comparator.comparing(Publicacion::getLikes).reversed()); //Comparamos a traves de getLikes las listas 
    } //y ordenamos la misma a traves del metodo sort, ademas utilizamos reversed para ordenarlos de mayor a menor (Mas popular al menos popular)
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantPublicaciones() {
        return cantPublicaciones;
    }

    public void setCantPublicaciones(int cantPublicaciones) {
        this.cantPublicaciones = cantPublicaciones;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getCantMiembros() {
        return cantMiembros;
    }

    public void setCantMiembros(int cantMiembros) {
        this.cantMiembros = cantMiembros;
    }

    public List<String> getTemasPrincipales() {
        return temasPrincipales;
    }

    public void setTemasPrincipales(List<String> temasPrincipales) {
        this.temasPrincipales = temasPrincipales;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
}
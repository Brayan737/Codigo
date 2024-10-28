package sistemasii;
//Importamos la clase Date para guardar fechas.
import java.util.Date;


public class Publicacion{
    
    private String titulo;
    private Date fechaPublicacion;
    private int numero;
    private String tema;
    private String texto;
    private int likes; //creamos la variable likes para poder ordenar por popularidad
    
    public Publicacion() {
    }

    public Publicacion(String titulo, Date fechaPublicacion, int numero, String tema, String texto,int likes) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.numero = numero;
        this.tema = tema;
        this.texto = texto;
        this.likes = likes;
    }
    
    public void darLike(){
         this.likes++; //Cada vez que se llama el procedimiento los likes aumentan en 1.
    }
    
    public void editarPublicacion(String nuevoTitulo, String nuevoTexto){
        this.titulo = nuevoTitulo;
        this.texto = nuevoTexto;
    }
    
    public void eliminarPublicacion(){
        this.texto = "";
        this.titulo = "";}

     //Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}

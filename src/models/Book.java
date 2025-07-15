package models;
import java.util.Objects;

public class Book implements Comparable<Book> {

    private String nombre;
    private String autor;
    private int anioPublicacion;

    public Book(String nombre, String autor, int anioPublicacion){
        this.nombre = nombre;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    
    @Override
    public int compareTo(Book book) {
        int comparador = book.nombre.compareTo(this.nombre);

        if (comparador != 0){
            return comparador;
    }
        return Integer.compare(anioPublicacion, book.anioPublicacion);
    }


    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.autor);
        hash = 41 * hash + this.anioPublicacion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.anioPublicacion != other.anioPublicacion) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }


    @Override
    public String toString() {
        return "Libro: nombre=" + nombre + ", autor=" + autor + ", Publicado = " + anioPublicacion + "\n";
    }

    

    




    
}

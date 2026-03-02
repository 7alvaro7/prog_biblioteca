public class Libro {

//atributos de la clase
private int id;
private String titulo;
private String autor;
private int numPaginas;


    /**
     * Metodo constructor de Libros
     * @param id identificador del libro
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param numPages numero de paginas del libro
     */

public Libro(int id, String titulo, String autor, int numPages){
    this.id = id;
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPages;

    }
    public int getId() {
    return id;
    }

    public String getTitulo() {
    return titulo;
    }

    public String getAutor() {
    return autor;
    }

    public int getNumPaginas() {
    return numPaginas;
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder("Libro: {");

    sb.append(String.format("\n id: %d;",id));
    sb.append(String.format(" titulo: %s;",titulo));
    sb.append(String.format(" autor: %s;",autor));
    sb.append(String.format(" num. paginas: %s;",numPaginas));


        return  sb.toString();
    }
}
public class Biblioteca {

    private Libro[] catalogo;
    private final int CANT_MAX_LIBROS;

    public Biblioteca(int cantidad_maxima_libros){
        CANT_MAX_LIBROS = cantidad_maxima_libros;
        catalogo = new Libro[CANT_MAX_LIBROS];
    }

    /**
     * Busca el primer libro que encuentre con el id recibido
     * @param idLibro
     * @return
     */
    public Libro findLibro(int idLibro){
        boolean seguirBuscando = true;
        Libro libroEncontrado = null;

        for(int i = 0; i < CANT_MAX_LIBROS && seguirBuscando; i++){
            if(catalogo[i] != null && catalogo[i].getId() == idLibro){
                seguirBuscando = false;
                libroEncontrado = catalogo[i];
            }

        }
        return libroEncontrado;
    }

    /**
     * metodo privado que busca la primera posicion libre en el catalogo
     * @return -1 si no hay hueco libre o la posicion libre.
     */

    private int buscarPrimerHuecoLibre(){
        int posicionLibre = -1;
        boolean seguirBuscando = true;
        for(int i = 0; i < CANT_MAX_LIBROS && seguirBuscando; i++){
            if(catalogo[i] == null){
                posicionLibre = i;
                seguirBuscando = false;
            }
        }
        return posicionLibre;
    }

    /**
     * Recibe y añade el libro no duplicado siempre que haya hueco.
     * @param libro libro recibido
     * @return true si se a añadido, false si no a podido añadirlo
     */

    public boolean addLibro(Libro libro){
        boolean libroAnadido = false;
        int posicion = 0;


        //comprobamos si existe
            //buscar hueco
                //no hay -> libroAnadido = false
                 //si hay ->
                    //añadimos
                    //libroAnadido = true

        if( findLibro(libro.getId()) == null){ //no lo ha encontrado. no esta duplicado
            if( posicion >= 0) {
                catalogo[posicion] = libro;
                libroAnadido = true;
            }
        }
        return libroAnadido;
    }

}

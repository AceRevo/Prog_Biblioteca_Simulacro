package simulacro_Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Recurso> recursos;

    public Biblioteca() {
        this.recursos = new ArrayList<>();
    }



    public Recurso buscarPorId(int id){
        Recurso resultado = null;
        Recurso temporal;
        //boolean seguirBuscando = true;
        int posicion = 0;
        int cantidad = this.recursos.size();

        while( cantidad > 0 && resultado == null && posicion < cantidad ){
            temporal = recursos.get(posicion);

            if( temporal.getId() == id ){
                resultado = temporal;
            }
            posicion++;
        }
        return resultado;
    }

    public Recurso buscarPorId2(int id){
        Recurso resultado = null;
        Recurso temporal;
        boolean seguirBuscando = true;  // flag de continuidad
        int posicion = 0;
        int cantidad = this.recursos.size();

        while( cantidad > 0 && seguirBuscando /* == true */ && posicion < cantidad ){
            temporal = recursos.get(posicion);

            if( temporal.getId() == id ){
                resultado = temporal;
                seguirBuscando = false;
            }
            posicion++;
        }
        return resultado;
    }

    /**
     * Busca por título con coincidencia exacta
     * @param titulo
     * @return
     */
    public Recurso buscarPorTitulo(String titulo) {
        Recurso resultado = null;
        Recurso temporal;
        //boolean seguirBuscando = true;
        int posicion = 0;
        int cantidad = this.recursos.size();

        while( cantidad > 0 && resultado == null && posicion < cantidad ){
            temporal = recursos.get(posicion);

            if( temporal.getTitulo().equalsIgnoreCase( titulo )){
                resultado = temporal;
            }
            posicion++;
        }
        return resultado;
    }


    /* **********************************************************************
        POLIMORFISMO
    ********************************************************************** */
    public Recurso buscar(int id){
        Recurso resultado = null;
        Recurso temporal;
        //boolean seguirBuscando = true;
        int posicion = 0;
        int cantidad = this.recursos.size();

        while( cantidad > 0 && resultado == null && posicion < cantidad ){
            temporal = recursos.get(posicion);

            if( temporal.getId() == id ){
                resultado = temporal;
            }
            posicion++;
        }
        return resultado;
    }

    /**
     * Busca por título con coincidencia exacta
     * @param titulo
     * @return
     */
    public Recurso buscar(String titulo) {
        Recurso resultado = null;
        Recurso temporal;
        //boolean seguirBuscando = true;
        int posicion = 0;
        int cantidad = this.recursos.size();

        while( cantidad > 0 && resultado == null && posicion < cantidad ){
            temporal = recursos.get(posicion);

            if( temporal.getTitulo().equalsIgnoreCase( titulo )){
                resultado = temporal;
            }
            posicion++;
        }
        return resultado;
    }

    /* Este es el equivalente polimórfico al metodo buscar por titulo
    */
    public List<Recurso> buscar(TipoPrestamo tipoPrestamo){
        List<Recurso> resultados = new ArrayList<>();

        for (Recurso r : this.recursos ){
            if( r.getTipoPrestamo() == tipoPrestamo ) {
                resultados.add(r);
            }
        }

        return resultados;
    }



    /* **********************************************************************
        FIN DE POLIMORFISMO
     ********************************************************************** */

    //buscarPorTipoPrestamo(TipoPrestamo tipo)


    /**
     * Añade un recurso
     * @param r
     */
    public void addRecurso(Recurso r){
        this.recursos.add(r);
    }

    /*

    buscarPorTitulo(String titulo) // coincidencia exacta
    buscarPorTipoPrestamo(TipoPrestamo tipo)
    eliminarPorId(String id)
    modificarAutor(String id, String nuevoAutor)
    imprimirTodos()
    imprimirPorTipoPrestamo(TipoPrestamo tipo)
    listarLibros()
    listarRevistas()

     */
}

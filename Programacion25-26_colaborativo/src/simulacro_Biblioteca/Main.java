package simulacro_Biblioteca;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();


        Libro quijote = new Libro(1, "Quijote", "Cervantes", TipoPrestamo.DOMICILO, 660 );
        Libro manual = new Libro(2, "Manual", "Víctor", TipoPrestamo.DOMICILO, 1660 );

        Revista muy = new Revista(3, "Muy Interesante", "Varios", TipoPrestamo.SALA, 5);
        Revista gta6 = new Revista(4, "Ge Te A Seis", "Varios", TipoPrestamo.DOMICILO, 3);

        biblioteca.addRecurso(quijote);
        biblioteca.addRecurso(manual);
        biblioteca.addRecurso(muy);
        biblioteca.addRecurso(gta6);

        System.out.println( biblioteca.buscar(4) ); // gta6
        System.out.println( biblioteca.buscar("Quijote") );
        System.out.println( biblioteca.buscar(TipoPrestamo.DOMICILO) );

    }
}

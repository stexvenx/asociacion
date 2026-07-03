public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    Libro libro1 = new Libro("100 años de soledad", "Gabriel García Márquez");
    Lector lector1 = new Lector("Juan Pérez", "123456789");

        lector1.tomarPrestado(libro1);
        lector1.mostrarEstado();

    }



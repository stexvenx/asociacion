public class App {
    public static void main(String[] args) throws Exception {
   
 

  
    Libro libro1 = new Libro("100 años de soledad", "Gabriel García Márquez", true);

    Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", false);

    Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", true);

    Libro libro4 = new Libro("1984", "George Orwell", true);

    Libro libro5 = new Libro("La Odisea", "Homero", true);

    Lector lector1 = new Lector("Juan Pérez", "123456789");

    Lector lector2 = new Lector("María Gómez", "1012345678");


    Lector lector3 = new Lector("Carlos Rodríguez", "1034567890");


    Lector lector4 = new Lector("Ana Martínez", "1045678901");


    Lector lector5 = new Lector("Luis Hernández", "1056789012");

    lector1.tomarPrestado(libro1);
    lector2.tomarPrestado(libro2);
    lector3.tomarPrestado(libro3);
    lector4.tomarPrestado(libro4);
    lector5.tomarPrestado(libro5);


    lector1.devolverLibro();
    lector1.mostrarEstado();

    libro1.mostrarInformacion();


}
}




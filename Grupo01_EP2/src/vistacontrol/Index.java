package vistacontrol;

import java.util.List;
import modelo.Autor;
import modeloDAO.AutorDAO;
import utils.Lectura;
import modeloDAO.EditorialDAO;
import modelo.Editorial;
import modeloDAO.LibroDAO;
import modelo.Libro;


public class Index {

    private static Lectura leer = new Lectura();
    public static String darformato(String cadena) {
        if (cadena.length() >= 10) {
            return cadena.substring(0, 9) + "...";
        } else if (cadena.length() <= 7) {
            return cadena + "\t";
        } else {
            return cadena;
        }
    }    

    

    public static void listarAutor() {
        AutorDAO autorDAO = new AutorDAO();
        List<Autor> autores = autorDAO.listarautor();

        System.out.println(" ");
        System.out.println("❂");
        System.out.println(" ");

        System.out.println(" ╔ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈👽 LISTA DE AUTORES 👽┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈  ┈ ┈ ┈ ┈ ┈ ┈ ╗");
        System.out.println("");
        System.out.println("\tID \tNombre\t\tApellidos\t\tEdad\tCodigo\t\tPais\t\tSexo");
        Iterable<Autor> Autores;
        for (Autor autor : autores) {

            System.out.println("\t" + autor.getIdautor() + "\t" + darformato(autor.getNombre()) + "\t"
                    + darformato(autor.getApellidos()) + "\t\t" + autor.getEdad() + "\t" + autor.getCodigo() + "\t\t"
                    + darformato(autor.getLugar_n()) +"\t"+ autor.getSexo());

        }

        System.out.println("╚ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈  ┈ ┈  ┈  ╝");
    }

    public static void eliminarAutor() {
        listarAutor();
        System.out.print("Colocar el Id del Autor a eliminar aqui: ");
        int id = leer.entero();
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.eliminarautor(id);

    }

    public static void editarAutor() {
        listarAutor();
        System.out.print("Seleccione Id del Autor a editar: ");
        int id = leer.entero();
        String nombre;
        String apellidos;
        String edad;
        String codigo;
        String lugar_n;
        String sexo;
        System.out.println("Editar Autor");
        System.out.print("Nombre: ");
        nombre = leer.cadena();
        System.out.print("Apellidos: ");
        apellidos = leer.cadena();
        System.out.print("Edad: ");
        edad = leer.cadena();
        System.out.print("Codigo: ");
        codigo = leer.cadena();
        System.out.print("Lugar de nacimiento: ");
        lugar_n = leer.cadena();
        System.out.print("Sexo: ");
        sexo = leer.cadena();
        Autor autor = new Autor(id, nombre, apellidos, edad, codigo, lugar_n, sexo);
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.editarautor(autor);

    }

    public static void agregarAutor() {
        String nombre;
        String apellidos;
        String edad;
        String codigo;
        String lugar_n;
        String sexo;
        System.out.println("Editar Autor");
        System.out.print("Nombre: ");
        nombre = leer.cadena();
        System.out.print("Apellidos: ");
        apellidos = leer.cadena();
        System.out.print("Edad: ");
        edad = leer.cadena();
        System.out.print("Codigo: ");
        codigo = leer.cadena();
        System.out.print("Lugar de nacimiento: ");
        lugar_n = leer.cadena();
        System.out.print("Sexo: ");
        sexo = leer.cadena();
        Autor autor = new Autor(nombre, apellidos, edad, codigo, lugar_n, sexo);
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.agregarautor(autor);

    }
    

    public static void salir1() {
        menu();
        

    }
    public static void salir() {
        System.out.println("\nGracias por su vicita.");
        
    }

    public static void error() {
        System.out.println("\n--ERROR-- VALOR NO IDENTIFICADO");

    }

    public static void menu_autor() {
        System.out.println(" \n__^__                                      __^__");
        System.out.println("( ___ )------------------------------------( ___ )");
        System.out.println(" |   |                                      |   |");
        System.out.println(" |   |             Datos Autor              |   |");
        System.out.println(" |___|                                      |___|");
        System.out.println("(_____)------------------------------------(_____) ");
        System.out.println("\n1. Listar Autor");
        System.out.println("2. Eliminar Autor");
        System.out.println("3. Editar Autor");
        System.out.println("4. Agregar Autor");        
        System.out.println("5. Salir");
        System.out.print("\nElija opción [1-5]: ");
    }
    

    public static void inicio_autor() {
        int opcion;
        do {
            menu_autor();
            opcion = leer.entero();
            switch (opcion) {
                case 1:
                    listarAutor();
                    break;
                case 2:
                    eliminarAutor();
                    break;
                case 3:
                    editarAutor();
                    break;
                case 4:
                    agregarAutor();
                    break;                
                case 5:
                    salir1();
                    break;
                default:
                    error();
            }

        } while (opcion != 5);
    }
    public static void listarEditorial() {
        EditorialDAO editorialDAO = new EditorialDAO();
        List<Editorial> editoriales = editorialDAO.listareditorial();

        System.out.println(" ");
        System.out.println("❂");
        System.out.println(" ");

        System.out.println(" ╔ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈👽 LISTA DE EDITORIAL 👽┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈  ┈ ┈ ┈ ┈ ┈ ┈ ╗");
        System.out.println("");
        System.out.println("\tID \tNombre de la editorial\tTipo de texto\t\tFecha de creación\tAños de función"
                + "\tCodigo de Editorial\tEstado");
        Iterable<Editorial> Editoriales;
        for (Editorial editorial : editoriales) {

            System.out.println("\t" + editorial.getIdeditorial() + "\t" + darformato(editorial.getNombre_edit())+ "\t\t\t"
                    + editorial.getTipo_texto()+ "\t\t" + editorial.getFecha_creacion()+ "\t\t" + editorial.getFuncionamiento()+ "\t\t\t"
                    + editorial.getCodigo_edit()+ "\t\t" + editorial.getEstado());

        }

        System.out.println("╚ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈  ┈ ┈  ┈  ╝");
    }

    public static void eliminarEditorial() {
        listarEditorial();
        System.out.print("Colocar el Id de la Editorial a eliminar aqui: ");
        int id = leer.entero();
        EditorialDAO editorialDAO = new EditorialDAO();
        editorialDAO.eliminareditorial(id);

    }

    public static void editarEditorial() {
        listarEditorial();
        System.out.print("Seleccione Id de la Editorial a editar: ");
        int id = leer.entero();
        String nombre_edit;
        String tipo_texto;
        String fecha_creacion;
        String funcionamiento;
        String codigo_edit;
        String estado;
        System.out.println("Editar Editorial");
        System.out.print("Nombre de la editorial: ");
        nombre_edit = leer.cadena();
        System.out.print("Tipo de Texto: ");
        tipo_texto = leer.cadena();
        System.out.print("Fecha de creación: ");
        fecha_creacion = leer.cadena();
        System.out.print("Funcionamiento: ");
        funcionamiento = leer.cadena();
        System.out.print("Codigo de la Editorial: ");
        codigo_edit = leer.cadena();
        System.out.print("Estado: ");
        estado = leer.cadena();
        Editorial editorial = new Editorial(id, nombre_edit, tipo_texto, fecha_creacion, funcionamiento, codigo_edit, estado);
        EditorialDAO editorialDAO = new EditorialDAO();
        editorialDAO.editareditorial(editorial);

    }

    public static void agregarEditorial() {
        String nombre_edit;
        String tipo_texto;
        String fecha_creacion;
        String funcionamiento;
        String codigo_edit;
        String estado;
        System.out.println("Agregar Editorial");
        System.out.print("Nombre de la editorial: ");
        nombre_edit = leer.cadena();
        System.out.print("Tipo de Texto: ");
        tipo_texto = leer.cadena();
        System.out.print("Fecha de creación: ");
        fecha_creacion = leer.cadena();
        System.out.print("Funcionamiento: ");
        funcionamiento = leer.cadena();
        System.out.print("Codigo de la Editorial: ");
        codigo_edit = leer.cadena();
        System.out.print("Estado: ");
        estado = leer.cadena();
        Editorial editorial = new Editorial(nombre_edit, tipo_texto, fecha_creacion, funcionamiento, codigo_edit, estado);
        EditorialDAO editorialDAO = new EditorialDAO();
        editorialDAO.agregareditorial(editorial);
        

    }
    
    

    public static void menu_editorial() {
        System.out.println(" \n__^__                                      __^__");
        System.out.println("( ___ )------------------------------------( ___ )");
        System.out.println(" |   |                                      |   |");
        System.out.println(" |   |            Datos Editorial           |   |");
        System.out.println(" |___|                                      |___|");
        System.out.println("(_____)------------------------------------(_____) ");
        System.out.println("\n1. Listar Editarial");
        System.out.println("2. Eliminar Editorial");
        System.out.println("3. Editar Editoral");
        System.out.println("4. Agregar Editorial");        
        System.out.println("5. Salir");
        System.out.print("\nElija opción [1-5]: ");
    }
    

    public static void inicio_editorial() {
        int opcion;
        do {
            menu_editorial();
            opcion = leer.entero();
            switch (opcion) {
                case 1:
                    listarEditorial();
                    break;
                case 2:
                    eliminarEditorial();
                    break;
                case 3:
                    editarEditorial();
                    break;
                case 4:
                    agregarEditorial();
                    break;                
                case 5:
                    salir1();
                    break;
                default:
                    error();
            }

        } while (opcion != 5);
    }
    
    public static void listarLibro() {
        LibroDAO libroDAO = new LibroDAO();
        List<Libro> libros = libroDAO.listarlibro();

        System.out.println(" ");
        System.out.println("❂");
        System.out.println(" ");

        System.out.println(" ╔ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈👽 LISTA DE LIBRO 👽┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈  ┈ ┈ ┈ ┈ ┈ ┈ ╗");
        System.out.println("");
        System.out.println("\tID \tNombre del libro\tTipo de libro\t\tFecha de emición\tTiempo a la venta"
                + "\tCodigo del Libro\tEstado");
        Iterable<Libro> Libros;
        for (Libro libro : libros) {

            System.out.println("\t" + libro.getIdlibro()+ "\t" + darformato(libro.getNombre_libro())+ "\t\t\t"
                    + libro.getTipo_libro()+ "\t\t" + libro.getFecha_de_libro()+ "\t\t" + libro.getFuncionamiento()+ "\t\t\t"
                    + libro.getCodigo_libro()+ "\t\t" + libro.getEstado());

        }

        System.out.println("╚ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈ ┈  ┈ ┈  ┈  ╝");
    }
    public static void eliminarLibro() {
        listarLibro();
        System.out.print("Colocar el Id del Libro a eliminar aqui: ");
        int id = leer.entero();
        LibroDAO libroDAO = new LibroDAO();
        libroDAO.eliminarlibro(id);      

    }

    public static void editarLibro() {
        listarLibro();
        System.out.print("Seleccione Id de la Editorial a editar: ");
        int id = leer.entero();
        String nombre_libro;
        String tipo_libro;
        String fecha_de_libro;
        String funcionamiento;
        String codigo_libro;
        String estado;
        System.out.println("Editar Libro");
        System.out.print("Nombre del Libro: ");
        nombre_libro = leer.cadena();
        System.out.print("Tipo de Libro: ");
        tipo_libro = leer.cadena();
        System.out.print("Fecha de emición: ");
        fecha_de_libro = leer.cadena();
        System.out.print("Tiempo a la venta: ");
        funcionamiento = leer.cadena();
        System.out.print("Codigo de la Libro: ");
        codigo_libro = leer.cadena();
        System.out.print("Estado: ");
        estado = leer.cadena();
        Libro libro = new Libro(id, nombre_libro, tipo_libro, fecha_de_libro, funcionamiento, codigo_libro, estado);
        LibroDAO libroDAO = new LibroDAO();
        libroDAO.editarlibro(libro); 
    }

    public static void agregarLibro() {        
        String nombre_libro;
        String tipo_libro;
        String fecha_de_libro;
        String funcionamiento;
        String codigo_libro;
        String estado;
        System.out.println("Agregar Libro");
        System.out.print("Nombre de la editorial: ");
        nombre_libro = leer.cadena();
        System.out.print("Tipo de Texto: ");
        tipo_libro = leer.cadena();
        System.out.print("Fecha de creación: ");
        fecha_de_libro = leer.cadena();
        System.out.print("Funcionamiento: ");
        funcionamiento = leer.cadena();
        System.out.print("Codigo de la Editorial: ");
        codigo_libro = leer.cadena();
        System.out.print("Estado: ");
        estado = leer.cadena();
        Libro libro = new Libro(nombre_libro, tipo_libro, fecha_de_libro, funcionamiento, codigo_libro, estado);
        LibroDAO libroDAO = new LibroDAO();
        libroDAO.agregarlibro(libro); 

    }
    
    

    public static void menu_Libro() {
        System.out.println(" \n__^__                                      __^__");
        System.out.println("( ___ )------------------------------------( ___ )");
        System.out.println(" |   |                                      |   |");
        System.out.println(" |   |            Datos Libro           |   |");
        System.out.println(" |___|                                      |___|");
        System.out.println("(_____)------------------------------------(_____) ");
        System.out.println("\n1. Listar Libros");
        System.out.println("2. Eliminar Libro");
        System.out.println("3. Editar Libro");
        System.out.println("4. Agregar Libro");        
        System.out.println("5. Salir");
        System.out.print("\nElija opción [1-5]: ");
    }
    

    public static void inicio_libro() {
        int opcion;
        do {
            menu_Libro();
            opcion = leer.entero();
            switch (opcion) {
                case 1:
                    listarLibro();
                    break;
                case 2:
                    eliminarLibro();
                    break;
                case 3:
                    editarLibro();
                    break;
                case 4:
                    agregarLibro();
                    break;                
                case 5:
                    salir1();
                    break;
                default:
                    error();
            }

        } while (opcion != 5);
    }
    
    public static void menu() {
        System.out.println(" __^__                                      __^__");
        System.out.println("( ___ )------------------------------------( ___ )");
        System.out.println(" |   |                                      |   |");
        System.out.println(" |   |           Seleccione el menu         |   |");
        System.out.println(" |___|                                      |___|");
        System.out.println("(_____)------------------------------------(_____) ");
        System.out.println("\n1. Menu Autor");
        System.out.println("2. Menu Editorial"); 
        System.out.println("3. Menu Libro");
        System.out.println("3. Salir");
        System.out.print("\nElija opción [1-3]: ");
    }
    

    public static void inicio() {
        int opcion;
        do {
            menu();
            opcion = leer.entero();
            switch (opcion) {
                case 1:
                    inicio_autor();
                    break;
                case 2:
                    inicio_editorial();
                    break;
                case 3:
                    inicio_libro();
                    break;
                case 4:
                    salir();
                    break;
                default:
                    error();
            }

        } while (opcion != 4);
    }

    public static void main(String[] args) {
        inicio();
    }
}

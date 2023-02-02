package interfaces;

import java.util.List;
import modelo.Libro;


public interface CRUD_LIBRO {    
    
    public List listarlibro(); 
    public Libro buscarlibro(int idlibro); 
    public boolean agregarlibro(Libro libro); 
    public boolean editarlibro(Libro libro); 
    public boolean eliminarlibro(int idlibro); 

}

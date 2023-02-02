
package interfaces;

import java.util.List;
import modelo.Editorial;


public interface CRUD_EDITORIAL {    
    
    public List listareditorial(); 
    public Editorial buscareditorial(int ideditorial); 
    public boolean agregareditorial(Editorial editorial); 
    public boolean editareditorial(Editorial editorial); 
    public boolean eliminareditorial(int ideditorial); 

}
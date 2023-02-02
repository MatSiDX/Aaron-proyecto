package Arreglos;
import Clase.Registro;
import java.util.ArrayList;

public class arrayregistro {
    
    private ArrayList<Registro> registro = new ArrayList<>();
    
 public static void cargar_data_preinstalada() {    
    Registro re = new Registro("aaron",123,"pruebahotmailcom","gm","aaaf","adaa");
    Registro registro2 = new Registro("asds",123,"pruebahotmail.scom","gm2","aaas","aaga");
    Registro registro3 = new Registro("asdasd",123,"pruebahotmaiwl.com","gm3","asaa","aaaa");
    Registro registro4 = new Registro("asd",123,"pruebahotmail.csom","gm4","aaaf","aaasd");
    
    registro.add(re);

 }
}

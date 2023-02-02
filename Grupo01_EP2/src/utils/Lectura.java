package utils;
import java.util.Scanner;


public class Lectura {
    private Scanner t = new Scanner(System.in,"ISO-8859-1");

    public String cadena() {
        return t.nextLine();
    }

    public String cadenaMayuscula() {
        return cadena().toUpperCase();
    }

    public String cadenaminuscula() {
        return cadena().toLowerCase();
    }

    public int entero() {
        return Integer.valueOf(cadena());
    }

    public double decimal() {
        return Double.valueOf(cadena());
    }

    public char letra() {
        return cadena().charAt(0);
    }
    public static void fichero() {
        
    }
    
    
}

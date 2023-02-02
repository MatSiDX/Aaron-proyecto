package Inicio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Basededatos {
    public static Connection conectar(){
        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestor","root","admin");
            System.out.println("Conexion ON");
        } catch (Exception e) {
            System.out.println(e);
            connection = null;
            System.out.println("Conecion OFF");
        }
        return connection;
    }
    }





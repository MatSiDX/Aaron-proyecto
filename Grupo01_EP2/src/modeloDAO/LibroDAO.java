package modeloDAO;

import config.bd.ConectaBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import interfaces.CRUD_LIBRO;
import java.util.ArrayList;
import java.util.List;
import modelo.Libro;

public class LibroDAO implements CRUD_LIBRO {

    // Conectarme a la BD
    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Libro e = new Libro();

    @Override
    public List listarlibro() {
        ArrayList<Libro> libros = new ArrayList<>();
        String consulta = "SELECT * FROM EDITORIAL ORDER BY IDELIBRO";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Libro libro = new Libro();
                libro.setIdlibro(rs.getInt("idlibro"));
                libro.setNombre_libro(rs.getString("nombre_libro"));
                libro.setTipo_libro(rs.getString("tipo_libro"));
                libro.setFecha_de_libro(rs.getString("fecha_de_libro"));
                libro.setFuncionamiento(rs.getString("funcionamiento"));
                libro.setCodigo_libro(rs.getString("codigo_libro"));
                libro.setEstado(rs.getString("estado"));
                libros.add(libro);
            }

        } catch (Exception e) {

        }
        return libros;
    }

    @Override
    public Libro buscarlibro(int idlibro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarlibro(Libro libro) {
        String consulta = " insert into libro(nombre_libro, tipo_libro, fecha_de_libro, funcionamiento, codigo_libro, estado)"
                + " values('" + libro.getNombre_libro() + "',"
                + "'" + libro.getTipo_libro() + "',"
                + "'" + libro.getFecha_de_libro() + "',"
                + "'" + libro.getFuncionamiento() + "',"
                + "'" + libro.getCodigo_libro() + "',"
                + "'" + libro.getEstado() + "'); ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("no se pudo realizar el insert");
            return false;
        }
        return true;
    }

    @Override
    public boolean editarlibro(Libro libro) {
        String consulta = " update libro "
                + " set "
                + " nombre_libro = '" + libro.getNombre_libro() + "', "
                + " tipo_libro = '" + libro.getTipo_libro() + "', "
                + " fecha_de_libro = '" + libro.getFecha_de_libro() + "', "
                + " funcionamiento = '" + libro.getFuncionamiento() + "', "
                + " codigo_libro = '" + libro.getCodigo_libro() + "', "
                + " estado = '" + libro.getEstado() + "'  "
                + " where "
                + " idlibro= " + libro.getIdlibro() + ";";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean eliminarlibro(int idlibro) {
        String consulta = " delete from libro"
                + " where "
                + " idlibro= " + idlibro + "; ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            pst.executeUpdate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}

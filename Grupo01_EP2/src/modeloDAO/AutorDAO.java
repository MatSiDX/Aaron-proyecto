package modeloDAO;

import config.bd.ConectaBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import interfaces.CRUD_AUTOR;
import java.util.ArrayList;
import java.util.List;
import modelo.Autor;


public class AutorDAO implements CRUD_AUTOR {

    // Conectarme a la BD
    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Autor e = new Autor();

    @Override
    public List listarautor() {
        ArrayList<Autor> autores = new ArrayList<>();
        String consulta = "SELECT * FROM AUTOR ORDER BY IDAUTOR";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Autor autor = new Autor();
                autor.setIdautor(rs.getInt("idautor"));
                autor.setNombre(rs.getString("nombre"));
                autor.setApellidos(rs.getString("apellidos"));
                autor.setEdad(rs.getString("edad"));
                autor.setCodigo(rs.getString("codigo"));
                autor.setLugar_n(rs.getString("lugar_n"));
                autor.setSexo(rs.getString("sexo"));
                autores.add(autor);
            }

        } catch (Exception e) {

        }
        return autores;
    }

    @Override
    public Autor buscarautor(int idautor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarautor(Autor autor) {
        String consulta = " insert into autor(nombre, apellidos, edad, codigo, lugar_n, sexo)"
                + " values('" + autor.getNombre() + "',"
                + "'" + autor.getApellidos() + "',"
                + "'" + autor.getEdad() + "',"
                + "'" + autor.getCodigo() + "',"
                + "'" + autor.getLugar_n() + "',"
                + "'" + autor.getSexo() + "'); ";
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
    public boolean editarautor(Autor autor) {
        String consulta = " update autor "
                + " set "
                + " nombre = '" + autor.getNombre() + "', "
                + " apellidos = '" + autor.getApellidos() + "', "
                + " edad = '" + autor.getEdad() + "', "
                + " codigo = '" + autor.getCodigo() + "', "
                + " lugar_n = '" + autor.getLugar_n() + "', "
                + " sexo = '" + autor.getSexo() + "'  "                
                + " where "
                + " idautor= " + autor.getIdautor() + ";";
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
    public boolean eliminarautor(int idautor) {
        String consulta = " delete from autor"
                + " where "
                + " idautor= " + idautor + "; ";
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

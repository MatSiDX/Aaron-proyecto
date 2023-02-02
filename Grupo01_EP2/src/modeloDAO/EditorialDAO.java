package modeloDAO;

import config.bd.ConectaBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import interfaces.CRUD_EDITORIAL;
import java.util.ArrayList;
import java.util.List;
import modelo.Editorial;


public class EditorialDAO implements CRUD_EDITORIAL {

    // Conectarme a la BD
    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Editorial e = new Editorial();

    public List listareditorial() {
        ArrayList<Editorial> editoriales = new ArrayList<>();
        String consulta = "SELECT * FROM EDITORIAL ORDER BY IDEDITORIAL";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Editorial editorial = new Editorial();
                editorial.setIdeditorial(rs.getInt("ideditorial"));
                editorial.setNombre_edit(rs.getString("nombre_edit"));
                editorial.setTipo_texto(rs.getString("tipo_texto"));
                editorial.setFecha_creacion(rs.getString("fecha_creacion"));
                editorial.setFuncionamiento(rs.getString("funcionamiento"));
                editorial.setCodigo_edit(rs.getString("codigo_edit"));
                editorial.setEstado(rs.getString("estado"));
                editoriales.add(editorial);
            }

        } catch (Exception e) {

        }
        return editoriales;
    }

    @Override
    public Editorial buscareditorial(int ideditorial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregareditorial(Editorial editorial) {
        String consulta = " insert into editorial(nombre_edit, tipo_texto, fecha_creacion, funcionamiento, codigo_edit, estado)"
                + " values('" + editorial.getNombre_edit()+ "',"
                + "'" + editorial.getTipo_texto()+ "',"
                + "'" + editorial.getFecha_creacion()+ "',"
                + "'" + editorial.getFuncionamiento()+ "',"
                + "'" + editorial.getCodigo_edit()+ "',"
                + "'" + editorial.getEstado()+ "'); ";
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
    public boolean editareditorial(Editorial editorial) {
        String consulta = " update editorial "
                + " set "
                + " nombre_edit = '" + editorial.getNombre_edit()+ "', "
                + " tipo_texto = '" + editorial.getTipo_texto()+ "', "
                + " fecha_creacion = '" + editorial.getFecha_creacion()+ "', "
                + " funcionamiento = '" + editorial.getFuncionamiento()+ "', "
                + " codigo_edit = '" + editorial.getCodigo_edit()+ "', "
                + " estado = '" + editorial.getEstado()+ "'  "                
                + " where "
                + " ideditorial= " + editorial.getIdeditorial()+ ";";
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
    public boolean eliminareditorial(int ideditorial) {
        String consulta = " delete from editorial"
                + " where "
                + " ideditorial= " + ideditorial + "; ";
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



package Clase;

public class Registro {
    private String nombres;
    private int codigo;
    private String correo;
    private String usuario;
    private String contraseña;
    private String repeatcontra;

    public Registro() {
    }

    public Registro(String nombres, int codigo, String correo, String usuario, String contraseña, String repeatcontra) {
        this.nombres = nombres;
        this.codigo = codigo;
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.repeatcontra = repeatcontra;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRepeatcontra() {
        return repeatcontra;
    }

    public void setRepeatcontra(String repeatcontra) {
        this.repeatcontra = repeatcontra;
    }
    
    
}


package modelo;


public class Autor {
    private int idautor;
    private String nombre;
    private String apellidos;
    private String edad;
    private String codigo;
    private String lugar_n;
    private String sexo;

    public Autor() {
    }

    public Autor(int idautor, String nombre, String apellidos, String edad, String codigo, String lugar_n, String sexo) {
        this.idautor = idautor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.codigo = codigo;
        this.lugar_n = lugar_n;
        this.sexo = sexo;
    }

    public Autor(String nombre, String apellidos, String edad, String codigo, String lugar_n, String sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.codigo = codigo;
        this.lugar_n = lugar_n;
        this.sexo = sexo;
    }
    

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLugar_n() {
        return lugar_n;
    }

    public void setLugar_n(String lugar_n) {
        this.lugar_n = lugar_n;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}

package modelo;

public class Libro {

    private int idlibro;
    private String nombre_libro;
    private String tipo_libro;
    private String fecha_de_libro;
    private String funcionamiento;
    private String codigo_libro;
    private String estado;

    public Libro() {
    }

    public Libro(int idlibro, String nombre_libro, String tipo_libro, String fecha_de_libro, String funcionamiento, String codigo_libro, String estado) {
        this.idlibro = idlibro;
        this.nombre_libro = nombre_libro;
        this.tipo_libro = tipo_libro;
        this.fecha_de_libro = fecha_de_libro;
        this.funcionamiento = funcionamiento;
        this.codigo_libro = codigo_libro;
        this.estado = estado;
    }

    public Libro(String nombre_libro, String tipo_libro, String fecha_de_libro, String funcionamiento, String codigo_libro, String estado) {
        this.nombre_libro = nombre_libro;
        this.tipo_libro = tipo_libro;
        this.fecha_de_libro = fecha_de_libro;
        this.funcionamiento = funcionamiento;
        this.codigo_libro = codigo_libro;
        this.estado = estado;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }

    public String getTipo_libro() {
        return tipo_libro;
    }

    public void setTipo_libro(String tipo_libro) {
        this.tipo_libro = tipo_libro;
    }

    public String getFecha_de_libro() {
        return fecha_de_libro;
    }

    public void setFecha_de_libro(String fecha_de_libro) {
        this.fecha_de_libro = fecha_de_libro;
    }

    public String getFuncionamiento() {
        return funcionamiento;
    }

    public void setFuncionamiento(String funcionamiento) {
        this.funcionamiento = funcionamiento;
    }

    public String getCodigo_libro() {
        return codigo_libro;
    }

    public void setCodigo_libro(String codigo_libro) {
        this.codigo_libro = codigo_libro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        

    }
}

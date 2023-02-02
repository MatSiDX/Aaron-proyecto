package modelo;

public class Editorial {

    private int ideditorial;
    private String nombre_edit;
    private String tipo_texto;
    private String fecha_creacion;
    private String funcionamiento;
    private String codigo_edit;
    private String estado;

    public Editorial() {
    }

    public Editorial(int ideditorial, String nombre_edit, String tipo_texto, String fecha_creacion, String funcionamiento, String codigo_edit, String estado) {
        this.ideditorial = ideditorial;
        this.nombre_edit = nombre_edit;
        this.tipo_texto = tipo_texto;
        this.fecha_creacion = fecha_creacion;
        this.funcionamiento = funcionamiento;
        this.codigo_edit = codigo_edit;
        this.estado = estado;
    }

    public Editorial(String nombre_edit, String tipo_texto, String fecha_creacion, String funcionamiento, String codigo_edit, String estado) {
        this.nombre_edit = nombre_edit;
        this.tipo_texto = tipo_texto;
        this.fecha_creacion = fecha_creacion;
        this.funcionamiento = funcionamiento;
        this.codigo_edit = codigo_edit;
        this.estado = estado;
    }

    public int getIdeditorial() {
        return ideditorial;
    }

    public void setIdeditorial(int ideditorial) {
        this.ideditorial = ideditorial;
    }

    public String getNombre_edit() {
        return nombre_edit;
    }

    public void setNombre_edit(String nombre_edit) {
        this.nombre_edit = nombre_edit;
    }

    public String getTipo_texto() {
        return tipo_texto;
    }

    public void setTipo_texto(String tipo_texto) {
        this.tipo_texto = tipo_texto;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getFuncionamiento() {
        return funcionamiento;
    }

    public void setFuncionamiento(String funcionamiento) {
        this.funcionamiento = funcionamiento;
    }

    public String getCodigo_edit() {
        return codigo_edit;
    }

    public void setCodigo_edit(String codigo_edit) {
        this.codigo_edit = codigo_edit;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}

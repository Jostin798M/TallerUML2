import java.util.Date;
import java.util.List;

public class Incidente {
    protected int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;
    protected PersonalAcademico beneficiario;
    private Usuario responsable;  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_reportado() {
        return fecha_reportado;
    }

    public void setFecha_reportado(Date fecha_reportado) {
        this.fecha_reportado = fecha_reportado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List getLog_actualizaciones() {
        return log_actualizaciones;
    }

    public void setLog_actualizaciones(List log_actualizaciones) {
        this.log_actualizaciones = log_actualizaciones;
    }

    public Date getFecha_cerrado() {
        return fecha_cerrado;
    }

    public void setFecha_cerrado(Date fecha_cerrado) {
        this.fecha_cerrado = fecha_cerrado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public PersonalAcademico getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(PersonalAcademico beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Usuario getResponsable() {
        return responsable;
    }

    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
    }
    
    
}

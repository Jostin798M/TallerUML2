
import java.util.List;

public class Administrador extends Usuario{
    public void crearUsuarioConRol(String usuario,String contraseña){}
    public void aisgnarPermiso(String usuario){}
    public void actualizarSoftware(){}
    public void asignarResponsable(Curso curso, Profesor responsable){}

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String getContraseña() {
        return contraseña;
    }

    @Override
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    @Override
    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }
    
    
}

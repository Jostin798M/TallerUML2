
import java.util.List;

public class PersonalAcademico extends Usuario{
    public void reportarError(String email, String contenido){}
    public void solicitarAsesoramientoDelSistema(String email, String contenido){}
    public void comentarEnForo(Foro foro, String comentario){}

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

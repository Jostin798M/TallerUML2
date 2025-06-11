import java.util.List;

public class Profesor extends PersonalAcademico{
    private List<Curso> cursosACargo;
    
    public void cargarActividadSumativa(Curso Curso, ActividadSumativa actividadSumativa){}
    public void calificarActividadSumativa(Curso Curso, Estudiante Estudiante, ActividadSumativa actividadSumativa){}
    public void aceptarInscripcion(Curso Curso, String usuarioEstudiante){}
    public void crearNuevoForo(Foro foro){}

    public List<Curso> getCursosACargo() {
        return cursosACargo;
    }

    public void setCursosACargo(List<Curso> cursosACargo) {
        this.cursosACargo = cursosACargo;
    }

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

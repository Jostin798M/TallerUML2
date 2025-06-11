
import java.util.Date;

public class Evaluacion extends ActividadSumativa {
    private int limiteDeTiempo;

    public int getLimiteDeTiempo() {
        return limiteDeTiempo;
    }

    public void setLimiteDeTiempo(int limiteDeTiempo) {
        this.limiteDeTiempo = limiteDeTiempo;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    @Override
    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    @Override
    public float getPuntajeMaximo() {
        return puntajeMaximo;
    }

    @Override
    public void setPuntajeMaximo(float puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public float getCalificacion() {
        return calificacion;
    }

    @Override
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
    
    
}

package tipos;
import java.util.List;
public class Planetas {
    private String nombre;
    private String tamanio;
    private TipoPlaneta tipo;
    private List<Saterite>Saterites;
    private Double temperatura;
    private Boolean atmosfera;
    private Boolean errante;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public TipoPlaneta getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlaneta tipo) {
        this.tipo = tipo;
    }

    public List<Saterite> getSaterites() {
        return Saterites;
    }

    public void setSaterites(List<Saterite> Saterites) {
        this.Saterites = Saterites;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public Boolean getAtmosfera() {
        return atmosfera;
    }

    public void setAtmosfera(Boolean atmosfera) {
        this.atmosfera = atmosfera;
    }

    public Boolean getErrante() {
        return errante;
    }

    public void setErrante(Boolean errante) {
        this.errante = errante;
    }

    @Override
    public String toString() {
        return "Planetas [nombre=" + nombre + ", tamanio=" + tamanio + ", tipo=" + tipo + ", Saterites=" + Saterites+ ", temperatura=" + temperatura + ", atmosfera=" + atmosfera + ", errante=" + errante + "]";
    }

   
}

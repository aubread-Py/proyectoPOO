package tipos;
import java.util.List;
public class Planetas {
    private String nombre;
    private TipoPlaneta tipo;
    private TamanioPlaneta tamanio;
    private List<Satelites> Satelites;
    private Boolean atmosfera;
    private Double temperatura;
    private Boolean Errante;
    private final Integer id;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public TipoPlaneta getTipo() {
        return tipo;
    }
    public void setTipo(TipoPlaneta tipo) {
        this.tipo = tipo;
    }
    public TamanioPlaneta getTamanio() {
        return tamanio;
    }
    public void setTamanio(TamanioPlaneta tamanio) {
        this.tamanio = tamanio;
    }
    public List<Satelites> getSatelites() {
        return Satelites;
    }
    public void setSatelites(List<Satelites> satelites) {
        Satelites = satelites;
    }
    public Boolean getAtmosfera() {
        return atmosfera;
    }
    public void setAtmosfera(Boolean atmosfera) {
        this.atmosfera = atmosfera;
    }
    public Double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }
    public Boolean getErrante() {
        return Errante;
    }
    public void setErrante(Boolean errante) {
        Errante = errante;
    }
    public Integer getId() {
        return id;
    }
    public String toString() {
        return "Planetas [Planeta: " + nombre + "\n" + (getErrante()==true?"Es errante":"No es errante") + "]";
    }
    public Planetas(String nombre, TipoPlaneta tipo, TamanioPlaneta tamanio, List<tipos.Satelites> satelites, Boolean atmosfera, Double temperatura, Boolean errante, Integer id) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamanio = tamanio;
        Satelites = satelites;
        this.atmosfera = atmosfera;
        this.temperatura = temperatura;
        Errante = errante;
        this.id = id;
    }
}
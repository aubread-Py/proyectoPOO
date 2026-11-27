package tipos;
public class Satelites {
    private String nombre;
    private TipoSatelite tipo;
    private Integer distancia;
    private Planetas planeta;
    private Boolean hielo;
    private final Integer id;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public TipoSatelite getTipo() {
        return tipo;
    }
    public void setTipo(TipoSatelite tipo) {
        this.tipo = tipo;
    }
    public Integer getDistancia() {
        return distancia;
    }
    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }
    public Planetas getPlaneta() {
        return planeta;
    }
    public void setPlaneta(Planetas planeta) {
        this.planeta = planeta;
    }
    public Boolean getHielo() {
        return hielo;
    }
    public void setHielo(Boolean hielo) {
        this.hielo = hielo;
    }
    public Integer getId() {
        return id;
    }
    public String toString() {
        return "Satelites [nombre:" + nombre +  "\nplaneta:" + planeta + "]";
    }
    public Satelites(String nombre, TipoSatelite tipo, Integer distancia, Planetas planeta, Boolean hielo, Integer id) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.distancia = distancia;
        this.planeta = planeta;
        this.hielo = hielo;
        this.id = id;
    }
}
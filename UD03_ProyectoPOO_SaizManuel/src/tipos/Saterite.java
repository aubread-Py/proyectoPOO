package tipos;
public class Saterite {
    private String nombre;
    private String Saterite;
    private String tamanio;
    private Integer distancia;
    private Boolean hielo;
    public Planetas planeta;
    private final Integer id;

    public Saterite(String Saterite, Integer distancia, Boolean hielo, Integer id, String nombre, Planetas planeta, String tamanio) {
        this.Saterite = Saterite;
        this.distancia = distancia;
        this.hielo = hielo;
        this.id = id;
        this.nombre = nombre;
        this.planeta = planeta;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSaterite() {
        return Saterite;
    }

    public String getTamanio() {
        return tamanio;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public Boolean getHielo() {
        return hielo;
    }

    public Planetas getPlaneta() {
        return planeta;
    }

    public Integer getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaterite(String Saterite) {
        this.Saterite = Saterite;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public void setHielo(Boolean hielo) {
        this.hielo = hielo;
    }

    public void setPlaneta(Planetas planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return "Saterite [nombre: " + nombre + "\nplaneta: " + planeta + "]";
    }

    

}

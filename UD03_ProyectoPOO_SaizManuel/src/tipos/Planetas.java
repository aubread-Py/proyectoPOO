package tipos;
import java.util.List;
public class Planetas {
    private Integer numero;
    private String nombre;
    private String tamanio;
    private String tipo;
    private List<Saterite>Saterites;
    private Integer temperatura;

    public Planetas(List<Saterite> Saterites, String nombre, Integer numero, String tamanio, Integer temperatura, String tipo) {
        this.Saterites = Saterites;
        this.nombre = nombre;
        this.numero = numero;
        this.tamanio = tamanio;
        this.temperatura = temperatura;
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Saterite> getSaterites() {
        return Saterites;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSaterites(List<Saterite> saterites) {
        Saterites = saterites;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((tamanio == null) ? 0 : tamanio.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        result = prime * result + ((Saterites == null) ? 0 : Saterites.hashCode());
        result = prime * result + ((temperatura == null) ? 0 : temperatura.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Planetas other = (Planetas) obj;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (tamanio == null) {
            if (other.tamanio != null)
                return false;
        } else if (!tamanio.equals(other.tamanio))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        if (Saterites == null) {
            if (other.Saterites != null)
                return false;
        } else if (!Saterites.equals(other.Saterites))
            return false;
        if (temperatura == null) {
            if (other.temperatura != null)
                return false;
        } else if (!temperatura.equals(other.temperatura))
            return false;
        return true;
    }
}
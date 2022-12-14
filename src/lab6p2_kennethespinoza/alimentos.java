package lab6p2_kennethespinoza;

/**
 *
 * @author Kenneth
 */
public class alimentos {

    private String nombre;
    private String categoria;
    private int costo;
    private int calorias;

    public alimentos(String nombre, String categoria, int costo, int calorias) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.costo = costo;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "alimentos{" + "nombre=" + nombre + ", categoria=" + categoria + ", costo=" + costo + ", calorias=" + calorias + '}';
    }

   
    
    

}


package lab6p2_kennethespinoza;

import java.util.ArrayList;

/**
 *
 * @author Kenneth
 */
public class jugador {
    
    private String nombre;
    private int nvlgordura;
    private int puntos;
    private String alimento;

    public jugador(String nombre, int nvlgordura, int puntos, String alimento) {
        this.nombre = nombre;
        this.nvlgordura = nvlgordura;
        this.puntos = puntos;
        this.alimento = alimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNvlgordura() {
        return nvlgordura;
    }

    public void setNvlgordura(int nvlgordura) {
        this.nvlgordura = nvlgordura;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    
   

        
    
}

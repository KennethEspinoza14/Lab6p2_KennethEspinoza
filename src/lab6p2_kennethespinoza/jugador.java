
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
    private alimentos a;

    public jugador(String nombre, int nvlgordura, int puntos, alimentos a) {
        this.nombre = nombre;
        this.nvlgordura = nvlgordura;
        this.puntos = puntos;
        this.a = a;
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

    public alimentos getA() {
        return a;
    }

    public void setA(alimentos a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "jugador{" + "nombre=" + nombre + ", nvlgordura=" + nvlgordura + ", puntos=" + puntos + ", a=" + a + '}';
    }

   
    
   

        
    
}

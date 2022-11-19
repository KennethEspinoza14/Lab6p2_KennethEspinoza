/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_kennethespinoza;

/**
 *
 * @author Kenneth
 */
public class billetera {
    private int pts_consumo;
    private int costo;

    public billetera(int pts_consumo, int costo) {
        this.pts_consumo = pts_consumo;
        this.costo = costo;
    }

    public int getPts_consumo() {
        return pts_consumo;
    }

    public void setPts_consumo(int pts_consumo) {
        this.pts_consumo = pts_consumo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "billetera{" + "pts_consumo=" + pts_consumo + ", costo=" + costo + '}';
    }
    
    
}

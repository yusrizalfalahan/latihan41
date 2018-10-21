/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan41_massajenis;

/**
 *
 * @author Acer
 */
public class massa {

    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int HitungVolume(int parSisi) {
        return parSisi = sisi * sisi * sisi;
    }

    public int HitungMassaJenis(int parMassa, int Volume) {
        return parMassa = massa / Volume;
    }

}

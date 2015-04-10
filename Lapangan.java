/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tubespbo;

/**
 *
 * @author se7en
 */
public class Lapangan {
    private String nomor, jenis;
    private int tarif;

    public Lapangan(String nomor, String jenis, int tarif) {
        this.nomor = nomor;
        this.jenis = jenis;
        this.tarif = tarif;
    }

    public String getNomor() {
        return nomor;
    }

    public String getJenis() {
        return jenis;
    }

    public int getTarif() {
        return tarif;
    }

    @Override
    public String toString() {
        return "Lapangan" + "\nnomor : " + getNomor() + "\njenis : " + getJenis() + "\ntarif : " + getTarif();
    } 
}

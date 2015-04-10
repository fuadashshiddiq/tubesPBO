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
public class Transaksi {
    private String idTransaksi;
    private double dp, tarif;
    private boolean status;
    private double diskon = 0.1;
    private double total;

    public Transaksi(String idTransaksi, double tarif) {
        this.idTransaksi = idTransaksi;
        this.tarif = tarif;
    }
    
    public void setDp(double dp){
        this.dp = dp;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public double getDp() {
        return dp;
    }

    public double getTarif() {
        return tarif;
    }

    public double getTotal() {
        if(idTransaksi.substring(0, 2).equals("11")){          
            total=(tarif*diskon);
        }else {
            total=tarif;
        }
        return total;
    }
    
    public boolean isStatus() {
        double temp = getTotal() - dp;
        if (temp == 0) {
            status = true;
        }else{
            status = false;
        }
        return status;
    }
    
    public String toString(){
        String str;
        double temp = getTotal() - dp;
        if (status == true) {
            str = "Pembayaran telah lunas";
        }else{
            str = "Pembayaran belum lunas, kekurangan : "+temp;
        }
        return str;
    }    
}

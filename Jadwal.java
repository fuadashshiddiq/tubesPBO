/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tubespbo;

import java.util.*;
/**
 *
 * @author se7en
 */
public class Jadwal {
    private String tanggal;
    private String idPemesan, namaPemesan, noHP;
    private int shift;

    public Jadwal(){
        
    }
    
    public Jadwal(String tanggal, int shift, String idPemesan) {
        this.tanggal = tanggal;
        this.shift = shift;
        this.idPemesan = idPemesan;
    }
 
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setShift(int shift) {
        try{
          if (shift>12){
              throw new IllegalArgumentException("shift maksimal hanya 12");
          }else{
              this.shift=shift;
          }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
//id harus 10 karakter
    public void setIdPemesan(String idPemesan) {
        try{
            if (idPemesan.length()!=10){
                throw new IllegalArgumentException("ID pemesan harus 10 karakter");
            }else {
                this.idPemesan = idPemesan;
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public void setNoHP(String noHP) {
        try{
            if(noHP.length()<11&&noHP.length()>12){
                throw new IllegalArgumentException("nomor HP harus 11 atau 12 digit");
            }else{
                this.noHP=noHP;
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public String getTanggal() {
        return tanggal;
    }

    public int getShift() {
        return shift;
    }

    public String getIdPemesan() {
        return idPemesan;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public String getNoHP() {
        return noHP;
    }

    @Override
    public String toString() {
        return "Jadwal" + "\n idPemesan : " + getIdPemesan() + "\n noHP : " + getNoHP();
    }
    
    
}

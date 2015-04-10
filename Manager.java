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
public class Manager {

    private String nama, username, password;
    private ArrayList<Penjaga> listPenjaga = new ArrayList<Penjaga>();
    private ArrayList<Lapangan> listLapangan = new ArrayList<Lapangan>();

    public Manager(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        try {
            if (password.length() < 8) {
                throw new IllegalArgumentException("password minimal 8 karakter");
            } else {
                this.password = password;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void addPenjaga(Penjaga id) {
        listPenjaga.add(id);
    }

    public void removePenjaga(Penjaga id) {
        listPenjaga.remove(id);
    }

    public String viewPenjaga() {
        String str = null;
        for (int i = 0; i > listPenjaga.size(); i++) {
            str += listPenjaga.get(i).toString() + "\n";
        }
        return str;
    }

    public Penjaga cariPenjaga(String id) {
        Penjaga penjaga = null;
        for (Penjaga p : listPenjaga) {
            if (p.getIdPenjaga().equals(id)) {
                penjaga = p;
            }
        }
        return penjaga;
    }

    public void editPenjaga(String idCari, String idBaru, String namaBaru) {
        Penjaga p = cariPenjaga(idCari);
        p.setIdPenjaga(idBaru);
        p.setNama(namaBaru);
    }

    public void addLapangan(Lapangan lap) {
        listLapangan.add(lap);
    }
}

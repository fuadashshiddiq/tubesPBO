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
public class Penjaga {

    private String nama, username, password, idPenjaga;
    private ArrayList<Jadwal> listJadwal = new ArrayList<Jadwal>();
    private ArrayList<Member> listMember = new ArrayList<Member>();
    
    public Penjaga(){
        
    }

    public Penjaga(String idPenjaga, String nama, String username, String password) {
        this.idPenjaga = idPenjaga;
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public void setIdPenjaga(String idPenjaga) {
        try{
            if (idPenjaga.length()<10){
                throw new IllegalArgumentException("ID penjaga harus 10 karakter");
            }else {
                this.idPenjaga = idPenjaga;
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
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

    public String getIdPenjaga() {
        return idPenjaga;
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

    public void addMember(Member id) {
        listMember.add(id);
    }

    public void removeMember(String id) {
        listMember.remove(cariMember(id));
    }

    public String viewMember() {
        String str = null;
        for (int i = 0; i < listMember.size(); i++) {
            str += listMember.get(i).toString() + "\n";
        }
        return str;
    }

    public Member cariMember(String id) {
        Member member = null;
        for (Member m : listMember) {
            if (m.getIdMember().equals(id)) {
                member = m;
            }
        }
        return member;
    }

    public void editMember(String id, String idBaru, String namaBaru) {
        Member m = cariMember(id);
        m.setIdMember(idBaru);
        m.setNama(namaBaru);
    }

    public void addJadwal(Jadwal a) {
        listJadwal.add(a);
    }

    public void removeJadwal(String a) {
        listJadwal.remove(a);
    }

    public Jadwal cariJadwal(String idPesan) {
        Jadwal jadwal = null;
        for (Jadwal j : listJadwal) {
            if (j.getIdPemesan().equals(idPesan)) {
                jadwal = j;
            }
        }
        return jadwal;
    }

    public String viewJadwal() {
        String str = null;
        for (int i = 0; i > listJadwal.size(); i++) {
            str += listJadwal.get(i).toString() + "\n";
        }
        return str;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesananlapanganfutsal;

import java.util.ArrayList;

/**
 *
 * @author Kelompok 7 Tubes PBO IF 37 06
 */
public class SistemLapangan {

    String str;
    private String nama;
    private double total;
    private double diskon = 0.1;
    private boolean status;
    private ArrayList<Member> listMember;
    private ArrayList<Jadwal> listJadwal;
    private ArrayList<Penjaga> listPenjaga;
    private ArrayList<Manager> listManager;
    private ArrayList<Lapangan> listLapangan;
    private ArrayList<Transaksi> listTransaksi;
    Jadwal t;
    Lapangan l;

    /**
     * @param nama
     *
     * Constructor Sistem Lapangan Meng-set nama Lapangan Futsal dan
     * Menginstansiasi array list Member, Penjaga, Manager, Transaksi, Lapangan,
     * Jadwal
     */
    public SistemLapangan(String nama) {
        this.nama = nama;
        listMember = new ArrayList<Member>();
        listPenjaga = new ArrayList<Penjaga>();
        listManager = new ArrayList<Manager>();
        listTransaksi = new ArrayList<Transaksi>();
        listLapangan = new ArrayList<Lapangan>();
        listJadwal = new ArrayList<Jadwal>();
    }

    /**
     *
     * @param m Add Member digunakan untuk menambahkan Member baru ke dalam list
     * Member
     *
     */
    public void addMember(Member m) {
        listMember.add(m);
    }

    /**
     *
     * @param m Remove Member digunakan untuk menghapus Member dari list Member
     */
    public void removeMember(Member m) {
        listMember.remove(m);
    }

    /**
     *
     * @return str View Member digunakan untuk menampikan nama , id , no
     * telephone , alamat dari list Member
     */
    public String viewMember() {
        String str = "";
        for (int i = 0; i < listMember.size(); i++) {
            str += listMember.get(i).toString() + "\n";
        }
        if (str.equals(null)) {
            str = "List Member masih kosong";
            return str;
        } else {
            return str;
        }
    }

    /**
     *
     * @param id
     * @return member Cari member digunakan untuk mencari member yang ada di
     * dalam list Member
     */
    public Member cariMember(String id) {
        Member member = null;
        for (Member m : listMember) {
            if (m.getIdMember().equals(id)) {
                member = m;
            }
        }
        return member;
    }

    /**
     *
     * @param id
     * @param idBaru
     * @param namaBaru
     *
     * Edit member digunakan untuk mengedit ID dan nama Member yang ada di list
     * Member
     */
    public void editMember(String id, String idBaru, String namaBaru) {
        Member m = cariMember(id);
        m.setIdMember(idBaru);
        m.setNama(namaBaru);
    }

    public void addPenjaga(Penjaga id) {
        listPenjaga.add(id);
    }

    public void removePenjaga(Penjaga id) {
        listPenjaga.remove(id);
    }

    public String viewPenjaga() {
        String str = "";
        for (int i = 0; i < listPenjaga.size(); i++) {
            str += listPenjaga.get(i).toString() + "\n";
        }
        if (str.equals(null)) {
            str = "List Penjaga masih kosong";
            return str;
        } else {
            return str;
        }
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

    public Lapangan cariLapangan(String nlap) {
        Lapangan lapangan = null;
        boolean status = false;
        for (Lapangan l : listLapangan) {
            if (l.getNama().equals(nlap)) {
                status = true;
                lapangan = l;
            }
        }
        return lapangan;
    }

    public void addJadwal(Jadwal a) {
        listJadwal.add(a);
    }

    public void removeJadwal(Jadwal a) {
        listJadwal.remove(a);
    }

    public Jadwal cariJadwal(String idJadwal) {
        Jadwal jadwal = null;
        for (Jadwal j : listJadwal) {
            if (j.getIdJadwal().equals(idJadwal)) {
                jadwal = j;
            }
        }
        return jadwal;
    }

    public String viewJadwal() {
        String str = "";
        for (int i = 0; i < listJadwal.size(); i++) {
            str += listJadwal.get(i).toString() + "\n Keterangan pembayaran : \n" + keteranganPembayaran();
            if (str.equals(null)) {
                str = "List Jadwal masih kosong";
                return str;
            }
        }
        return str;
    }

    public String getNama() {
        return nama;
    }

    public void setTotal(String idMem, double tarif) {
        for (Member m : listMember) {
            if (m.getIdMember().equals(idMem)) {
                total = tarif - (tarif * diskon);
            } else {
                total = tarif;
            }
        }
    }

    public double getTotal() {
        return total;
    }

    public boolean isStatus() {
        double temp = getTotal() - t.getDp();
        if (temp == 0) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    public String keteranganPembayaran() {
        String str;
        double temp = getTotal() - t.getDp();
        isStatus();
        if (status == true) {
            str = "Pembayaran telah lunas";
        } else {
            str = "Pembayaran belum lunas, kekurangan : " + temp;
        }
        return str;
    }

    public void pelunasan(double lunas, double dp) {
        double temp = getTotal() - dp;
        double uang = temp - lunas;
        if (uang == 0) {
            str = "Terimakasih telah melakukan pelunasan";
        } else if (uang > 0) {
            str = "Pembayaran masih belum lunas, kekurangan : " + uang;
        } else {
            str = "Input pelunasan salah";
        }
    }

    public String getPelunasan() {
        return str;
    }

    public void addTransaksi(Transaksi a) {
        listTransaksi.add(a);
    }

    public boolean cariIDPemesan(String idp) {
        boolean stat = false;
        for (Jadwal jadd : listJadwal) {
            if (jadd.getIdPemesan().equals(idp)) {
                stat = true;
            } else {
                stat = false;
            }
        }
        return stat;
    }

    public boolean cekPenjaga(String username, String pass) {
        boolean cek = false;
        for (Penjaga p : listPenjaga) {
            if (p.getUsername().equals(username) && p.getPassword().equals(pass)) {
                cek = true;
            } else {
                cek = false;
            }
        }
        return cek;
    }

    public boolean cekIDPenjaga(String id) {
        boolean cek = false;
        for (Penjaga p : listPenjaga) {
            if (p.getIdPenjaga().equals(id)) {
                cek = true;
            } else {
                cek = false;
            }
        }
        return cek;
    }

    public boolean cekIDMember(String id) {
        boolean cek = false;
        for (Member p : listMember) {
            if (p.getIdMember().equals(id)) {
                cek = true;
            } else {
                cek = false;
            }
        }
        return cek;
    }

    public boolean cekIDJadwal(String id) {
        boolean cek = false;
        for (Jadwal p : listJadwal) {
            if (p.getIdJadwal().equals(id)) {
                cek = true;
            } else {
                cek = false;
            }
        }
        return cek;
    }
}

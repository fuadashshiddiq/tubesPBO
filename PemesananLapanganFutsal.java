/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesananlapanganfutsal;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Samsung
 */
public class PemesananLapanganFutsal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Penjaga> listPenjaga = null;
        ArrayList<Lapangan> listLapangan = null;
        ArrayList<Jadwal> listJadwal = null;
        boolean status = true;
        Scanner a1 = new Scanner(System.in);
        int a, b, inp = 0;
        Penjaga pjg = null;
        double tarif = 0;
        double dp = 0;
        SistemLapangan sys = new SistemLapangan("IFI");
        Jadwal j = null;
        Lapangan l = null;
        do {
            System.out.println("SISTEM PENGELOLAAN LAPANGAN FUTSAL " + sys.getNama());
            System.out.println("1. MANAGER");
            System.out.println("2. PENJAGA");
            System.out.println("3. EXIT");
            System.out.print("Masukkan pilihan user : ");
            inp = a1.nextInt();
            switch (inp) {
                case 1:
                    do {
                        System.out.print("Username : ");
                        String user = a1.next();
                        System.out.print("Password : ");
                        String pass = a1.next();
                        if (user.equals("manager") && pass.equals("yangpunya")) {
                            do {
                                System.out.println("MENU PEMESANAN LAPANGAN FUTSAL MANAGER");
                                System.out.println("1. Tambah Penjaga");
                                System.out.println("2. Hapus Penjaga");
                                System.out.println("3. Edit Penjaga");
                                System.out.println("4. Cari Penjaga");
                                System.out.println("5. View Penjaga");
                                System.out.println("6. Tambah Lapangan");
                                System.out.println("7. Laporan");
                                System.out.println("8. Exit");
                                System.out.print("pilihan menu : ");
                                b = a1.nextInt();
                                switch (b) {
                                    case 1:
                                        System.out.print("Masukkan Username penjaga : ");
                                        String userPjg = a1.next();
                                        System.out.print("Masukkan Password penjaga : ");
                                        String passPjg = a1.next();
                                        System.out.print("Masukkan nama penjaga : ");
                                        String namaPjg = a1.next();
                                        System.out.print("Masukkan ID Penjaga : ");
                                        String idpjg = null;
                                        try {
                                            idpjg = a1.next();
                                            if (idpjg.length() < 10 || idpjg.length() > 10) {
                                                System.out.println("Panjang ID harus 10 karakter");
                                                idpjg = "";
                                                break;
                                            } else if (sys.cekIDPenjaga(idpjg)){
                                                System.out.println("ID Penjaga sudah ada");
                                                idpjg = "";
                                                break;
                                            }
                                        } catch (IllegalArgumentException e) {
                                            System.out.println(e.getMessage());
                                        }                                        
                                        pjg = new Penjaga(userPjg, passPjg, namaPjg, idpjg);
                                        sys.addPenjaga(pjg);
                                        break;
                                    case 2:
                                        System.out.print("Masukkan ID Penjaga yang ingin di hapus : ");
                                        String idsearch = a1.next();
                                        Penjaga temp2 = sys.cariPenjaga(idsearch);
                                        if (temp2 == null) {
                                            System.out.println("Penjaga tidak ditemukan");
                                        } else {
                                            sys.removePenjaga(temp2);
                                        }
                                        break;
                                    case 3:
                                        try {
                                            System.out.print("Masukkan ID Penjaga yang ingin dirubah : ");
                                            String idlama = a1.next();
                                            System.out.print("Masukkan ID Penjaga baru : ");
                                            String idbaru = a1.next();
                                            System.out.print("Masukkan nama Penjaga baru : ");
                                            String namabaru = a1.next();
                                            sys.editPenjaga(idlama, idbaru, namabaru);
                                        } catch (Exception e) {
                                            System.out.println("Input ada yang salah , Silahkan Cek Kembali");
                                        }
                                        break;
                                    case 4:
                                        System.out.print("Masukkan ID yang dicari : ");
                                        String idca = a1.next();
                                        Penjaga temp = sys.cariPenjaga(idca);
                                        if (temp == null) {
                                            System.out.println("Penjaga tidak ditemukan");
                                        } else {
                                            System.out.println(temp);
                                        }
                                        break;
                                    case 5:
                                        System.out.println(sys.viewPenjaga());
                                        break;
                                    case 6:
                                        System.out.print("Masukkan nama Lapangan : ");
                                        String namaLap = a1.next();
                                        System.out.print("Masukkan jenis Lapangan (vinyl / syntetis) : ");
                                        String jenLap = a1.next();
                                        System.out.print("Masukkan Tarif Lapangan : ");
                                        tarif = a1.nextDouble();
                                        Lapangan lap = new Lapangan(namaLap, jenLap, tarif);
                                        sys.addLapangan(lap);
                                        break;
                                    case 7:
                                        sys.toString();
                                    case 8:
                                        System.out.println("TERIMAKASIH MANAGER");
                                        break;
                                }
                            } while (b != 8);
                            status = false;
                        } else {
                            System.out.println("Username atau Password salah");
                            status = true;
                        }
                    } while (status == true);
                    break;
                case 2:
                    do {
                        System.out.print("Username : ");
                        String user = a1.next();
                        System.out.print("Password : ");
                        String pass = a1.next();
                        if (sys.cekPenjaga(user, pass) == true) {
                            do {
                                System.out.println("MENU PEMESANAN LAPANGAN FUTSAL PENJAGA");
                                System.out.println("1. Tambah Member");
                                System.out.println("2. Hapus Member");
                                System.out.println("3. Edit Member");
                                System.out.println("4. Cari Member");
                                System.out.println("5. View Member");
                                System.out.println("6. Tambah Jadwal");
                                System.out.println("7. Hapus Jadwal");
                                System.out.println("8. Cari Jadwal");
                                System.out.println("9. View Jadwal");
                                System.out.println("10. Pembayaran Lapangan Futsal");
                                System.out.println("11. Exit");
                                System.out.print("pilihan menu : ");
                                a = a1.nextInt();
                                switch (a) {
                                    case 1:
                                        Member m = null;
                                        System.out.print("Masukkan nama Member: ");
                                        String nama = a1.next();
                                        System.out.print("Masukkan ID Member : ");
                                        String id = "";
                                        try {
                                            id = a1.next();
                                            if (id.length() < 10 || id.length() > 10) {
                                                System.out.println("Panjang ID harus 10 karakter");
                                                id = "";
                                                break;
                                            } else if (sys.cekIDMember(id)){
                                                System.out.println("ID Member sudah ada");
                                                id = "";
                                                break;
                                            }
                                        } catch (IllegalArgumentException e) {
                                            System.out.println(e.getMessage());
                                        }
                                        System.out.print("Masukkan Nomor Telephone : ");
                                        String noTlp = a1.next();
                                        System.out.print("Masukkan Alamat : ");
                                        String alamat = a1.next();
                                        m = new Member(nama, id, noTlp, alamat);
                                        sys.addMember(m);
                                        break;
                                    case 2:
                                        System.out.print("Masukkan ID member yang ingin di hapus : ");
                                        String idcari = a1.next();
                                        Member temp = sys.cariMember(idcari);
                                        if (temp == null) {
                                            System.out.println("Member tidak ditemukan");
                                        } else {
                                            sys.removeMember(temp);
                                        }
                                        break;
                                    case 3:
                                        System.out.print("Masukkan ID Member yang ingin dirubah : ");
                                        String idlama = a1.next();
                                        System.out.print("Masukkan ID Member baru : ");
                                        String idbaru = a1.next();
                                        System.out.print("Masukkan nama baru : ");
                                        String namabaru = a1.next();
                                        sys.editMember(idlama, idbaru, namabaru);
                                        break;
                                    case 4:
                                        System.out.print("Masukkan ID Member yang dicari : ");
                                        String idca = a1.next();
                                        Member tempp = sys.cariMember(idca);
                                        if (tempp == null) {
                                            System.out.println("Member tidak ditemukan");
                                        } else {
                                            System.out.println(tempp);
                                        }
                                        break;
                                    case 5:
                                        System.out.println(sys.viewMember());
                                        break;
                                    case 6:
                                        System.out.print("Masukkan ID Jadwal : ");
                                        String idj = "";
                                        try {
                                            idj = a1.next();
                                            if (idj.length() < 10 || idj.length() > 10) {
                                                System.out.println("Panjang ID harus 10 karakter");
                                                idj = "";
                                                break;
                                            } else if (sys.cekIDJadwal(idj)){
                                                System.out.println("ID Jadwal sudah ada");
                                                idj = "";
                                                break;
                                            }
                                        } catch (IllegalArgumentException e) {
                                            System.out.println(e.getMessage());
                                        }
                                        System.out.print("Masukkan tanggal (DD-MM-YYYY) : ");
                                        String tgl = "";
                                        try {
                                            tgl = a1.next();
                                        } catch (Exception e) {
                                            System.out.println("Format Tanggal yang anda masukkan salah");
                                            break;
                                        }
                                        System.out.print("Masukkan shift : ");
                                        int shift = 0;
                                        try {
                                            shift = a1.nextInt();
                                            if (shift > 12 && shift < 0) {
                                                System.out.println("Shift yang anda masukkan melampaui batas");
                                                shift = 0;
                                                break;
                                            }
                                        } catch (Exception e) {
                                            System.out.println(e.getMessage());
                                        }
                                        System.out.print("Masukkan ID pemesan : ");
                                        String idpes = "";
                                        try {
                                            idpes = a1.next();
                                            if (idpes.length() < 10 || idpes.length() > 10) {
                                                System.out.println("Panjang ID harus 10 karakter");
                                                idpes = null;
                                                break;
                                            }
                                        } catch (Exception e) {
                                            System.out.println(e.getMessage());
                                        }
                                        System.out.print("Masukkan nama lapangan yang dipakai : ");
                                        String nmlap = a1.next();
                                        Lapangan lap = sys.cariLapangan(nmlap);
                                        if (lap == null) {
                                            System.out.println("Lapangan tidak tersedia");
                                            break;
                                        } else {
                                            System.out.println("Lapangan tersedia");
                                            System.out.println(lap.toString());
                                        }
                                        System.out.print("Apakah anda Member (yes/no) : ");
                                        String pilMem = a1.next();
                                        switch (pilMem) {
                                            case "yes":
                                                System.out.print("Masukkan ID Member : ");
                                                String idmemb = a1.next();
                                                Member tempMem = sys.cariMember(idmemb);
                                                String idMem = tempMem.getIdMember();
                                                sys.setTotal(idMem, tarif);
                                                System.out.println("Jumlah biaya yang telah di diskon adalah : " + sys.getTotal());
                                                System.out.print("Masukkan jumlah uang muka : ");
                                                dp = a1.nextDouble();
                                                if (dp > sys.getTotal()) {
                                                    System.out.println("Pembayaran DP terlalu banyak");
                                                    break;
                                                } else {
                                                    double tempdp = dp;
                                                    System.out.println("Pembayaran DP berhasil dilakukan");
                                                }
                                                j = new Jadwal(idj, tgl, shift, idpes, dp);
                                                sys.addJadwal(j);
                                                break;
                                            case "no":
                                                System.out.println("Jumlah biaya total adalah : " + lap.getTarif());
                                                System.out.print("Masukkan jumlah uang muka : ");
                                                dp = a1.nextDouble();
                                                if (dp > lap.getTarif()) {
                                                    System.out.println("Pembayaran DP terlalu banyak");
                                                    break;
                                                } else {
                                                    double tempdp = dp;
                                                    System.out.println("Pembayaran DP berhasil dilakukan");
                                                }
                                                j = new Jadwal(idj, tgl, shift, idpes, dp);
                                                sys.addJadwal(j);
                                                break;
                                        }
                                        System.out.print("Masukkan ID Transaksi : ");
                                        String idt = a1.next();         
                                        break;
                                    case 7:
                                        System.out.print("Masukkan ID jadwal yang ingin di hapus : ");
                                        String idjad = a1.next();
                                        Jadwal jd = sys.cariJadwal(idjad);
                                        if (jd == null) {
                                            System.out.println("Jadwal tidak ditemuka");
                                        } else {
                                            sys.removeJadwal(jd);
                                        }
                                        break;
                                    case 8:
                                        System.out.print("Masukkan ID jadwal yang dicari : ");
                                        String idja = a1.next();
                                        Jadwal tempj = sys.cariJadwal(idja);
                                        if (tempj == null) {
                                            System.out.println("Jadwal " + idja + " tidak ditemukan");
                                        } else {
                                            System.out.println(tempj);
                                        }
                                        break;
                                    case 9:
                                        System.out.println(sys.viewJadwal());
                                        break;
                                    case 10:
                                        System.out.print("Masukkan ID Pemesan yang akan melunasi pembayaran : ");
                                        String idpesanlunas;
                                        idpesanlunas = a1.next();
                                        boolean stat = sys.cariIDPemesan(idpesanlunas);
                                        if (stat == true ){
                                            System.out.println("ID pemesan ditemukan");
                                            System.out.println("Masukkan jumlah pelunasan : ");
                                            double lunas = a1.nextDouble();
                                            sys.pelunasan(lunas, dp);
                                            System.out.println(sys.getPelunasan());
                                        }else {
                                            System.out.println("ID Pemesan tidak ditemukan");
                                            break;
                                        }
                                        break;
                                    case 11:
                                        System.out.println("TERIMAKASIH PENJAGA ");
                                        break;
                                }
                            } while (a != 11);
                            status = false;
                        } else {
                            System.out.println("Username atau Password salah");
                            status = true;
                        }
                        
                    } while (status == true);
                    break;
                case 3:
                    System.out.println("TERIMAKASIH TELAH MENGGUNAKAN APLIKASI LAPANGAN FUTSAL " + sys.getNama());
                    break;
            }
        } while (inp != 3);
    }
}

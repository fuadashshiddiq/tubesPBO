/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author se7en
 */
public class TubesPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner a1 = new Scanner(System.in);
        int a = 0;
        //Member m;
        //Member m = new Member();
        Penjaga p = new Penjaga();
        //Jadwal j = new Jadwal();
        do {
            System.out.println("MENU PEMESANAN LAPANGAN FUTSAL");
            System.out.println("1. Tambah Member");
            System.out.println("2. Hapus Member");
            System.out.println("3. Edit Member");
            System.out.println("4. Cari Member");
            System.out.println("5. View Member");
            System.out.println("6. Tambah Jadwal");
            System.out.println("7. Hapus Jadwal");
            System.out.println("8. View Jadwal");
            System.out.println("9. Cari Jadwal");
            System.out.println("10. Exit");
            System.out.println("pilihan menu : ");
            //try {
            a = a1.nextInt();
            /*} catch (Exception e) {
             System.out.println(e.getMessage());
             } finally {
             a1 = new Scanner(System.in);
             }*/
            switch (a) {
                case 1:
                    System.out.println("Masukkan nama : ");
                    String nama = a1.next();
                    System.out.println("Masukkan ID : ");
                    String id = a1.next();
                    Member m = new Member(nama, id);
                    p.addMember(m);
                    break;
                case 2:
                    System.out.println("Masukkan ID member yang ingin di hapus : ");
                    String idcari = a1.next();
                    p.removeMember(idcari);
                    break;
                case 3:
                    System.out.println("Masukkan ID lama : ");
                    String idlama = a1.next();
                    System.out.println("Masukkan ID baru : ");
                    String idbaru = a1.next();
                    System.out.println("Masukkan nama baru : ");
                    String namabaru = a1.next();
                    p.editMember(idlama, idbaru, namabaru);
                    break;
                case 4:
                    System.out.println("Masukkan ID yang dicari : ");
                    String idca = a1.next();
                    System.out.println(p.cariMember(idca));
                    break;
                case 5:
                    System.out.println(p.viewMember());
                    break;
                case 6:
                    System.out.println("Masukkan tanggal : ");
                    String tgl = a1.next();
                    System.out.println("Masukkan shift : ");
                    int shift = a1.nextInt();
                    System.out.println("Masukkan ID pemesan : ");
                    String idpes = a1.next();
                    Jadwal j = new Jadwal(tgl, shift, idpes);
                    p.addJadwal(j);
                    break;
                case 7:
                    System.out.println("Masukkan ID jadwal yang ingin di hapus : ");
                    String idjad = a1.next();
                    p.removeJadwal(idjad);
                    break;
                case 8:
                    System.out.println("Masukkan ID jadwal yang dicari : ");
                    String idja = a1.next();
                    System.out.println(p.cariJadwal(idja));
                    break;
                case 9:
                    System.out.println(p.viewJadwal());
                    break;
                case 10:
                    break;
            }
        } while (a != 10);
    }
}

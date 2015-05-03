/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemesananlapanganfutsal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick
 */
public class MenuManager extends javax.swing.JFrame {

    /**
     * Creates new form MenuManager
     */
    MenuUtama mu;
    tambahpenjaga tp;
    caripenjaga cp;
    editpenjaga ep;
    hapuspenjaga hp;
    tambahlapangan tl;
    viewpenjaga vp;

    public MenuManager(SistemLapangan sys) {
        initComponents();
        Controller c = new Controller();
        c.setModel(sys);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        btnTambahPenjaga = new javax.swing.JButton();
        btnEditPenjaga = new javax.swing.JButton();
        btnViewPenjaga = new javax.swing.JButton();
        btnHapusPenjaga = new javax.swing.JButton();
        btnCariPenjaga = new javax.swing.JButton();
        btnTambahLapangan = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("MENU MANAGER");

        btnTambahPenjaga.setText("Tambah Penjaga");

        btnEditPenjaga.setText("Edit Penjaga");

        btnViewPenjaga.setText("View Penjaga");

        btnHapusPenjaga.setText("Hapus Penjaga");

        btnCariPenjaga.setText("Cari Penjaga");

        btnTambahLapangan.setText("Tambah Lapangan");

        btnLogout.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogout)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnViewPenjaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTambahPenjaga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEditPenjaga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTambahLapangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCariPenjaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnHapusPenjaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahPenjaga)
                    .addComponent(btnHapusPenjaga))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditPenjaga)
                    .addComponent(btnCariPenjaga))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewPenjaga)
                    .addComponent(btnTambahLapangan))
                .addGap(27, 27, 27)
                .addComponent(btnLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariPenjaga;
    private javax.swing.JButton btnEditPenjaga;
    private javax.swing.JButton btnHapusPenjaga;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTambahLapangan;
    private javax.swing.JButton btnTambahPenjaga;
    private javax.swing.JButton btnViewPenjaga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    public void addListener(ActionListener e) {
        btnLogout.addActionListener(e);
        btnTambahPenjaga.addActionListener(e);
        btnHapusPenjaga.addActionListener(e);
        btnCariPenjaga.addActionListener(e);
        btnEditPenjaga.addActionListener(e);
        btnTambahLapangan.addActionListener(e);
        btnViewPenjaga.addActionListener(e);
    }


    private class Controller implements ActionListener {

        private SistemLapangan sys;
        
        public Controller() {
            addListener(this);
        }

        public void setModel(SistemLapangan sys) {
            this.sys = sys;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object source = ae.getSource();
            if (source.equals(btnLogout)) {
                JOptionPane.showMessageDialog(null, "TERIMAKASIH MANAGER", "", JOptionPane.INFORMATION_MESSAGE);
                mu = new MenuUtama(sys);
                mu.setVisible(true);
                setVisible(false);
            } else if (source.equals(btnTambahPenjaga)) {
                tp = new tambahpenjaga(sys);
                tp.setVisible(true);
                setVisible(false);
            } else if (source.equals(btnCariPenjaga)) {
                cp = new caripenjaga(sys);
                cp.setVisible(true);
                setVisible(false);
            } else if (source.equals(btnEditPenjaga)) {
                ep = new editpenjaga(sys);
                ep.setVisible(true);
                setVisible(false);
            } else if (source.equals(btnHapusPenjaga)) {
                hp = new hapuspenjaga(sys);
                hp.setVisible(true);
                setVisible(false);
            } else if (source.equals(btnTambahLapangan)) {
                tl = new tambahlapangan(sys);
                tl.setVisible(true);
                setVisible(false);
            } else if (source.equals(btnViewPenjaga)) {
                vp = new viewpenjaga(sys);
                vp.setVisible(true);
                setVisible(false);
            }
        }
    }
}
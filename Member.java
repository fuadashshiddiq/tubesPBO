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
public class Member {
    private String nama, idMember;

    public Member(){
        
    }
    
    public Member(String nama, String idMember) {
        this.nama = nama;
        this.idMember = idMember;
    }

    public String getNama() {
        return nama;
    }

    public String getIdMember() {
        return idMember;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIdMember(String idMember) {
        try {
            if (idMember.length() < 10) {
                throw new IllegalArgumentException("ID Member minimal 10 karakter");
            } else {
                this.idMember = idMember;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Member" + "\nnama : " + getNama() + "\nidMember : " + getIdMember();
    }
}

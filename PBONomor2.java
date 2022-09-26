/*
NAMA    :   MUHAMMAD HARITS FIRDAUS
NIM     :   20210040087
KELAS   :   TI21A
 */
package tugaspbopengenalan;

import javax.swing.JOptionPane;

    
public class PBONomor2 {
    public static void main(String[] args) {
        String nama ="";
        nama = JOptionPane.showInputDialog("Anda Sedang Belajar Apa ?");
        String pesan = ( "belajar " + nama + " sangat mudah");
        JOptionPane.showMessageDialog(null, pesan);        
    }
}


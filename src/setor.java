


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dhea
 */
import javax.swing.JOptionPane;
class setor {
    private int saldo;
    void menabung(int bal, int s) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(s%100!=0)
            JOptionPane.showMessageDialog(null,
                    "MesinATM BRI tidak menerima uang koin \nSilahkan ulangi kembali",
                    "Transaksi Gagal",0);
        else if(s<50000)
            JOptionPane.showMessageDialog(null, 
                    "Besaran minimal setor tunai adalah Rp 50000,00","ERROR",0);
        else if(s>=50000)
            saldo = bal+s;
            JOptionPane.showMessageDialog(null,
                    "Saldo Anda saat ini sebesar : " + saldo);
    }

    int getsaldo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return saldo;
    }
    
}

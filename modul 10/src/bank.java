
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AGNES
 */
public class bank {
    public static void main (String args[]){
        String str, strl;
        int choice,z,pin=1234,counter=0,a=3;
        int t,s,tab=50000;

        JOptionPane.showMessageDialog(null, "Selamat Datang\n ANJUNGAN TUNAI MANDIRI \n BNI SYARIAH-BOJONEGORO \n\n Masukkan 4 Digit PIN Anda !","WELCOME",1);
        try {
            do {
                str = JOptionPane.showInputDialog(null, "Masukkan 4 Digit PIN Anda:", "ATM BNI SYARIAH-BOJONEGORO",0);
                pin = Integer.parseInt(str);
                counter+=1; //menghitung kesempatan login
                
                if (pin==1234) //cek pin
                    do {
                        str = JOptionPane.showInputDialog(null, "[1] INFORMASI SALDO \n [2] PENYETORAN \n [3] PENARIKAN \n [4] PETUNJUK \n [5] KELUAR \n\n Masukkan Pilihan Menu:","Pilih Transaksi",3);
                        
                    }
                
                
            }
            
        } }
    }
    

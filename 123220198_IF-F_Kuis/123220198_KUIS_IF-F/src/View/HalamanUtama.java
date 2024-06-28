/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220198_kuis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Lab Informatika
 */
public class HalamanUtama extends JFrame implements ActionListener{
    JLabel Header = new JLabel();
    JLabel subHeader = new JLabel("Silahkan pilih menu dibawah untuk membeli majalah");
    
    JButton majalahAnak = new JButton("Majalah Anak");
    JButton majalahRemaja = new JButton("Majalah Remaja");
    JButton majalahDewasa = new JButton("Majalah Dewasa");
    
    HalamanUtama(String username){
        setVisible(true);
        setSize(500,450);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        //tampil JLabel
        add(Header);
        Header.setText("Selamat Datang, " + username);
        Header.setBounds(20, 20, 440, 24);
        Header.setFont(Header.getFont().deriveFont(20.0f));
        add(subHeader);
        subHeader.setBounds(20, 50, 440, 24);
        
        //tampil JButton
        add(majalahAnak);
        majalahAnak.setBounds(20, 100, 440, 25);
        majalahAnak.addActionListener(this);
        add(majalahRemaja);
        majalahRemaja.setBounds(20, 140, 440, 25);
        majalahRemaja.addActionListener(this);
        add(majalahDewasa);
        majalahDewasa.setBounds(20, 180, 440, 25);
        majalahDewasa.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()== majalahAnak){
                new HalamanPembelianAnak();
            }else if(e.getSource()== majalahRemaja){
                new HalamanPembelianRemaja();
            }else if(e.getSource()== majalahDewasa){
                new HalamanPembelianDewasa();
            }
        }catch(Exception Error){
           
        }
    }
}

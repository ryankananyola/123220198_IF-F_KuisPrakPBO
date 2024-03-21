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
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class HalamanPembelianDewasa extends JFrame implements ActionListener {
      JLabel Header = new JLabel("Halaman Pembelian");
    JLabel labelKategori = new JLabel("Kategori");
    JLabel hasilKategori = new JLabel();
    JLabel labelHarga = new JLabel("Harga");
    JLabel hasilHarga = new JLabel();
    JLabel labelInputJumlah = new JLabel("Jumlah");
    JLabel labelTotalPembelian = new JLabel("Total Pembelian");
    JLabel labelHargaSatuan = new JLabel("Harga Satuan");
    JLabel hasilHargaSatuan = new JLabel();
    JLabel labelJumlah = new JLabel("Jumlah");
    JLabel hasilJumlah = new JLabel();
    JLabel labelTotalHarga = new JLabel("Total Harga");
    JLabel hasilTotalHarga = new JLabel();
    
    JTextField inputJumlah = new JTextField();
    
    JButton tombolKembali = new JButton("Kembali");
    JButton tombolBeli = new JButton("Beli");
    
    HalamanPembelianDewasa(){
        setVisible(true);
        setSize(500,450);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(Header);
        Header.setBounds(20, 20, 440, 24);
        Header.setFont(Header.getFont().deriveFont(20.0f));
        add(labelKategori);
        labelKategori.setBounds(20, 60, 440, 24);
        add(hasilKategori);
        hasilKategori.setText("Majalah Dewasa");
        hasilKategori.setBounds(190, 60, 440, 24);
        add(labelHarga);
        labelHarga.setBounds(20, 90, 440, 24);
        add(hasilHarga);
        hasilHarga.setText("Rp26.900 /pcs");
        hasilHarga.setBounds(190, 90, 440, 24);
        add(labelInputJumlah);
        labelInputJumlah.setBounds(20, 120, 440, 24);
        
        add(inputJumlah);
        inputJumlah.setBounds(190, 120, 250, 24);
        
        add(tombolKembali);
        tombolKembali.setBounds(40, 160, 200, 24);
        add(tombolBeli);
        tombolBeli.setBounds(250, 160, 200, 24);
        
        add(labelTotalPembelian);
        labelTotalPembelian.setBounds(20, 210, 440, 24);
        add(labelHargaSatuan);
        labelHargaSatuan.setBounds(20, 240, 440, 24);
        add(hasilHargaSatuan);
        hasilHargaSatuan.setText("Rp26.900");
        hasilHargaSatuan.setBounds(190, 240, 440, 24);
        add(labelJumlah);
        labelJumlah.setBounds(20, 270, 440, 24);
        add(hasilJumlah);
        hasilJumlah.setText("Ini hasil Input");
        hasilJumlah.setBounds(190, 270, 440, 24);
        add(labelTotalHarga);
        labelTotalHarga.setBounds(20, 300, 440, 24);
        add(hasilTotalHarga);
        hasilTotalHarga.setText("Ini Total Harga");
        hasilTotalHarga.setBounds(190, 300, 440, 24);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Double jumlah = Double.valueOf(inputJumlah.getText());
        
        
    }

}

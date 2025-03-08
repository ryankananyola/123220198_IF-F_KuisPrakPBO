package View.HalPembelian;

import Perhitungan.Harga;
import View.HalamanUtama;
import View.Session;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JFrame;
import javax.swing.*;

public class HalamanPembelianRemaja extends JFrame implements ActionListener {
    
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
    
    String username;
    
    public HalamanPembelianRemaja(){
        this.username = Session.getUsername();
        
        setVisible(true);
        setSize(500,450);
        setTitle("Halaman Pembelian Majalah Remaja");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        getContentPane().setBackground(Color.PINK);
        
        add(Header);
        Header.setBounds(20, 20, 440, 24);
        Header.setFont(Header.getFont().deriveFont(20.0f));
        add(labelKategori);
        labelKategori.setBounds(20, 60, 440, 24);
        add(hasilKategori);
        hasilKategori.setText("Majalah Remaja");
        hasilKategori.setBounds(190, 60, 440, 24);
        add(labelHarga);
        labelHarga.setBounds(20, 90, 440, 24);
        add(hasilHarga);
        hasilHarga.setText("Rp15.200 /pcs");
        hasilHarga.setBounds(190, 90, 440, 24);
        add(labelInputJumlah);
        labelInputJumlah.setBounds(20, 120, 440, 24);
        
        add(inputJumlah);
        inputJumlah.setBounds(190, 120, 250, 24);
        
        add(tombolKembali);
        tombolKembali.setBounds(40, 160, 200, 24);
        tombolKembali.addActionListener(this);
        add(tombolBeli);
        tombolBeli.setBounds(250, 160, 200, 24);
        tombolBeli.addActionListener(this);
        
        add(labelTotalPembelian);
        labelTotalPembelian.setBounds(20, 210, 440, 24);
        add(labelHargaSatuan);
        labelHargaSatuan.setBounds(20, 240, 440, 24);
        add(hasilHargaSatuan);
        hasilHargaSatuan.setBounds(190, 240, 440, 24);
        add(labelJumlah);
        labelJumlah.setBounds(20, 270, 440, 24);
        add(hasilJumlah);
        hasilJumlah.setBounds(190, 270, 440, 24);
        add(labelTotalHarga);
        labelTotalHarga.setBounds(20, 300, 440, 24);
        add(hasilTotalHarga);
        hasilTotalHarga.setBounds(190, 300, 440, 24);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tombolBeli) {
            try {
                int jumlah = Integer.parseInt(inputJumlah.getText());
                Harga harga = new Harga(jumlah, 0);
                
                DecimalFormatSymbols symbols = new DecimalFormatSymbols();
                symbols.setGroupingSeparator('.'); 
                symbols.setDecimalSeparator(',');  

                DecimalFormat formatter = new DecimalFormat("#,###", symbols);
                hasilHargaSatuan.setText("Rp15.200");
                hasilJumlah.setText(jumlah + " pcs");
                hasilTotalHarga.setText("Rp" + formatter.format(harga.hargaRemaja()));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Masukkan jumlah yang valid", "Error", JOptionPane.ERROR_MESSAGE);
                hasilJumlah.setText("");
                hasilTotalHarga.setText("");
            }
        }
        else if (e.getSource() == tombolKembali){
            dispose();
            new HalamanUtama();
        }
    }
}
package View;

import View.HalPembelian.HalamanPembelianDewasa;
import View.HalPembelian.HalamanPembelianRemaja;
import View.HalPembelian.HalamanPembelianAnak;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HalamanUtama extends JFrame implements ActionListener{
    
    JLabel Header = new JLabel();
    JLabel subHeader = new JLabel("Silahkan pilih menu dibawah untuk membeli majalah");
    
    JButton majalahAnak = new JButton("Majalah Anak");
    JButton majalahRemaja = new JButton("Majalah Remaja");
    JButton majalahDewasa = new JButton("Majalah Dewasa");
    JButton keluar = new JButton("Logout");
    
    String username;
    
    public HalamanUtama(){
        this.username = Session.getUsername();
        
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
        subHeader.setBounds(20, 70, 440, 24);
        
        //tampil JButton
        add(majalahAnak);
        majalahAnak.setBounds(20, 130, 440, 30);
        majalahAnak.addActionListener(this);
        add(majalahRemaja);
        majalahRemaja.setBounds(20, 180, 440, 30);
        majalahRemaja.addActionListener(this);
        add(majalahDewasa);
        majalahDewasa.setBounds(20, 230, 440, 30);
        majalahDewasa.addActionListener(this);
        add(keluar);
        keluar.setBounds(140, 300, 200, 30);
        keluar.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()== majalahAnak){
                dispose();
                new HalamanPembelianAnak();
            }else if(e.getSource()== majalahRemaja){
                dispose();
                new HalamanPembelianRemaja();
            }else if(e.getSource()== majalahDewasa){
                dispose();
                new HalamanPembelianDewasa();
            }else if(e.getSource()==keluar){
                Session.setUsername(null);
                dispose();
                new LoginPage();
            }
        }catch(Exception Error){
           JOptionPane.showMessageDialog(this, Error.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

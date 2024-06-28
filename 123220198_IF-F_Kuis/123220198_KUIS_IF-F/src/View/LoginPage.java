package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener{
    
    //JLabel
    JLabel Header = new JLabel("Silahkan Login");
    JLabel LabelUsername = new JLabel("Username");
    JLabel LabelPassword = new JLabel("Password");
    
    //JTextField
    JTextField inputUsername = new JTextField();
    JPasswordField inputPassword = new JPasswordField();
    
    //JButton
    JButton tombolLogin = new JButton("Login");
    
    public LoginPage(){
        setVisible(true);
        setSize(500,350);
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        //tampil JLabel
        add(Header);
        Header.setBounds(20, 20, 440, 24);
        Header.setFont(Header.getFont().deriveFont(20.0f));
        add(LabelUsername);
        LabelUsername.setBounds(40, 80, 440, 24);
        add(LabelPassword);
        LabelPassword.setBounds(40, 140, 440, 24);
        
        //tampil JTextField
        add(inputUsername);
        inputUsername.setBounds(150, 80, 300, 24);
        add(inputPassword);
        inputPassword.setBounds(150, 140, 300, 24);
        
        //tampil JButton
        add(tombolLogin);
        tombolLogin.setBounds(200, 200, 100, 24);
        tombolLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
           String username = inputUsername.getText();
           String password = new String(inputPassword.getPassword());
           
           if(username.isEmpty() && password.isEmpty()){
               throw new Exception("Username dan Password Belum Diisi");
           } else if(username.isEmpty()){
               throw new Exception("Username belum diisi");
           }else if(password.isEmpty()){
               throw new Exception("Password belum diisi");
           }
           
           Session.setUsername(username);
           
           new HalamanUtama();
           this.dispose();
           
        }catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
    
    
}

package com.mycompany.view;

import com.mycompany.ImagemPanel;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import javax.swing.*;


public class Login extends JFrame implements FocusListener{
    
    Container containerLogin;
    
    JPanel esquerdoPanel;
    
    JPanel direitoPanel = new JPanel();
    JLabel ferragemLoginLabel = new JLabel("Login do Sistema de Ferragem");
    JLabel facaLoginLabel = new JLabel("Faça o login");
    String textoErro = "Nome de usuario ou senha invalidos!!";
    JLabel erroLabel = new JLabel();
    
    JLabel usernameLabel = new JLabel("Username");
    String textoUsername = "Digite o teu nome de usuario";
    JTextField usernameField = new JTextField();
    JLabel textoUsernameLabel = new JLabel();
    
    JLabel passwordLabel = new JLabel("Password");
    JPasswordField passwordField = new JPasswordField();
    String textoPassword = "Digite a sua senha";
    JLabel textoPasswordLabel = new JLabel();


    JCheckBox verPasswordBox = new JCheckBox("Ver Password");
    
    JButton loginButton = new JButton("Login");

    Color preto = new Color(3,3,3);
    Color cizentoEscuro = new Color(49,64,77);


    Login(){
        setTitle("Acesse ao Sistema");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650, 450);
        setResizable(false);
        containerLogin =  getContentPane();
        containerLogin.setLayout(null);

        //Dados do painel Esquerdo
        String url = "Imagens/Login/ferragem.jpg";
        esquerdoPanel= new ImagemPanel(297,412,url);

        esquerdoPanel.setLayout(null);
        esquerdoPanel.setBounds(0,0,297,413);
        esquerdoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        esquerdoPanel.setBackground(Color.black);


        //Dados do Painel Direito
        ferragemLoginLabel.setBounds(20,30,340,70);
        ferragemLoginLabel.setFont(new Font("Monospaced", Font.BOLD,18));
        ferragemLoginLabel.setForeground(cizentoEscuro);
        direitoPanel.add(ferragemLoginLabel);

        facaLoginLabel.setBounds(20,50,300,70);
        facaLoginLabel.setFont(new Font("Times New Roman", Font.PLAIN,17));
        facaLoginLabel.setForeground(preto);
        direitoPanel.add(facaLoginLabel);

        erroLabel.setBounds(20,100,300,70);
        erroLabel.setFont(new Font("Times New Roman",Font.PLAIN,18));
        erroLabel.setForeground(Color.red);
        direitoPanel.add(erroLabel);

        usernameLabel.setBounds(20,130,300,70);
        usernameLabel.setFont(new Font("Times New Roman", Font.PLAIN,18));
        usernameLabel.setForeground(cizentoEscuro);
        direitoPanel.add(usernameLabel);

        usernameField.setLayout(new BorderLayout());
        usernameField.add(textoUsernameLabel,BorderLayout.WEST);
        usernameField.setBounds(20,180,300,20);
        usernameField.setFont(new Font("Georgia", Font.PLAIN,18));
        direitoPanel.add(usernameField);
        
        passwordLabel.setBounds(20,240,300,20);
        passwordLabel.setFont(new Font("Times New Roman", Font.PLAIN,18));
        passwordLabel.setForeground(cizentoEscuro);
        direitoPanel.add(passwordLabel);


        passwordField.setLayout(new BorderLayout());
        passwordField.setEchoChar('\u25CF');
        passwordField.add(textoPasswordLabel,BorderLayout.WEST);
        passwordField.setBounds(20,260,300,20);
        passwordField.setFont(new Font("Georgia", Font.PLAIN,18));
        direitoPanel.add(passwordField);
        
        verPasswordBox.setBounds(200,281,130,20);
        verPasswordBox.setFont(new Font("Times New Roman", Font.PLAIN,18));
        verPasswordBox.setForeground(cizentoEscuro);
        verPasswordBox.setBackground(Color.white);
        verPasswordBox.setFocusable(false);
        verPasswordBox.addItemListener(e -> {
            if(verPasswordBox.isSelected() ){
                passwordField.setEchoChar((char) 0);
            }
            else
                passwordField.setEchoChar('\u25CF');
        });
        direitoPanel.add(verPasswordBox);
        
        loginButton.setBounds(20,360,100,30);
        loginButton.setForeground(Color.white);
        loginButton.setBackground(cizentoEscuro);
        direitoPanel.add(loginButton);

        loginButton.addActionListener(e -> {
            String myPass = String.valueOf(passwordField.getPassword());
            String concat = usernameField.getText()+myPass;
            if(concat.equalsIgnoreCase("adminadmin")
                    || concat.equalsIgnoreCase("kingmufasa") ||
                    concat.equalsIgnoreCase("dalton123")){

               TelaAdmin admin = new TelaAdmin();
               admin.setLocationRelativeTo(this);
               this.dispose();
            }
            else
                if (usernameField.getText().isEmpty() || myPass.isEmpty()){
                    erroLabel.setText("");
                }
                else
                    erroLabel.setText(textoErro);
        });

        loginButton.addFocusListener(this);
        loginButton.setMnemonic(KeyEvent.VK_ENTER);

        direitoPanel.setLayout(null);
        direitoPanel.setBounds(299,1,349,411);
        direitoPanel.setBackground(Color.white);
        direitoPanel.setBorder(BorderFactory.createLineBorder(Color.white));

        //Adicionando os paineis ao container(janela)
        containerLogin.add(esquerdoPanel);
        containerLogin.add(direitoPanel);

        setLocationRelativeTo(null);
        setVisible(true);
    }


    @Override
    public void focusGained(FocusEvent e) {
        String myPass = String.valueOf(passwordField.getPassword());
        if(usernameField.getText().isEmpty()){
            textoUsernameLabel.setText(textoUsername);
            textoUsernameLabel.setForeground(Color.red);
        }
        if(myPass.isEmpty()){
            textoPasswordLabel.setText(textoPassword);
            textoPasswordLabel.setForeground(Color.red);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        String myPass = String.valueOf(passwordField.getPassword());
        if(usernameField.getText().isEmpty()){
            textoUsernameLabel.setText("");
            textoUsernameLabel.setForeground(Color.BLACK);
        }
        if (myPass.isEmpty()){
            textoPasswordLabel.setText("");
            textoPasswordLabel.setForeground(Color.BLACK);
        }
        erroLabel.setText("");
    }

}

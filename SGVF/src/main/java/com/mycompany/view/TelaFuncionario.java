
package com.mycompany.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.border.MatteBorder;


public class TelaFuncionario extends JFrame implements ActionListener, MouseListener {
    Container containerF;
    
    JPanel painelCima = new JPanel();
    JLabel logoLabel = new JLabel();
    JLabel logoTextLabel = new JLabel("Loja das Ferragens");

    
    
    JPanel painelEsquerdo = new JPanel();
    //Dados Pessoais
    JLabel nomeFuncionarioLabel = new JLabel("Dalton12");
    JLabel fotoFuncionarioLabel = new JLabel();
    JLabel textoNomeFuncionarioLabel = new JLabel("Usuario:");
    JLabel textoCodLabel = new JLabel("Codigo:");
    JLabel codVendedorLabel = new JLabel("1054");
    JButton myAccountButton = new JButton("Minhas Informações");
    
    //Painel Direito
    JPanel painelDireito = new JPanel();
    JLabel fundoLabel = new JLabel();
    JButton vendaButton = new JButton();
    JButton visualizarDadosButton = new JButton();
    JButton terminarSeccaoButton = new JButton();
    JButton ajudaButton = new JButton();



    Color verde = new Color(0,64,48);
    Color verdeMyAccount = new Color(0, 131, 6);
    //Color verdeClaro = new Color(171,191,113);
    Color verdeClaro = new Color(132, 171, 6);
    Color vermelhoClaro = new Color(208, 0, 0);
    Color vermelho = new Color(119, 0, 20);

    TelaFuncionario(){
        super("Sistema de Gestão da Ferragem - Vendedor");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(700,500);
        setLocationRelativeTo(null);
        //setResizable(false);
        containerF = getContentPane();
        containerF.setLayout(null);


        //Dados do painel de cima
        logoLabel.setBounds(20,20,70,70);
        logoLabel.setIcon(resize(new ImageIcon("home_1.png"),logoLabel.getWidth(),logoLabel.getHeight()));
        painelCima.add(logoLabel);
        
        logoTextLabel.setForeground(Color.white);
        logoTextLabel.setBounds(100, 20, 240, 100);
        logoTextLabel.setFont(new Font("Circe", Font.BOLD,22));
        logoTextLabel.setForeground(Color.white);
        painelCima.add(logoTextLabel);

        painelCima.setLayout(null);
        painelCima.setBounds(1,1,698,99);
        painelCima.setBorder(BorderFactory.createLineBorder(verde));
        painelCima.setBackground(verde);


        //Dados do painel esquerdo
        textoNomeFuncionarioLabel.setBounds(110,20,100,20);
        textoNomeFuncionarioLabel.setForeground(verde);
        textoNomeFuncionarioLabel.setFont(new Font("Times New Roman", Font.BOLD,17));
        painelEsquerdo.add(textoNomeFuncionarioLabel);

        nomeFuncionarioLabel.setBounds(176,20,90,20);
        nomeFuncionarioLabel.setForeground(verde);
        nomeFuncionarioLabel.setFont(new Font("Times New Roman", Font.BOLD,17));
        painelEsquerdo.add(nomeFuncionarioLabel);

        textoCodLabel.setBounds(110,43,100,20);
        textoCodLabel.setForeground(verde);
        textoCodLabel.setFont(new Font("Times New Roman",Font.BOLD,17));
        painelEsquerdo.add(textoCodLabel);

        codVendedorLabel.setBounds(176,43,90,20);
        codVendedorLabel.setForeground(verde);
        codVendedorLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
        painelEsquerdo.add(codVendedorLabel);

        fotoFuncionarioLabel.setBounds(5,10,100,120);
        fotoFuncionarioLabel.setIcon(resize(new ImageIcon("dalton.png"),fotoFuncionarioLabel.getWidth(),fotoFuncionarioLabel.getHeight()));
        fotoFuncionarioLabel.setBorder(BorderFactory.createLineBorder(verde));
        painelEsquerdo.add(fotoFuncionarioLabel);

        myAccountButton.setBounds(20,255,200,30);
        myAccountButton.setForeground(Color.white);
        myAccountButton.setBackground(verde);
        myAccountButton.setBorder(BorderFactory.createLineBorder(Color.white));
        myAccountButton.setFocusable(false);
        painelEsquerdo.add(myAccountButton);
        
        painelEsquerdo.setLayout(null);
        painelEsquerdo.setBounds(1,101,249,361);
        painelEsquerdo.setBorder(BorderFactory.createLineBorder(verdeClaro));
        painelEsquerdo.setBackground(verdeClaro);


        //Dados do painel Direito
        fundoLabel.setBounds(100,30,250,170);
        fundoLabel.setIcon(resize(new ImageIcon("fundo.png"),fundoLabel.getWidth(),fundoLabel.getHeight()));
        painelDireito.add(fundoLabel);

        vendaButton.setBounds(188,200,95,85);
        vendaButton.setForeground(verde);
        vendaButton.setBackground(Color.white);
        vendaButton.setIcon(resize(new ImageIcon("venda.png"),vendaButton.getWidth()-20,vendaButton.getHeight()-20));
        vendaButton.setBorder(BorderFactory.createLineBorder(verde));
        vendaButton.setText("Vender");
        vendaButton.setHorizontalTextPosition(SwingConstants.CENTER);
        vendaButton.setVerticalAlignment(SwingConstants.TOP);
        vendaButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        vendaButton.setFocusable(false);
        painelDireito.add(vendaButton);

        visualizarDadosButton.setBounds(88,200,95,85);
        visualizarDadosButton.setForeground(verde);
        visualizarDadosButton.setBackground(Color.white);
        visualizarDadosButton.setIcon(resize(new ImageIcon("visualizarVendas.png"),visualizarDadosButton.getWidth()-20,visualizarDadosButton.getHeight()-20));
        visualizarDadosButton.setBorder(BorderFactory.createLineBorder(verde));
        visualizarDadosButton.setText("Efectuadas");
        visualizarDadosButton.setHorizontalTextPosition(SwingConstants.CENTER);
        visualizarDadosButton.setVerticalAlignment(SwingConstants.TOP);
        visualizarDadosButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        visualizarDadosButton.setFocusable(false);
        painelDireito.add(visualizarDadosButton);

        ajudaButton.setBounds(288,200,95,85);
        ajudaButton.setForeground(verde);
        ajudaButton.setBackground(Color.white);
        ajudaButton.setIcon(resize(new ImageIcon("ajuda.png"),ajudaButton.getWidth()-20,ajudaButton.getHeight()-20));
        ajudaButton.setBorder(BorderFactory.createLineBorder(verde));
        ajudaButton.setText("Ajuda");
        ajudaButton.setHorizontalTextPosition(SwingConstants.CENTER);
        ajudaButton.setVerticalAlignment(SwingConstants.TOP);
        ajudaButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        ajudaButton.setFocusable(false);
        painelDireito.add(ajudaButton);

        terminarSeccaoButton.setBounds(351,329,95,30);
        terminarSeccaoButton.setForeground(Color.white);
        terminarSeccaoButton.setBackground(vermelho);
        terminarSeccaoButton.setText("Sair");
        terminarSeccaoButton.setFont(new Font("Times New Roman", Font.BOLD,18));
        terminarSeccaoButton.setBorder(new MatteBorder(3,3,3,3,verde));
        terminarSeccaoButton.setFocusable(false);
        painelDireito.add(terminarSeccaoButton);

        painelDireito.setLayout(null);
        painelDireito.setBorder(BorderFactory.createLineBorder(Color.white));
        painelDireito.setBounds(251,101,448,361);
        painelDireito.setBackground(Color.white);

        terminarSeccaoButton.addActionListener(this);
        ajudaButton.addActionListener(this);
        visualizarDadosButton.addActionListener(this);
        vendaButton.addActionListener(this);
        myAccountButton.addActionListener(this);

        terminarSeccaoButton.addMouseListener(this);
        ajudaButton.addMouseListener(this);
        visualizarDadosButton.addMouseListener(this);
        vendaButton.addMouseListener(this);
        myAccountButton.addMouseListener(this);
        
        containerF.add(painelCima);
        containerF.add(painelEsquerdo);
        containerF.add(painelDireito);
        containerF.setBackground(Color.black);
        setVisible(true);
        
    }

    public static ImageIcon resize(ImageIcon im,int w, int h){
        BufferedImage bi = new BufferedImage(w,h,BufferedImage.TRANSLUCENT);
        Graphics2D gd = bi.createGraphics();
        gd.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY));
        gd.drawImage(im.getImage(),0,0,w,h,null);
        gd.dispose();
        return  new ImageIcon(bi);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==terminarSeccaoButton){
            int resposta = JOptionPane.showConfirmDialog(this,"Pretende Terminar a Seccao?","Voltar a Tela Login",JOptionPane.YES_NO_OPTION);
            if(resposta==0){
                dispose();
                Login login = new Login();
                login.setLocationRelativeTo(this);
            }
        }

    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==ajudaButton) {
            ajudaButton.setBackground(verdeClaro);
            ajudaButton.setForeground(Color.white);
        }
        if(e.getSource()==visualizarDadosButton) {
            visualizarDadosButton.setBackground(verdeClaro);
            visualizarDadosButton.setForeground(Color.white);
        }
        if(e.getSource()==vendaButton) {
            vendaButton.setBackground(verdeClaro);
            vendaButton.setForeground(Color.white);
        }
        if(e.getSource()==terminarSeccaoButton) {
            terminarSeccaoButton.setBackground(vermelhoClaro);
            terminarSeccaoButton.setForeground(Color.white);
        }
        if(e.getSource()==myAccountButton) {
            myAccountButton.setForeground(Color.white);
            myAccountButton.setBackground(verdeMyAccount);
        }
    }
    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==ajudaButton) {
            ajudaButton.setForeground(verde);
            ajudaButton.setBackground(Color.white);
        }
        if(e.getSource()==visualizarDadosButton) {
            visualizarDadosButton.setForeground(verde);
            visualizarDadosButton.setBackground(Color.white);
        }
        if(e.getSource()==vendaButton) {
            vendaButton.setForeground(verde);
            vendaButton.setBackground(Color.white);
        }
        if(e.getSource()==terminarSeccaoButton) {
            terminarSeccaoButton.setForeground(Color.white);
            terminarSeccaoButton.setBackground(vermelho);
        }

        if(e.getSource()==myAccountButton) {
            myAccountButton.setForeground(Color.white);
            myAccountButton.setBackground(verde);
        }


    }
}




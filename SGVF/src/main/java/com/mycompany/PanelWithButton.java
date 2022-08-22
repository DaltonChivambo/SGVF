package com.mycompany;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class PanelWithButton extends JPanel implements ActionListener {

    //Cores
    Color azul = new Color(20,126,203);
    Color creme = new Color(237,236,236);
    Color cizentoEscuro = new Color(49,64,77);
    Color vermelho = new Color(223,0,36);


    JPanel firstPanel = new JPanel();
    JButton button1 = new JButton();
    JLabel quantidadeButton1Label = new JLabel();
    JButton button2 = new JButton();
    JLabel quantidadeButton2Label = new JLabel();

    JPanel secondPanel = new JPanel();
    JButton button3 = new JButton();
    JLabel quantidadeButton3Label = new JLabel();
    JButton button4 = new JButton();
    JLabel quantidadeButton4Label = new JLabel();


    public PanelWithButton(String nomeBotao1, String url1, int quantidadeBotao1,
                           String nomeBotao2, String url2, int quantidadeBotao2,
                           String nomeBotao3, String url3, int quantidadeBotao3,
                           String nomeBotao4, String url4, int quantidadeBotao4,
                           int alturaBotoes, int larguraBotoes,
                           int alturaIconeBotoes, int larguraIconeBotoes,
                           String fonteLetras, int tamanhoFonteLetras) {

        setLayout(new FlowLayout(FlowLayout.CENTER,0,15));

        JLabel vazioHomeLabel = new JLabel();
        vazioHomeLabel.setPreferredSize(new Dimension(1000,0));
        //add(vazioHomeLabel);

        JLabel vazioBaixoLabel = new JLabel();
        vazioBaixoLabel.setPreferredSize(new Dimension(1200,100));
        vazioBaixoLabel.setOpaque(true);
        add(vazioBaixoLabel);

        firstPanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        button1.setPreferredSize(new Dimension(larguraBotoes,alturaBotoes));
        quantidadeButton1Label.setText(""+quantidadeBotao1);
        button1.setText(nomeBotao1);
        button1.setLayout(new FlowLayout());
        button1.setBackground(Color.white);
        button1.setVerticalAlignment(SwingConstants.EAST);
        button1.setForeground(azul);
        quantidadeButton1Label.setIcon(resize(new ImageIcon(url1),larguraIconeBotoes,alturaIconeBotoes));
        quantidadeButton1Label.setFont(new Font(fonteLetras,Font.BOLD,tamanhoFonteLetras));
        quantidadeButton1Label.setForeground(azul);
        button1.add(quantidadeButton1Label);
        button1.setFocusable(false);
        firstPanel.add(button1);

        button2.setPreferredSize(new Dimension(larguraBotoes,alturaBotoes));
        quantidadeButton2Label.setText(""+quantidadeBotao2);
        button2.setText(nomeBotao2);
        button2.setLayout(new FlowLayout());
        button2.setBackground(Color.white);
        button2.setVerticalAlignment(SwingConstants.EAST);
        button2.setForeground(azul);
        quantidadeButton2Label.setIcon(resize(new ImageIcon(url2),larguraIconeBotoes,alturaIconeBotoes));
        quantidadeButton2Label.setFont(new Font(fonteLetras,Font.BOLD,tamanhoFonteLetras));
        quantidadeButton2Label.setForeground(azul);
        button2.add(quantidadeButton2Label);
        button2.setFocusable(false);
        firstPanel.add(button2);


        secondPanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        button3.setText(nomeBotao3);
        quantidadeButton3Label.setText(""+quantidadeBotao3);
        button3.setPreferredSize(new Dimension(larguraBotoes,alturaBotoes));
        button3.setLayout(new FlowLayout());
        button3.setFocusable(false);
        button3.setBackground(Color.white);
        button3.setVerticalAlignment(SwingConstants.EAST);
        button3.setForeground(azul);
        quantidadeButton3Label.setIcon(resize(new ImageIcon(url3),larguraIconeBotoes,alturaIconeBotoes));
        quantidadeButton3Label.setFont(new Font(fonteLetras,Font.BOLD,tamanhoFonteLetras));
        quantidadeButton3Label.setForeground(azul);
        button3.add(quantidadeButton3Label);
        secondPanel.add(button3);

        button4.setPreferredSize(new Dimension(larguraBotoes,alturaBotoes));
        button4.setText(nomeBotao4);
        quantidadeButton4Label.setText(""+quantidadeBotao4);
        button4.setLayout(new FlowLayout());
        button4.setFocusable(false);
        button4.setBackground(Color.white);
        button4.setVerticalAlignment(SwingConstants.EAST);
        button4.setForeground(azul);
        quantidadeButton4Label.setIcon(resize(new ImageIcon(url4),larguraIconeBotoes,alturaIconeBotoes));
        quantidadeButton4Label.setFont(new Font(fonteLetras,Font.BOLD,tamanhoFonteLetras));
        quantidadeButton4Label.setForeground(azul);
        button4.add(quantidadeButton4Label);
        secondPanel.add(button4);

        add(firstPanel);
        add(secondPanel);
        add(vazioBaixoLabel);
        setBackground(creme);
        setBorder(BorderFactory.createLineBorder(creme));

    }

    public PanelWithButton(String nomeBotao1, String url1, int quantidadeBotao1,
                           String nomeBotao2, String url2, int quantidadeBotao2,
                           String nomeBotao3, String url3, int quantidadeBotao3,
                           String nomeBotao4, String url4, int quantidadeBotao4,
                           int alturaBotoes, int larguraBotoes,
                           int alturaIconeBotoes, int larguraIconeBotoes,
                           String fonteLetras, int tamanhoFonteLetras,
                           int tamanhoLabel4) {

        setLayout(new FlowLayout(FlowLayout.CENTER,0,15));

        JLabel vazioHomeLabel = new JLabel();
        vazioHomeLabel.setPreferredSize(new Dimension(1000,0));
        //add(vazioHomeLabel);

        JLabel vazioBaixoLabel = new JLabel();
        vazioBaixoLabel.setPreferredSize(new Dimension(1200,100));
        vazioBaixoLabel.setOpaque(true);
        add(vazioBaixoLabel);

        firstPanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        button1.setPreferredSize(new Dimension(larguraBotoes,alturaBotoes));
        quantidadeButton1Label.setText(""+quantidadeBotao1);
        button1.setText(nomeBotao1);
        button1.setLayout(new FlowLayout());
        button1.setBackground(Color.white);
        button1.setVerticalAlignment(SwingConstants.EAST);
        button1.setForeground(azul);
        quantidadeButton1Label.setIcon(resize(new ImageIcon(url1),larguraIconeBotoes,alturaIconeBotoes));
        quantidadeButton1Label.setFont(new Font(fonteLetras,Font.BOLD,tamanhoFonteLetras));
        quantidadeButton1Label.setForeground(azul);
        button1.add(quantidadeButton1Label);
        button1.setFocusable(false);
        firstPanel.add(button1);

        button2.setPreferredSize(new Dimension(larguraBotoes,alturaBotoes));
        quantidadeButton2Label.setText(""+quantidadeBotao2);
        button2.setText(nomeBotao2);
        button2.setLayout(new FlowLayout());
        button2.setBackground(Color.white);
        button2.setVerticalAlignment(SwingConstants.EAST);
        button2.setForeground(azul);
        quantidadeButton2Label.setIcon(resize(new ImageIcon(url2),larguraIconeBotoes,alturaIconeBotoes));
        quantidadeButton2Label.setFont(new Font(fonteLetras,Font.BOLD,tamanhoFonteLetras));
        quantidadeButton2Label.setForeground(azul);
        button2.add(quantidadeButton2Label);
        button2.setFocusable(false);
        firstPanel.add(button2);


        secondPanel.setLayout(new FlowLayout(FlowLayout.TRAILING,15,5));
        button3.setText(nomeBotao3);
        quantidadeButton3Label.setText(""+quantidadeBotao3);
        button3.setPreferredSize(new Dimension(larguraBotoes,alturaBotoes));
        button3.setLayout(new FlowLayout());
        button3.setFocusable(false);
        button3.setBackground(Color.white);
        button3.setVerticalAlignment(SwingConstants.EAST);
        button3.setForeground(azul);
        quantidadeButton3Label.setIcon(resize(new ImageIcon(url3),larguraIconeBotoes,alturaIconeBotoes));
        quantidadeButton3Label.setFont(new Font(fonteLetras,Font.BOLD,tamanhoFonteLetras));
        quantidadeButton3Label.setForeground(azul);
        button3.add(quantidadeButton3Label);
        secondPanel.add(button3);

        button4.setPreferredSize(new Dimension(larguraBotoes,alturaBotoes));
        button4.setText(nomeBotao4);
        quantidadeButton4Label.setText(quantidadeBotao4+" MZN");
        button4.setLayout(new FlowLayout());
        button4.setFocusable(false);
        button4.setBackground(Color.white);
        button4.setVerticalAlignment(SwingConstants.EAST);
        button4.setForeground(azul);
        quantidadeButton4Label.setIcon(resize(new ImageIcon(url4),larguraIconeBotoes,alturaIconeBotoes));
        quantidadeButton4Label.setFont(new Font(fonteLetras,Font.BOLD,tamanhoLabel4));
        quantidadeButton4Label.setForeground(azul);
        button4.add(quantidadeButton4Label);
        secondPanel.add(button4);

        add(firstPanel);
        add(secondPanel);
        add(vazioBaixoLabel);
        setBackground(creme);
        setBorder(BorderFactory.createLineBorder(creme));

    }

    public static ImageIcon resize(ImageIcon im, int w, int h){
        BufferedImage bi = new BufferedImage(w,h,BufferedImage.TRANSLUCENT);
        Graphics2D gd = bi.createGraphics();
        gd.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY));
        gd.drawImage(im.getImage(),0,0,w,h,null);
        gd.dispose();
        return  new ImageIcon(bi);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

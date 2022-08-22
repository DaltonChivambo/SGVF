package com.mycompany;

import javax.swing.*;
import java.awt.*;

public class ImagemPanel extends JPanel {

    private  int w;
    private  int h;
    private String url;

    public ImagemPanel(int w, int h, String url){
        this.w = w;
        this.h = h;
        this.url = url;
    }

    public void paintComponent (Graphics g) {
        Image image = new ImageIcon(url).getImage();
        g.drawImage(image,0,0,w,h,this);

    }


}

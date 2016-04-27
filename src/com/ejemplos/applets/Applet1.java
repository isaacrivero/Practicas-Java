package com.ejemplos.applets;


import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Applet1 extends Applet {
    public void init(){
        setBackground(Color.white);
    }
    public void paint(Graphics g){
        g.drawString("Primer applet", 10, 25);
    }
}
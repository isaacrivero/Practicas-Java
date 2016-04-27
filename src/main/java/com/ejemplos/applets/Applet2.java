package com.ejemplos.applets;


import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Applet2 extends Applet {
  boolean isStandalone = false;
  int x;
  int y;
  String texto;
//Get a parameter value
  
/*  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }
 */
 //Initialize the applet

  public void init() {
 /*   try { x = Integer.parseInt(this.getParameter("ABSCISA", "10")); } catch (Exception e) { e.printStackTrace(); }
    try { y = Integer.parseInt(this.getParameter("ORDENADA", "20")); } catch (Exception e) { e.printStackTrace(); }
    try { texto = this.getParameter("MENSAJE", "El primer applet"); } catch (Exception e) { e.printStackTrace(); }
    */
    try {
    jbInit();
    }
    catch (Exception e) {
    e.printStackTrace();
    }
  }
//Component initialization

  private void jbInit() throws Exception {
    int ancho=300;
    int alto=200;
    x=10;
    y=20;
     try{
        ancho=Integer.parseInt(this.getParameter("WIDTH"));
        alto=Integer.parseInt(this.getParameter("HEIGHT"));
        x=Integer.parseInt(this.getParameter("ABSCISA"));
        y=Integer.parseInt(this.getParameter("ORDENADA"));
     }catch(NumberFormatException ex){
	        System.out.println("Error en los parámetros");
     }
     texto=this.getParameter("MENSAJE");
     setBackground(Color.white);
     setSize(ancho, alto);
  }
  public void paint(Graphics g){
    g.drawString(texto, x, y);
  }

}


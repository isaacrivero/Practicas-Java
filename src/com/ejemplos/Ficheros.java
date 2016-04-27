package com.ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ficheros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;

	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\md5sum.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null)
	            System.out.println(linea);
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
         }
	  }
	      File file = new File ("c:\\Users\\pepesan\\","prueba.txt");
	      try {
	    	  // A partir del objeto File creamos el fichero físicamente
	    	  if (file.createNewFile())
	    	    System.out.println("El fichero se ha creado correctamente");
	    	  else
	    	    System.out.println("No ha podido ser creado el fichero");
	    	} catch (IOException ioe) {
	    	  ioe.printStackTrace();
	    	}
	      FileWriter fichero = null;
	      PrintWriter pw = null;
	      try
	      {
	          fichero = new FileWriter("c:\\Users\\pepesan\\prueba.txt");
	          pw = new PrintWriter(fichero);
	          for (int i = 0; i < 10; i++){
	        	  
	              pw.println("Linea " + i);
	              System.out.println("Escrito: "+"Linea "+i);
	          }

	      } catch (Exception e) {
	          e.printStackTrace();
	      } finally {
	         try {
	         // Nuevamente aprovechamos el finally para 
	         // asegurarnos que se cierra el fichero.
	         if (null != fichero)
	            fichero.close();
	         } catch (Exception e2) {
	            e2.printStackTrace();
	         }
	      }
	      File ficherin=new File("C:\\Users\\pepesan\\prueba.txt");
	      try {
			Scanner f=new Scanner(ficherin);
			f.useDelimiter("\n");
			while(f.hasNext()){
				System.out.print(f.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

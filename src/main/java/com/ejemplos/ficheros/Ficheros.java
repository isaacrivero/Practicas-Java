package com.ejemplos.ficheros;

import java.io.*;
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
		try{
			File file = new File("./md5sum.txt");
			if(file.createNewFile()) {
				System.out.println("Success!");
			}
			else{
				System.out.println
						("Error, file already exists.");
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println(ioe.getMessage());
		}
		BufferedWriter out=null;
		try {
			out = new
					BufferedWriter(new FileWriter("./md5sum.txt"));
			out.write("aString");
			out.close();
			System.out.println
					("File created successfully");
		}
		catch (IOException e) {
			System.out.println("Fallo al escribir el fichero");
			System.out.println(e.getMessage());
		}
		finally {

		}
		  try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("./md5sum.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null) {
				 System.out.println(linea);
			 }
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
	      File file = new File ("./md5sum.txt");
	      try {
	    	  // A partir del objeto File creamos el fichero f�sicamente
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
	          fichero = new FileWriter("./md5sum.txt");
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
	      File ficherin=new File("./md5sum.txt");
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

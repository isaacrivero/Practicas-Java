package com.ejemplos;

import java.io.*;
import java.util.Scanner;

public class Entrada {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad;
		long res=1;
		BufferedReader bf=new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Introduzca un número: ");
		try {
			cad=bf.readLine();
			res=Long.parseLong(cad);
			System.out.println(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un nombre: ");
		String nom;
		sc.useDelimiter("\n");
		nom=sc.next();
		System.out.println("Nombre: "+nom);
		System.out.println("Introduzca un número: ");
		int i;
		i=sc.nextInt();
		System.out.println("Número: "+i);
		
		
	}

}

package com.ejemplos;

public class Operadores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		double d;
		i=7;
		j=2;
		k=i+j;
		System.out.println(k);
		k=i-j;
		System.out.println(k);
		k=i*j;
		System.out.println(k);
		d=i/j;
		System.out.println(d);
		d=i%j;
		System.out.println(d);
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		//Operador condicional
		k=4;
		String s=(k%2==0)?"par":"impar";
		System.out.println(s);
		i=2;
		j=3;
		i+=j;
		System.out.println(i);
		i-=j;
		System.out.println(i);
		i*=j;
		System.out.println(i);
		float f;
		f=14;
		j=2;
		f/=j;
		System.out.println(f);
		for(i=0;i<10;i++){
			if(i==2){
				continue;
			}
			if(i==4){
				break;
			}
			System.out.println(i);
		}
		
	}

}

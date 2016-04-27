package com.ejemplos;

public class Arrays {

	/**
	 * @param args
	 */
	public int sumaarray(int a[]){
		int i;
		int r=0;
		for(i=0;i<a.length;i++){
			r+=a[i];
		}
		return r;
		
	}
	public int[]devuelvearray(int a[]){
		return a;
	}
	
	public int recorrearray(int a[]){
		int s=0;
		for(int ele: a){
			s+=ele;
			System.out.println(ele);
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_int = new int [100] ;
		int i;
		for (i=0;i<100;i++){
			array_int[i]=i;
			System.out.println(array_int[i]);
		}
		int[]nums={1,2,3,4};
		for (i=0;i<4;i++){
			System.out.println(nums[i]);
		}
		Arrays obja=new Arrays();
		i=obja.sumaarray(nums);
		System.out.println(i);
		int [][] doblearray= new int [2][3];
		i=0;
		int j;
		for(j=0;j<doblearray.length;j++){
			int f;
			f=doblearray[j].length;
			for(int k=0;k<f;k++){
				doblearray[j][k]=i;
				i++;
			}
		}
		for (int[] ele: doblearray){
			for (int celda: ele){
				System.out.println(celda);
			}
		}
		
		int [][] da= new int[2][];
		da[0]=new int[4];
		for(i=0;i<4;i++){
			da[0][i]=i;
		}
		da[1]=new int [5];
		for(i=0;i<5;i++){
			da[1][i]=i;
		}
		for (int[] ele: da){
			for (int celda: ele){
				System.out.println(celda);
			}
		}
	}

}

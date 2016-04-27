package com.ejemplos.clases;

import com.ejemplos.clases.beans.*;
//import com.ejemplos.clases.beans.Empresa;

public class ProgramaEmpresa {

	/**
	 * @param args
	 */
	public static Cliente getCliente(){
		return (Cliente)new Empresa();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Empresa emp=new Empresa();
		emp.setNresponsable("jhgjhg");
		System.out.println(emp.publico);
		Cliente c=(Cliente)emp;
		Cliente c2=getCliente();
		Empresa e2=(Empresa)getCliente();
		Empresa.estatico();
		Thread.sleep(5000);
	}

}

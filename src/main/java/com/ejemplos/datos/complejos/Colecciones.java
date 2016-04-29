package com.ejemplos.datos.complejos;

import java.util.*;

public class Colecciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listado=new LinkedList<String>();
		listado.add("Uno");
		listado.add("Dos");
		listado.add("Tres");
		for(int i=0;i<listado.size();i++){
			String cadena=listado.get(i);
			System.out.println(cadena);
		}
		//construir el listado
		List<Cliente> clientes = new ArrayList<Cliente>();
		//construir el objeto cliente
		Cliente pepe=new Cliente();
		pepe.setDni("8997894478A");
		pepe.setNombre("Pepe");
		//construir el objeto direccion
		Direccion dir=new Direccion();
		dir.setCalle("Arribarriaga");
		dir.setNumero("14");
		//Asociar el objeto dirección al objeto cliente
		pepe.setDireccion(dir);
		//introducir en el listado el objeto cliente
		clientes.add(pepe);
		pepe.setNombre("Jose");
		pepe.getDireccion().setCalle("Otra Calle");

		Cliente cogido=clientes.get(0);
		System.out.println(cogido.getNombre());
		Direccion dirCogida=cogido.getDireccion();
		System.out.println(dirCogida.getCalle());
		//del listado coges un objeto Cliente, del cliente coges la dirección
		//de la dirección coger el número
		clientes.get(0).getDireccion().getNumero();
/*




		int count[] = {34, 22,10,60,30,22};
		Set<Integer> set = new HashSet<Integer>();
		try{
			for(int i = 0; i<5; i++){
				set.add(count[i]);
			}
			System.out.println(set);

			TreeSet sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is:");
			System.out.println(sortedSet);

			System.out.println("The First element of the set is: "+
					(Integer)sortedSet.first());
			System.out.println("The last element of the set is: "+
					(Integer)sortedSet.last());
		}
		catch(Exception e){}
		// Create the sorted set
		SortedSet set2 = new TreeSet();

		// Add elements to the set
		set2.add("b");
		set2.add("c");
		set2.add("a");

		// Iterating over the elements in the set
		Iterator it = set2.iterator();
		while (it.hasNext()) {
			// Get element
			Object element = it.next();
			System.out.println(element.toString());
		}
		Map m1 = new HashMap();
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		System.out.println();
		System.out.println(" Map Elements");
		System.out.print("\t" + m1);
		// Create a hash map
		TreeMap tm = new TreeMap();
		// Put elements to the map
		tm.put("Zara", new Double(3434.34));
		tm.put("Mahnaz", new Double(123.22));
		tm.put("Ayan", new Double(1378.00));
		tm.put("Daisy", new Double(99.22));
		tm.put("Qadir", new Double(-19.08));

		// Get a set of the entries
		Set set3 = tm.entrySet();
		// Get an iterator
		Iterator i = set3.iterator();
		// Display elements
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		// Deposit 1000 into Zara's account
		double balance = ((Double)tm.get("Zara")).doubleValue();
		tm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance: " +
				tm.get("Zara"));
*/
}

}

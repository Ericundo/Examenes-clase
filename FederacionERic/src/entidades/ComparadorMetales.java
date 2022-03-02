package entidades;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

import utils.Datos;

public class ComparadorMetales implements Comparator<Metal> {

	@Override
	public int compare(Metal m1, Metal m2) {
		return (int) (m1.pureza - m2.pureza);

	}

	public void mostrarMedallas() {
 LinkedList <Metal> list = new LinkedList<Metal>();
 
 	for(Oro m: Datos.OROS)
		list.add(m);
 	for(Plata m: Datos.PLATAS)
		list.add(m);
 	for(Bronce m: Datos.BRONCES)
		list.add(m);
		
		list.sort(new ComparadorMetales());
		
		Iterator<Metal> it = list.iterator();
		while (it.hasNext()) {
			System.out.println("Ciudad: "+it.next());
		}
	

		
		
	}

}

package entidades;

//Examen 2 Ejercicio 3.1
public abstract class Documentacion implements Comparable<Documentacion>{
	public abstract String mostrar();
	public String numero;
	

	public abstract boolean validar();
	
	public int compareTo(Documentacion o) {
        return this.numero.compareTo(o.numero);
        
    }	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getnumero() {
		return numero;
	}
	
	
}




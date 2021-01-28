/**
 * 
 */
package actividad23;

/**
 * @author Usuario
 *
 */
public class Libros {
	
	//las variables del objeto que estan en privado
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	//contrustor vacio por defecto
	public Libros() {
		
	}
	
	//constructor de las variables
	public Libros(String t, String a, int e, int p) {
		settitulos(t);
		setautor(a);
		setejemplares(e);
		setprestados(p);
	}
	
	//los getes 
	public String gettitulo() {
		return this.titulo;
	}
	public String getautor() {
		return this.autor;
	}
	public int getejemplares() {
		return this.ejemplares;
	}
	public int getprestados() {
		return this.prestados;
	}
	
	//los setes
	public void settitulos(String t) {
		this.titulo=t;
	}
	public void setautor(String a) {
		this.autor=a;
	}
	public void setejemplares(int e) {
		this.ejemplares=e;
	}
	public void setprestados(int p) {
		this.prestados=p;
	}
	
	//funcion para los prestamos
	public Boolean prestar() {
		Boolean r = false;
		if(this.prestados<this.ejemplares) {
			r = true;
			prestados++;
		}else {
			r = false;
		}
		return r;
	}
	
	//funcion para las devulciones
	public Boolean devolver() {
		Boolean r = false;
		if(this.prestados>0) {
			r = true;
			prestados--;
		}else {
			r = false;
		}
		return r;
	}
	
	//toString para mostar el contenido de los libros 
	@Override
	public String toString() {
		return "El libro "+this.titulo+" del autor "+this.autor+" tiene "+this.ejemplares+" ejemplares y ahora estan prestados "+this.prestados;
	}
	
}

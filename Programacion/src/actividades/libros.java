/**
 * 
 */
package actividades;

/**
 * @author Usuario
 *
 */
public class libros {
	
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	public libros() {
		
	}
	
	public libros(String t, String a, int e, int p) {
		settitulos(t);
		setautor(a);
		setejemplares(e);
		setprestados(p);
	}
	
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
	
	@Override
	public String toString() {
		return "El libro"+this.titulo+" del autor "+this.autor+" tiene "+this.ejemplares+"y ahora estan prestados "+this.prestados;
	}
	
}

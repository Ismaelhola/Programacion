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
		this.titulo=t;
		this.autor=a;
		this.ejemplares=e;
		this.prestados=p;
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
	
	

}

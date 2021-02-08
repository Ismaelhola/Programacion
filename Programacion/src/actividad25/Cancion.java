/**
 * 
 */
package actividad25;

/**
 * @author Ismael m
 *
 */
public class Cancion {
	private String titulo;
	private String artista;
	private int duracion;
	
	public Cancion() {
		
	}
	
	public Cancion(String t, String a, int d) {
		settitulo(t);
		setartista(a);
		setduracion(d);
	}
	
	public String gettitulo() {
		return this.titulo;
	}
	public String getartista() {
		return this.artista;
	}
	public int getduracion() {
		return this.duracion;
	}
	
	public void settitulo(String t) {
		this.titulo=t;
	}
	public void setartista(String a) {
		this.artista=a;
	}
	public void setduracion(int d) {
		this.duracion=d;
	}
	
	public String reproducir() {
		return this.titulo+" reproduciendo...";
	}
	
	@Override
	public String toString() {
		return this.titulo+" - "+this.artista+" ("+this.duracion+" minutos).";
	}
	
}

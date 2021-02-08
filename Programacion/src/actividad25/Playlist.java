/**
 * 
 */
package actividad25;

import java.util.ArrayList;

/**
 * @author Ismael m
 *
 */
public class Playlist {
	ArrayList<Cancion>canciones;
	String nombre;
	
	public Playlist() {
		canciones=new ArrayList<Cancion>();
	}
	
	public Playlist(String n) {
		this.nombre=n;
		canciones=new ArrayList<Cancion>();
	}
	
	public void metercancion(String t, String a, int d) {
		canciones.add(new Cancion(t,a,d));
	}

}

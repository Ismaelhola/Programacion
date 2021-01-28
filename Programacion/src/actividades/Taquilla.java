/**
 * 
 */
package actividades;

/**
 * @author Ismael m
 *
 */
public class Taquilla {
	private int numero;
	private String codsocio;
	private boolean cerrada;
	
	public Taquilla() {
		
	}
	
	public Taquilla(int numero, String codigo, boolean cerrada) {
		setnumero(numero);
		setcodsocio(codigo);
		setcerrada(cerrada);
	}
	
	public int getnumero() {
		return numero;
	}
	public String getcodsocio() {
		return codsocio;
	}
	public boolean getcerrada() {
		return cerrada;
	}
	
	public void setnumero(int numero) {
		this.numero=numero;
	}
	public void setcodsocio(String codigo) {
		this.codsocio=codigo;
	}
	public void setcerrada(boolean cerrada) {
		this.cerrada=cerrada;
	}
	
	@Override
	public String toString() {
		return "taquilla no: "+this.numero+"\n pertenece el socio: "+this.codsocio+"\n estado: "+this.cerrada;
	}

}

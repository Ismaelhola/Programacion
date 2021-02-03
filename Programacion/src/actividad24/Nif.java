/**
 * 
 */
package actividad24;

/**
 * @author Ismael m
 *
 */
public class Nif {
	private int numero;
	private char letra;
	
	public Nif(){
		this.numero=0;
		this.letra=' ';
	}
	
	public Nif(int n) {
		setnumero(n);
		this.letra=calculol(n);
	}
	
	public int getnumero() {
		return this.numero;
	}
	public char getletra() {
		return this.letra;
	}
	
	public void setnumero(int n) {
		this.numero=n;
	}
	
	private char calculol(int n) {
		char[] l = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'}; 
    	return l[n % 23];
	}
	
	public void leer(int n) {
		this.numero=n;
		this.letra=calculol(n);
	}
	
	@Override
	public String toString() {
		String n= String.format("%08d",numero);
		return n+"-"+this.letra;
	}

}

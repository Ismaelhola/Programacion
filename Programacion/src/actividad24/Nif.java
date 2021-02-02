/**
 * 
 */
package actividad24;
import java.util.Scanner;

/**
 * @author Ismael m
 *
 */
public class Nif {
	private int numero;
	private char letra;
	
	public Nif() {
		
	}
	
	public Nif(int n, char l) {
		setnumero(n);
		setletra(l);
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
	public void setletra(char l) {
		if(l!=calculoletra()) {
			l=calculoletra();
		}
		this.letra=l;
	}
	
	private char calculoletra() {
		char[] l = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		return l[this.numero%23];
	}
	
	public void leer(Scanner sc) {
		System.out.println("Escribe el numero del dni");
		setnumero(sc.nextInt());
		setletra(calculoletra());
		
	}

}

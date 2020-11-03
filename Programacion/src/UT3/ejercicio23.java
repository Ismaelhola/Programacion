/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		int fin;
		
		System.out.println("Escribe un numero:");
		Scanner scf=new Scanner(System.in);
		fin=scf.nextInt();
		
		do {
			System.out.printf("%d,",numero);
			numero=numero+2;
		}while(numero<=fin);

	}

}

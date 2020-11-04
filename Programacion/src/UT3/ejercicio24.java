/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int par=0;
		int suma;
		
		do {
			System.out.println("Escribe un numero:");
			Scanner scs=new Scanner(System.in);
			suma=scs.nextInt();
			if(suma %2==0) {
				par=par+suma;
			}
		}while(suma!=0);
		
		System.out.printf("la suma de solo los numero pares es: %d",par);

	}

}

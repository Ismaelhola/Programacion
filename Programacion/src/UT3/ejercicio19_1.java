/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio19_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		int suma;
		do {
			System.out.println("Escribe un numero entero:");
			Scanner scs= new Scanner(System.in);
			suma= scs.nextInt();
			numero= numero+suma;
		}while(suma!=0);
		System.out.printf("la suma total es %d",numero);
	}

}

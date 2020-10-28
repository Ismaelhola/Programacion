/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		int suma;
		do {
			System.out.println("escribe un numero entero:");
			Scanner ssc= new Scanner(System.in);
			suma= ssc.nextInt();
			numero= numero+suma;
			System.out.println("PUTO");
			System.out.println("reputo");
		}while(suma !=0);

		System.out.printf("la suma total de los numeros son %d",numero);
	}

}

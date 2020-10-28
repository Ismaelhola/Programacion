/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		int suma;
		float contador=0;
		
		do {
			System.out.println("Escribe un numero entero:");
			Scanner scs= new Scanner(System.in);
			suma= scs.nextInt();
			numero= numero+suma;
			contador=contador+1;
		}while(suma!=0);
		System.out.printf("la suma total es %d\n",numero);
		System.out.printf("y la media de los numeros es %5.2f",numero/contador);

	}

}

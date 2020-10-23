/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n= new Scanner(System.in);
		
		System.out.println("Escribe un numero:");
		
		int numero = n.nextInt();
		int contador =1;
		
		//bucle while
		while(contador<=10) {
			System.out.printf("%d X %d = %d \n", numero, contador, numero*contador);
			contador= contador+1;
		}
		//bucle do while
		contador=1;
		do {
			System.out.printf("%d x %d = %d \n", numero, contador, numero*contador);
			contador++;
		}while(contador<=10);
		//bucle for
		for(contador=1; contador<=10; contador++) {
			System.out.printf("%d x %d = %d \n", numero, contador, numero*contador);
		}

	}

}

/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int contador=0;
		int contador2;
		
		System.out.println("Escribe el numero de * que quiere que tenga el lado de tu cuadrado:");
		numero=sc.nextInt();
		System.out.println("Este es tu cuadrado:\n");
		
		do {
			contador2=0;
			do {
				System.out.printf("* ");
				contador2=contador2+1;
			}while(contador2!=numero);
			System.out.println();
			contador=contador+1;
		}while(contador!=numero);

	}

}

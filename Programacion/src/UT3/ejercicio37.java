/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int base;
		int altura;
		int contador=0;
		int contador2;
		
		System.out.println("Escribe la base que quiere que tenga tu rectangulo:");
		base=sc.nextInt();
		System.out.println("Escribe la altura que quiere que tenga tu rectangulo:");
		altura=sc.nextInt();
		System.out.println("Este es tu rectangulo:\n");
		
		do {
			contador2=0;
			do {
				System.out.printf("* ");
				contador2=contador2+1;
			}while(contador2!=base);
			System.out.println();
			contador=contador+1;
		}while(contador!=altura);

	}

}

/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int contador=0;
		int contador2;
		
		System.out.println("Escribe el numero  de * que quieres que tenga tu cuadrado:");
		numero=sc.nextInt();
		System.out.println("Este es tu cuadrado:");
		
		do {
			contador2=0;
			contador=contador+1;
			if(contador%2==0) {
				do {
					contador2=contador2+1;
					if(contador2%2==0) {
						System.out.printf("*");
					}else {
						System.out.printf(" ");
					}
				}while(contador2!=numero);
			}else {
				do {
					contador2=contador2+1;
					if(contador2%2==0) {
						System.out.printf(" ");
					}else {
						System.out.printf("*");
					}
				}while(contador2!=numero);
			}
			System.out.println();
		}while(contador!=numero);

	}

}

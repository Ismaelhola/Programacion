/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int contador=1;
		int contador2=0;
		
		System.out.println("Escribe un numero:");
		numero=sc.nextInt();
		
		do {
			if(numero %contador==0) {
				contador2=contador2+1;
			}
			contador=contador+1;
		}while(contador<=numero);
		
		if(contador2<=2) {
			System.out.println("Es un numero primo");
		}else {
			System.out.println("No es un numero primo");
		}

	}

}

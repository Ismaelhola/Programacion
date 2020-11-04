/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero=0;
		int fin;
		int contador;
		int contador2;
		
		System.out.println("Escribe un numero:");
		fin=sc.nextInt();
		
		do {
			numero=numero+1;
			contador=1;
			contador2=0;
			do {
				if(numero %contador==0) {
					contador2=contador2+1;
				}
				contador=contador+1;
			}while(contador<=fin);
			
			if(contador2<=2) {
				System.out.printf("%d,",numero);
			}
			
		}while(numero!=fin);
		
		sc.close();

	}

}

/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio48 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int contador;
		
		do {
			contador=0;
			System.out.println("Escribe un numero parare cuando metas un numero de 4 cifra:");
			numero=sc.nextInt();
			
			do {
				numero=numero/10;
				contador=contador+1;
			}while(numero>0);
		}while(contador!=4);
		
		sc.close();

	}

}

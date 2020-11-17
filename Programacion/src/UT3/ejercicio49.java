/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio49 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int suma=0;
		int contador;
		
		do {
			contador=0;
			
			System.out.println("Escribe un numero:");
			numero=sc.nextInt();
			
			suma=suma+numero;
			do {
				numero=numero/10;
				contador=contador+1;
			}while(numero>0);
			
		}while(contador!=1);
		
		System.out.printf("Esta el la suma de todos los numeros: %d",suma);
		
	}

}

/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio80 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int[] na=new int [10];
		int maximo;
		
		n1=pide(n1);
		n2=pide(n2);
		maximo=maximo(n1,n2);
		
		System.out.printf("El maximo de los dos primeros numeros es %d:",maximo);
		
		n3=pide(n3);
		
	}
	private static int pide(int pide) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe un numero:");
		pide=sc.nextInt();
		
		sc.close();
		return pide;
	}
	private static int maximo(int numero, int numero2) {
		
		int max=numero;
		
		if(numero<=numero2) {
			max=numero2;
		}
		
		return max;
	}
	private static int maximo2(int numero,int numero2,int numero3) {
		int 
	}
}

/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio81 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n1;
		int n2;
		
		
		System.out.println("Escribe un numero");
		n1=sc.nextInt();
		System.out.println("Escribe un numero");
		n2=sc.nextInt();
		
		inter(n1,n2);

	}
	private static void inter(int inicio,int fin) {
		System.out.printf("%d, ",inicio);
		do {
			inicio=inicio+1;
			System.out.printf("%d, ",inicio);
		}while(inicio<fin);
	}

}

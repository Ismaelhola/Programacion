/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio64 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero1[];
		int numero2[];
		
		numero1=new int[5];
		numero2=new int[5];
		
		for(int i=0;i<numero1.length;i++) {
			System.out.println("Escribe un numero para poner en el primero array:");
			numero1[i]=sc.nextInt();
		}
		for(int i=0;i<numero2.length;i++) {
			System.out.println("Escribe un numero para poner en el segundo array:");
			numero2[i]=sc.nextInt();
		}
		System.out.println("Estos son los numeros metido en las dos array");
		for(int i=0;i<numero1.length;i++) {
			System.out.printf("%dº %d,%d\n",i+1,numero1[i],numero2[i]);
		}

	}

}

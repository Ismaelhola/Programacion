/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio51 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int cifra[];
		
		cifra=new int[4];
		
		System.out.println("Escribe un numero de cuatro cifras:");
		numero=sc.nextInt();
		
		for(int i=0;numero>0;i++) {
			cifra[i]=numero %10;
			numero=numero/10;
		}
		
		System.out.println("Estas son las cifras pares:");
		
		for(int i=0;i!=4;i++) {
			if(cifra[i] %2==0) {
				System.out.printf("%d,",cifra[i]);
			}
		}
		
		sc.close();

	}

}

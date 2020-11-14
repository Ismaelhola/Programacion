/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio47 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int contador=0;
		
		System.out.println("Escribe un numero y te dire las cifras que tiene:");
		numero=sc.nextInt();
		
		do {
			numero=numero/10;
			contador=contador+1;
			
		}while(numero>0);
		
		System.out.printf("Tu numero tiene %d cifras",contador);
		
		sc.close();

	}

}

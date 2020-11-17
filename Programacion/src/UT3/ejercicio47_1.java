/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio47_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int contador;
		
		System.out.println("Escribe un numero y te dire las cifras que tiene:");
		numero=sc.nextInt();
		
		if(numero<0) {
			numero=-numero;
		}
		
		for(contador=0; numero>0; contador++) {
			numero=numero/10;
		}
		
		System.out.printf("Tu numero tiene %d cifras",contador);
		
		sc.close();

	}

}

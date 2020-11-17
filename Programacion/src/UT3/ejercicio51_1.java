/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio51_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int divisor;
		int cifra[];
		int contador=0;
		
		System.out.println("Escribe un numero:");
		numero=sc.nextInt();
		divisor=numero;
		
		do {
			numero=numero/10;
			contador=contador+1;
		}while(numero>0);
		
		cifra=new int[contador];
		
		for(int i=0;divisor>0;i++) {
			cifra[i]=divisor %10;
			divisor=divisor/10;
		}
		
		System.out.println("Estas son las cifras pares:");
		
		for(int i=0;i!=contador;i++) {
			if(cifra[i] %2==0) {
				System.out.printf("%d,",cifra[i]);
			}
		}
		
		sc.close();

	}

}

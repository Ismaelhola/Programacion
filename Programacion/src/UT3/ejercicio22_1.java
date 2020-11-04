/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio22_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int multiplo;
		int contador=1;
		int base;
		
		System.out.println("Escribe la base a calcular:");
		numero=sc.nextInt();
		System.out.println("Escribe el elevado a calcular:");
		multiplo=sc.nextInt();
		
		base=numero;
		
		if(multiplo==0) {
			System.out.println("El calculo es 1");
		}else {
			if(multiplo==1) {
				System.out.printf("El calculo es %d",numero);
			}else {
				if(multiplo>0){
					do {
						numero=numero*base;
						contador=contador+1;
					}while(contador!=multiplo);
					
					System.out.printf("El calculo es %d",numero);
				}else {
					multiplo=-multiplo;
					do {
						numero=numero*base;
						contador=contador+1;
					}while(contador!=multiplo);
					
					System.out.printf("El calculo es 1/%d",numero);
				}
			}
		}
		
		sc.close();

	}

}

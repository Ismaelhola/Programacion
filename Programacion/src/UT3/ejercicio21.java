/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		int suma;
		float contador=-1;
		int mayor=0;
		Float infinito = Float.POSITIVE_INFINITY;
		float menor;
			
		menor=infinito;
		do {
			System.out.println("Escribe un numero:");
			Scanner scs=new Scanner(System.in);
			suma=scs.nextInt();
			numero=numero+suma;
			contador=contador+1;
			
			if(suma!=0) {
				
				if(suma>mayor) {
					mayor=suma;
				}
				if(suma<menor) {
					menor=(float) suma;
				}
			}
		}while(suma!=0);
		System.out.printf("La suma total es %d\n",numero);
		System.out.printf("La media es %5.2f\n",numero/contador);
		System.out.printf("El mayor es %d\n",mayor);
		System.out.printf("El menor es %5.0f\n",menor);

	}

}

/**
 * 
 */
package UT3;
import java.util.Scanner;

/**
 * @author Ismael m
 *
 */
public class ejercicio21_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		int suma;
		float contador=-1;
		int mayor=0;
		int menor=0;
		float media;
			
		
		do {
			System.out.println("Escribe un numero:");
			Scanner scs=new Scanner(System.in);
			suma=scs.nextInt();
			numero=numero+suma;
			contador=contador+1;
			
			if(contador==0) {
				menor=suma;
				mayor=suma;
			}
			
			if(suma!=0) {
				
				if(suma>mayor) {
					mayor=suma;
				}
				if(suma<menor) {
					menor=suma;
				}
			}
		}while(suma!=0);
		
		media=numero/contador;
		System.out.printf("La suma total es %d\n",numero);
		System.out.printf("La media es %5.2f\n",media);
		System.out.printf("El mayor es %d\n",mayor);
		System.out.printf("El menor es %d\n",menor);

	}

}

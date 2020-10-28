/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio4_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota=0;
		float suma;
		float contador=0;
		int opcion;
		
		do {
			System.out.println("Escribe una nota");
			Scanner scs=new Scanner(System.in);
			suma=scs.nextFloat();
			nota=nota+suma;
			contador=contador+1;
			System.out.println("¿Quiere poner mas notas?");
			System.out.println("0.no 1.si");
			System.out.println("Escribe tu decision:");
			Scanner sco=new Scanner(System.in);
			opcion=sco.nextInt();
		}while(opcion!=0);
		
		System.out.printf("la media es %5.2f",nota/contador);

	}

}

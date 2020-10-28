/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		float iva;
		
		do {
			System.out.println("¿Que opcion quieres escojer");
			System.out.println("1. pasar de precio sin iva a con iva");
			System.out.println("2. pasar de precio con iva a sin iva");
			System.out.println("3. salir");
			do {
				System.out.println("pon la opcion que quieres escojer:");
				Scanner sco=new Scanner(System.in);
				opcion= sco.nextInt();
			}while(opcion<1 && opcion>3);
			switch(opcion) {
				case 1:
					System.out.println("Cual es el precio sin iva:");
					Scanner sci1=new Scanner(System.in);
					iva= sci1.nextFloat();
					System.out.printf("El precio con iva es %5.2f\n",iva+(iva*0.21));
					break;
					
				case 2:
					System.out.println("Cual es el precio con iva:");
					Scanner sci2=new Scanner(System.in);
					iva= sci2.nextFloat();
					System.out.printf("El precio sin iva es %5.2f\n",iva/1.21);
					break;
			}
		}while(opcion!=3);

	}

}

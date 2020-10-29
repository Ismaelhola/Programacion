/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		float variable;
		float radio;
		
		do {
			System.out.println("Este es un menu para saber el  del circulo");
			System.out.println("¿Con que lo quieres realizar?");
			System.out.println("1. con el radio");
			System.out.println("2. con el diametro");
			System.out.println("3. salir del menu");
			
			do {
				System.out.println("¿Que opcion vas a escojer?");
				Scanner sco=new Scanner(System.in);
				opcion=sco.nextInt();
				
				if(opcion<1 && opcion>3) {
					System.out.println("La opcion escojida no es correcta escribe otra");
				}
			}while(opcion<1 && opcion>3);
			
			switch(opcion) {
			
				case 1:
					System.out.println("Escribe el radio del circulo:");
					Scanner scv1=new Scanner(System.in);
					variable=scv1.nextFloat();
					System.out.printf("El area es %5.2f\n",3.14*(variable*variable));
					break;
				
				case 2:
					System.out.println("Escribe el diametro del circulo:");
					Scanner scv2=new Scanner(System.in);
					variable=scv2.nextFloat();
					radio=variable/2;
					System.out.printf("El area es %5.2f\n",3.14*(radio*radio));
					break;
			}
		}while(opcion!=3);
		

	}

}

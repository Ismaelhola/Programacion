/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class minijuego {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int divisor;
		int opcion;
		
		System.out.println("Este juego trata de meter un numero que quieras");
		System.out.println("luego el programa lo dividira con el numero que eligas repetidamente");
		System.out.println("si el resultado de todas las divisiones da 1 has ganado");
		System.out.println("si en una de esas divisiones tiene mas de 0 de resto has perdido");
		
		do {
			System.out.println("Empieza el juego");
			System.out.println("Escribe el numero:");
			numero=sc.nextInt();
			System.out.println("Escribe el numero con el que quieres dividir:");
			divisor=sc.nextInt();
			
			do {
				numero=numero/divisor;
			}while(numero%divisor==0 && numero!=1);
			
			System.out.printf("%d\n",numero);
			
			if(numero%divisor==0) {
				System.out.println("has perdido el juego");
			}else {
				System.out.println("has ganado el juego");
			}
			
			System.out.println("¿Quieres seguir jugando?");
			System.out.println("1.no");
			System.out.println("2.si");
			System.out.println("Escribe la opcion a escojer:");
			opcion=sc.nextInt();
			System.out.println();
		}while(opcion!=1);
		
		sc.close();

	}

}
//pones un numero y va dividiendo entre el otro numero que pongas y si al final te da uno ganas
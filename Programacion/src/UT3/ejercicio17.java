/**
 * 
 */
package UT3;
import java.util.Scanner;

/**
 * @author Ismael m
 *
 */
public class ejercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		int intervalo;
		
		System.out.println("Introduce un numero entero:");
		Scanner scn1=new Scanner(System.in);
		numero1=scn1.nextInt();
		System.out.println("Introduce otro numero entero:");
		Scanner scn2=new Scanner(System.in);
		numero2=scn2.nextInt();
		System.out.println("Introduce un intervalo:");
		Scanner sci=new Scanner(System.in);
		intervalo=sci.nextInt();
		
		if(numero1<numero2) {
			do {
				System.out.printf("%d,",numero1);
				numero1=numero1+intervalo;
			}while(numero1 < numero2);
		}else {
			do {
				System.out.printf("%d,",numero2);
				numero2=numero2+intervalo;
			}while(numero2 < numero1);
		}

	}

}

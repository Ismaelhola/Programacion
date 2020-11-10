/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int contador=0;
		int contador2;
		int contadorin;
		int contadorin2;
		
		System.out.println("Escribe el numero de * que quieres que tenga la base y la altura de tu triangulo:");
		numero=sc.nextInt();
		System.out.println("Este es tu triangulo:");
		
		contadorin=numero;
		
		do {
			contador2=0;
			contador=contador+1;
			contadorin2=0;
			do {
				System.out.printf(" ");
				contadorin2=contadorin2+1;
			}while(contadorin2!=contadorin);
			do {
				System.out.printf("* ");
				contador2=contador2+1;
			}while(contador2!=contador);
			System.out.println();
			contadorin=contadorin-1;
		}while(contador!=numero);

	}

}

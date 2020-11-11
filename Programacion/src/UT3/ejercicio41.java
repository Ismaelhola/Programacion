/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int contador;
		int contador2;
		int contadorin=0;
		int contadorin2;
		
		System.out.println("Escribe el numero de * que quieres que tenga la base y la altura de tu triangulo:");
		numero=sc.nextInt();
		System.out.println("Este es tu triangulo:");
		
		contador=numero;
		
		do {
			contador2=0;
			contadorin2=0;
			contadorin=contadorin+1;
			
			do {
				System.out.printf(" ");
				contadorin2=contadorin2+1;
			}while(contadorin2!=contadorin);
			
			do{
				System.out.printf("* ");
				contador2=contador2+1;
			}while(contador2!=contador);
			
			System.out.println();
			contador=contador-1;
			
		}while(contador!=0);
		
		sc.close();

	}

}

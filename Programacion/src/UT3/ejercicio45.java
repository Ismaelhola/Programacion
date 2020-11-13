/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio45 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int contador=0;
		int contador2;
		
		System.out.println("Escribe el numero de * que quiere que tenga el lado de tu cuadrado:");
		numero=sc.nextInt();
		System.out.println("Este es tu cuadrado:");
		
		do{
			contador=contador+1;
			contador2=0;
			if(contador==1 || contador==numero){
				do {
					System.out.printf("* ");
					contador2=contador2+1;
				}while(contador2!=numero);
			}else{
				do {
					contador2=contador2+1;
					if(contador2==1 || contador2==numero){
						System.out.printf("* ");
					}else{
						System.out.printf("  ");
					}
				}while(contador2!=numero);
			}
			
			System.out.println();
			
		}while(contador!=numero);
		
		sc.close();

	}

}

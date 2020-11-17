/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio50 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		int contador[];
		
		contador=new int[6];
		contador[0]=0;
		
		System.out.println("Escribe el numero de * que quiere que tenga:");
		numero=sc.nextInt();
		System.out.println("Esta es tu figura:");
		contador[3]=numero-1;
		
		do {
			contador[0]=contador[0]+1;
			contador[1]=0;
			contador[2]=0;
			do {
				System.out.printf(" ");
				contador[1]=contador[1]+1;
			}while(contador[1]!=contador[0]);
			do {
				System.out.printf("*");
				contador[2]=contador[2]+1;
			}while(contador[2]!=numero);
			
			System.out.println();
			
		}while(contador[0]!=numero);
		
		do {
			contador[4]=0;
			contador[5]=0;
			do {
				System.out.printf(" ");
				contador[4]=contador[4]+1;
			}while(contador[4]!=contador[3]);
			do {
				System.out.printf("*");
				contador[5]=contador[5]+1;
			}while(contador[5]!=numero);
			
			System.out.println();
			contador[3]=contador[3]-1;
			
		}while(contador[3]!=0);
		
		sc.close();

	}

}

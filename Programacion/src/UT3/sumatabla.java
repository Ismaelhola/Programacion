/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class sumatabla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero[]=new int[2];
		int tabla[][][];
		
		System.out.println("Cuantas tablas quieres sumar:");
		numero[0]=sc.nextInt();
		System.out.println("Cuantos numero quieres meten en la primera fila:");
		numero[1]=sc.nextInt();
		
		tabla=new int[numero[0]][numero[1]][numero[1]];
		
		
		
		sc.close();
		
	}

}

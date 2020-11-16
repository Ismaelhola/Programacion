/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio63 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero[];
		int media=0;
		
		numero=new int[10];
		
		for(int i=0; i<10; i++){
			System.out.println("Escribe un numero:");
			numero[i]=sc.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			System.out.printf("%d\n",numero[i]);
		}
		
		for(int i=0; i<10; i++) {
			media=media+numero[i];
		}
		
		System.out.printf("la media es: %d",media/10);
		
		sc.close();
	}

}

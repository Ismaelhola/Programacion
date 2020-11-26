/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio69 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int array[]=new int[10];
		int numero;
		int posicion;
		
		for(int i=0; i<8; i++) {
			System.out.printf("Escribe el %dº numero:\n",i+1);
			array[i]=sc.nextInt();
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.printf("%d,",array[i]);
		}
		System.out.println("");
		
		System.out.println("Escribe el 9º numero:");
		numero=sc.nextInt();
		System.out.println("En que posicion quiere que vaya:");
		posicion=sc.nextInt();
		
		for(int i=9¡; i>posicion;i--) {
			array[i]=array[i-1];
		}
		
		array[posicion]=numero;
		
		for(int i=0; i<array.length; i++) {
			System.out.printf("%d,",array[i]);
		}
		System.out.println("");
		
		System.out.println("Escribe el 10º numero:");
		numero=sc.nextInt();
		System.out.println("En que posicion quiere que vaya:");
		posicion=sc.nextInt();
		
		for(int i=9; i>posicion;i--) {
			array[i]=array[i-1];
		}
		
		array[posicion]=numero;
		
		for(int i=0; i<array.length; i++) {
			System.out.printf("%d,",array[i]);
		}
		System.out.println("");
		
		sc.close();

	}

}

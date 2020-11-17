/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio65 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero[];
		int creciente;
		int decreciente;
		
		numero=new int[10];
		
		for(int i=0; i<numero.length; i++) {
			System.out.println("Escribe un numero:");
			numero[i]=sc.nextInt();
		}
		creciente=numero[1]-numero[0];
		decreciente=numero[0]-numero[1];
		if(numero[2]==numero[1]+creciente) {
			System.out.println("Son numeros crecientes");
			for(int i=0; i<numero.length; i++) {
				System.out.println(numero[i]);
			}
		}else {
			if(numero[2]==numero[1]-decreciente) {
				System.out.println("Son numeros decrecientes");
				for(int i=0; i<numero.length; i++) {
					System.out.println(numero[i]);
				}
			}else {
				System.out.println("Son numeros desordenados");
				for(int i=0; i<numero.length; i++) {
					System.out.println(numero[i]);
				}
			}
		}

	}

}

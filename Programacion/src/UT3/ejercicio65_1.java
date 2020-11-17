/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio65_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero[];
		int creciente;
		int contador=0;
		int contador2=0;
		
		numero=new int[10];
		
		for(int i=0; i<numero.length; i++) {
			System.out.println("Escribe un numero:");
			numero[i]=sc.nextInt();
		}
		creciente=numero[1]-numero[0];
		
		for(int i=0; i<9; i++) {
			if(numero[i+1]==numero[i]+creciente) {
				contador=contador+1;
			}else {
				contador2=contador2+1;
			}
		}
		
		if(contador==9) {
			System.out.println("Son numeros crecientes");
			for(int i=0; i<numero.length; i++) {
				System.out.println(numero[i]);
			}
		}else {
			if(contador2==9) {
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
		
		sc.close();

	}

}

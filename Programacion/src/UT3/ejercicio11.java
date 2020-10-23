/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float precio;
		System.out.println("Escribe el precio del producto al que le quieres realizar un descuento:");
		Scanner sc= new Scanner(System.in);
		precio = sc.nextFloat();
		if(precio>200) {
			System.out.println("el precio es " +precio*0.8);
		}else { 
			if(precio>100) {
				System.out.println("el precio es " +precio*0.9);
		}else {
			System.out.println("el precio es " +precio);
		}
			
		}

	}

}

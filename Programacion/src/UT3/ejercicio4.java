/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		
		System.out.println("Escribe la primera nota");
		Scanner scn1=new Scanner(System.in);
		nota1=scn1.nextFloat();
		System.out.println("Escribe la segunda nota");
		Scanner scn2=new Scanner(System.in);
		nota2=scn2.nextFloat();
		System.out.println("Escrive la tercera nota");
		Scanner scn3=new Scanner(System.in);
		nota3=scn3.nextFloat();
		System.out.println("Escribe la Cuarta nota");
		Scanner scn4=new Scanner(System.in);
		nota4=scn4.nextFloat();

		System.out.printf("La nota media es %5.2f",(nota1+nota2+nota3+nota4)/4);
	}

}

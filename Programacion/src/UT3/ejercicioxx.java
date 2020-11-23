/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicioxx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int dni;
		char letra[]= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int resto;
		
		System.out.println("Escribe tu numero del DNI y te digo la letra que tiene");
		dni=sc.nextInt();
		
		resto=dni %23;
		
		System.out.println("La letra de tu DNI es "+letra[resto]);
		
		sc.close();
	}

}

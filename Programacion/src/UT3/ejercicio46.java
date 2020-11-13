/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio46 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero1;
		int numero2;
		int contador=-1;
		int ncontador;
		
		System.out.println("Escribe el primer numero:");
		numero1=sc.nextInt();
		System.out.println("EScribe el segundo numero:");
		numero2=sc.nextInt();
		
		if(numero1<numero2) {
			ncontador=numero1;
			
			do {
				ncontador=ncontador+1;
				contador=contador+1;
			}while(ncontador!=numero2);
			
			if(contador %2==0) {
				do {
					System.out.printf("%d,",numero1);
					numero1=numero1+2;
				}while(numero1<numero2);
			}else {
				do {
					numero1=numero1+1;
					System.out.printf("%d,",numero1);
				}while(numero1<numero2);
			}
		}else {
			ncontador=numero2;
			
			do {
				ncontador=ncontador+1;
				contador=contador+1;
			}while(ncontador!=numero1);
			
			if(contador %2==0) {
				do {
					System.out.printf("%d,",numero2);
					numero2=numero2+2;
				}while(numero2<numero1);
			}else {
				do {
					numero2=numero2+1;
					System.out.printf("%d,",numero2);
				}while(numero2<numero1);
			}
		}
		
		sc.close();

	}

}

/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio66_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero[];
		int contador;
		int igual[];
		
		numero=new int[10];
		igual=new int[5];
		
		for(int i=0; i<10; i++) {
			System.out.println("Escribe un numero:");
			numero[i]=sc.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			contador=i;
			do {
				if(contador!=i) {
					if(numero[contador]==numero[i]) {
						
					}else {
						System.out.printf("%dº%d y %dº%d estos numero no se repite\n",contador, numero[contador], i, numero[i]);
					}
				}
				contador=contador+1;
			}while(contador!=10);
		}
		
		sc.close();

	}

}

/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class prueba2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=1;
		int numaux;
		int i;
		int j;
		int[]numero=new int[contador];
		for(i = 1; i<=contador; i++) {
			System.out.printf("Escribe el %d numero entero\n",i);
			Scanner sc=new Scanner(System.in);
			numero[i]=sc.nextInt();
			contador=contador+1;
		}
		for(i = 1; i <= contador; i++){
			for(j = i; j <= contador; j++){
				if(numero[i] < numero[j]){
					numaux = numero[i];
					numero[i] = numero[j];
					numero[j] = numaux;
				}
			}
		}
		System.out.println("\nLos números de mayor a menor son:");
		for(i = 1; i <= contador; i++){
		System.out.println(numero[i]);
		}

	}

}

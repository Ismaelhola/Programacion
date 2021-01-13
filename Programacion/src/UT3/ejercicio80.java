/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio80 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int[] na=new int [10];
		int maximo;
		int opcion = 0;
		
		System.out.println("Escribe un numero:");
		n1=sc.nextInt();
		System.out.println("Escribe un numero:");
		n2=sc.nextInt();
		maximo=maximo(n1,n2);
		
		System.out.printf("El maximo de los dos primeros numeros es %d:\n",maximo);
		
		System.out.println("Escribe un numero:");
		n3=sc.nextInt();
		maximo=maximo2(n1,n2,n3);
		
		System.out.printf("El maximo de los tres numeros es %d:\n",maximo);
		
		System.out.println("ahora vas a dar variables a un array");
		for(int i=0;opcion!=2;i++) {
			System.out.println("Escribe un numero:");
			na[i]=sc.nextInt();
			if(i>=4) {
				System.out.println("quieres poner mas numeros");
				System.out.println("1.si");
				System.out.println("2.no");
				opcion=sc.nextInt();
			}
		}
		sc.close();
		
	}
	private static int maximo(int numero, int numero2) {
		
		int max=numero;
		
		if(numero<=numero2) {
			max=numero2;
		}
		
		return max;
	}
	private static int maximo2(int numero,int numero2,int numero3) {
		int max=numero;
		
		if (numero> numero2 && numero>numero3){ 

			max= numero;} 

			if(numero2> numero && numero2>numero3) { 

				max= numero2;} 

			if(numero3> numero && numero3>numero2) { 

				max= numero3; 

			} 

			return max; 
	}
	private static int maximo3(int numero[]) {
		int max=numero[0];
		for(int i=0; i<numero.length; i++) {
			
		}
	}
}

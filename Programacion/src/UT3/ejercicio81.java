/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio81 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n1;
		int n2;
		int array[];
		int in;
		
		
		System.out.println("Escribe un numero");
		n1=sc.nextInt();
		System.out.println("Escribe un numero");
		n2=sc.nextInt();
		
		inter(n1,n2);
		
		System.out.println("Escribe un numero");
		n1=sc.nextInt();
		System.out.println("Escribe un numero");
		n2=sc.nextInt();
		array=new int[contador(n1,n2,1)];
		
		array=array(array,n1,n2,1);
		pinta(array);
		
		System.out.println("Escribe un numero");
		n1=sc.nextInt();
		System.out.println("Escribe un numero");
		n2=sc.nextInt();
		System.out.println("¿Que intervalo quieres?");
		in=sc.nextInt();
		
		array=new int[contador(n1,n2,in)];
		
		array=array(array,n1,n2,in);
		pinta(array);
		
		sc.close();
		
	}
	private static void inter(int inicio,int fin) {
		System.out.printf("%d, ",inicio);
		do {
			inicio=inicio+1;
			System.out.printf("%d, ",inicio);
		}while(inicio<fin);
		System.out.println();
	}
	private static int contador(int inicio,int fin,int intervalo) {
		
		int contador=1;
		
		do {
			inicio=inicio+intervalo;
			contador++;
		}while(inicio<fin);
		return contador;
	}
	private static int[] array(int array[],int inicio,int fin,int intervalo) {
		
		array[0]=inicio;
		for(int i=1;inicio<fin;i++) {
			inicio=inicio+intervalo;
			array[i]=inicio;
		}
		return array;
	}
	private static void pinta(int pinta[]) {
		for(int i=0; i<pinta.length; i++) {
			System.out.printf("%d, ",pinta[i]);
		}
	}
}

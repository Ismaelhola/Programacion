/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio73 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int array[]=new int[10];
		int numero;
		
		for(int i=0; i<array.length;i++) {
			System.out.println("Escribe un numero:");
			numero=sc.nextInt();
			
			if(i==0) {
				array[i]=numero;
			}else {
				for(int j=0; j<i; j++) {
					if(array[j]==numero) {
						System.out.println("Este numero ya lo has introducido mete otro");
						i=i-1;
					}else {
						array[i]=numero;
					}
				}
			}
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.printf("%d,",array[i]);
		}
		
		sc.close();

	}

}

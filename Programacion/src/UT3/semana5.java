/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class semana5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero[]=new int[4];
		char palo[]=new char[4];
		int contador[]=new int[2];
		
		for(int i=0;i<numero.length; i++) {
			System.out.printf("Escribe el numero de la %d� carta:\n",i+1);
			numero[i]=sc.nextInt();
			System.out.printf("Escribe el palo de la %d� carta:\n",i+1);
			palo[i]=sc.next().charAt(0);
			
			if(numero[i]<1 || numero[i]>14) {
				System.out.println("Esta carta no existe escribe otra");
				i=i-1;
			}
		}
		
		for(int i=0; i<numero.length; i++) {
			if(numero[i]==1){
				numero[i]=14;
			}
		}
		
		for (int x = 0; x < numero.length; x++) {
	        for (int i = 0; i < numero.length-x-1; i++) {
	            if(numero[i] < numero[i+1]){
	                int tmp = numero[i+1];
	                numero[i+1] = numero[i];
	                numero[i] = tmp;
	            }
	        }
	    }
		
		for(int i=0; i<3; i++) {
			if(numero[i+1]==numero[i]-1) {
				contador[0]=contador[0]+1;
			}
		}
		
		for(int i=0; i<3; i++) {
			if(palo[i+1]==palo[i]) {
				contador[1]=contador[1]+1;
			}
		}
		
		if(contador[0]==3) {
			if(contador[1]==3) {
				if(numero[3]==2 || numero[0]==14) {
					if(numero[3]==2) {
						System.out.println("Falta un "+(numero[0]+1)+" "+palo[0]+" para hacer escalera de color");
					}else {
						System.out.println("Falta un "+(numero[3]-1)+" "+palo[0]+" para hacer escalera de color");
					}
				}else {
					System.out.println("Falta un "+(numero[3]-1)+" "+palo[0]+" o un "+numero[0]+" "+palo[0]+" para hacer escalera de color");
				}
			}else {
				System.out.println("no es posible hacer la escalera de color");
			}
		}else {
			System.out.println("no es posible hacer la escalera de color");
		}

				
		sc.close();

	}

}

/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio43_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int primo;
		int contador=0;
		int contador2;
		int contador3;
		int contador4;
		int contador5;
		int contador6;
		
		System.out.println("Escribe el numero primo:");
		primo=sc.nextInt();
		
		do {
			contador=contador+1;
			contador2=1;
			contador3=0;
			
			if(contador!=1) {
				do {
					if(contador %contador2==0) {
						contador3=contador3+1;
					}
					contador2=contador2+1;
				}while(contador2<=contador);
				
				if(contador3<=2){
					contador4=0;
					
					do{
						contador4=contador4+1;
						contador5=1;
						contador6=0;
						
						if(contador4!=1) {
							do {
								if(contador4 %contador5==0) {
									contador6=contador6+1;
								}
								contador5=contador5+1;
							}while(contador5<=contador4);
							if(contador6<=2) {
								System.out.printf("%d*%d=%d\n",contador,contador4,contador*contador4);
							}
							
						}
												
					}while(contador4<primo);
				}
				
			}
						
		}while(contador!=primo);

	}

}

/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class semana3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int superficie;
		int metros2;
		int minimo;
		int maximo;
		int division;
		
		minimo=90*45;
		maximo=120*90;
		
		do {
			System.out.println("Escribe la superficie");
			Scanner scs=new Scanner(System.in);
			superficie=scs.nextInt();
			
			if(superficie!=0) {
				System.out.println("Escribe la estimacion en campos de futbol");
				Scanner scm2=new Scanner(System.in);
				metros2=scm2.nextInt();
				if(metros2!=0) {
					division=superficie/metros2;
					if(division>=minimo && division<=maximo) {
						System.out.println("si es correcta");
					}else {
						System.out.println("no es correcto");
					}
				}else {
					System.out.println("ERROS");
				}
			}else {
				System.out.println("ERROS");
			}
			
		}while(superficie!=0);

}
}
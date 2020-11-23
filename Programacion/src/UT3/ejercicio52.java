/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio52 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		char signo;
		int resultado=0;
		
		System.out.println("introduce un numero:");
		numero=sc.nextInt();
		resultado=numero;
		
		do {
			System.out.println("introduce un signo:");
			signo=sc.next().charAt(0);
			
			if(signo == '+'||signo == '-'||signo == '*'||signo == '/'||signo == '=') {
				if(signo!= '=') {
					System.out.println("introduce un numero:");
					numero=sc.nextInt();
				}		
				if(signo == '+') {
					resultado=resultado+numero;
				}
				if(signo == '-') {
					resultado=resultado-numero;
				}
				if(signo == '*') {
					resultado=resultado*numero;
				}
				if(signo == '/') {
					resultado=resultado/numero;
				}
				if(signo != '=') {
					System.out.println("valor actual:");
					System.out.printf("%d\n",resultado);
				}
			}else {
				System.out.println("No he entendido le signo escrito puedes escribir otro");
			}
			
		}while(signo != '=');
		
		System.out.println("valor final:");
		System.out.printf("%d",resultado);
		
		sc.close();

	}

}

/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class semana4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int peso;
		int elefante;
		int opcion;
		
		do {
			System.out.println("Escribe el peso que soporta la tela de araña:");
			peso=sc.nextInt();
			
			do {
				System.out.println("Escribe el peso del elefante que se va a subir si no quieres poner mas pon un 0:");
				elefante=sc.nextInt();
				
				peso=peso-elefante;
				
			}while(elefante!=0 && peso>0);
			
			if(peso<0){
				System.out.println("La tela de araña se rompio\n");
			}else {
				System.out.println("la tela de araña a aguantado\n");
			}
			System.out.println("quieres seguir:");
			System.out.println("1.no");
			System.out.println("2.si");
			System.out.println("Escribe el numero de la opcion elegida:");
			opcion=sc.nextInt();
			
		}while(opcion!=1);
		
		sc.close();

	}

}

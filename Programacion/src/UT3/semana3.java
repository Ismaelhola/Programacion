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
		float largo;
		float ancho;
		int opcion;
		do{
			System.out.println("Escribe el largo del campo a comparar en metros:");
			Scanner lsc= new Scanner(System.in);
			largo= lsc.nextFloat();
			
			System.out.println("Escribe el ancho del campo a comparar en metros:");
			Scanner asc= new Scanner(System.in);
			ancho= asc.nextFloat();
			
			if(largo>=90 && largo<=120){
				if(ancho>=45 && ancho<=90) {
					System.out.println("si");
				}else {
					System.out.println("no");
				}
			}else {
				System.out.println("no");
			}
			System.out.println("Si quieres salir escribe un 0 si no escribe cualquier numero");
			Scanner osc= new Scanner(System.in);
			opcion= osc.nextInt();
			
		}while(opcion!=0);

}
}
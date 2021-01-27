/**
 * 
 */
package actividades;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class exament1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int taquillas[] = new int[10];
		int opcion;
		int ntaquilla;
		int contador=0;
		
		for(int i=0; i<taquillas.length; i++) {
			taquillas[i]=(int) (Math.random()*2);
		}
		
		do {
			System.out.println("1. Cerrar taquilla");
			System.out.println("2. Abrir taquilla");
			System.out.println("0. salir");
			System.out.println("Que opcion vas a escojer");
			opcion= sc.nextInt();
			
			if(opcion == 1) {
				
				for(int i=0; i<taquillas.length;i++) {
					System.out.printf("%d,",i+1);
					
					if (taquillas[i]==0) {
						System.out.println("Abierta");
					}else{
						System.out.println("Cerrada");
					}
				}
				
				do {
					System.out.println("Que taquilla quieres ocupar");
					ntaquilla= sc.nextInt();
					
					if(taquillas[ntaquilla-1]==1) {
						System.out.println("Esta taquilla esta cerrada elige otra");
					}else {
						taquillas[ntaquilla-1]=1;
						System.out.println("Ya esta cerrada la taquilla");
						contador++;
					}
				}while(contador == 0);
				
			}else if(opcion == 2) {
				
				for(int i=0; i<taquillas.length;i++) {
					System.out.printf("%d,",i+1);
					
					if (taquillas[i]==0) {
						System.out.println("Abierta");
					}else{
						System.out.println("Cerrada");
					}
				}
				
				do {
					System.out.println("Que taquilla quieres abrir");
					ntaquilla= sc.nextInt();
					
					if(taquillas[ntaquilla-1]==0) {
						System.out.println("Esta taquilla esta abierta elige otra");
					}else {
						taquillas[ntaquilla-1]=0;
						System.out.println("Ya esta abierta la taquilla");
						contador++;
					}
				}while(contador == 0);
			}else {
				System.out.println("Hasta luego");
			}
			contador=0;
		}while(opcion!=0);
		
		sc.close();

	}

}

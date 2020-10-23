/**
 * 
 */
package UT3;
import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class semana2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		System.out.println("Menu de estado de animo :-)");
		System.out.println("Buenos dias estas son las opciones que tengo para ti\n");
		do{
			System.out.println("1. Hoy estoy feliz.");
			System.out.println("2. Hoy estoy triste.");
			System.out.println("3. Hoy estoy enfadado.");
			System.out.println("4. Hoy estoy nervioso. ");
			System.out.println("5. quiero salir del menu.\n ");
			
			do{
				System.out.println("Cual es tu estado de animo hoy:");
				Scanner sc= new Scanner(System.in);
				opcion =sc.nextInt();
				
				if(opcion<1 || opcion>5){
					System.out.println("\n");
					System.out.println("No entiendo tu estado de animo puedes volver a indicarlo.\n ");
				}
			}while(opcion<1 || opcion>5);
			switch(opcion){
				case 1:
					System.out.println("Hoy estas feliz pues te recomiendo estas canciones para mejorar mas el dia:\n");
					System.out.println("-Brandy de Looking Glass");
					System.out.println("-Mr. blue sky de Electric Light Orchestra");
					System.out.println("-Sangria de Trueno y WOS\n");
					System.out.println("Espero haberte ayudado si quieres ver otras opciones puedes escojer otra\n");
					break;
					
				case 2:
					System.out.println("Hoy no es tu mejor dia no, pues te recomiendo escuchar estas canciones para animarte:\n");
					System.out.println("Father and Son de Cat Stevens");
					System.out.println("Stressed Out de Twenty One Pilots");
					System.out.println("Terraza de WOS\n");
					System.out.println("Espero haberte ayudado si quieres ver otras opciones puedes escojer otra\n");
					break;
				
				case 3:
					System.out.println("Vale no le peges un puñetazo a la pared nunca sale bien mejor escucha estas canciones:\n");
					System.out.println("Feel Invicible de Skillet");
					System.out.println("Godzilla de Eminem");
					System.out.println("In the end de Linkin Park\n");
					System.out.println("Espero haberte ayudado si quieres ver otras opciones puedes escojer otra\n");
					break;
				
				case 4:
					System.out.println("tienes algo importante por lo que veo, escucha estas canciones para calmarte un poco:\n");
					System.out.println("Where is my mind? de Pixies");
					System.out.println("Escape de Rupert Holmes");
					System.out.println("House of Gold de Twenty One Pilots\n");
					System.out.println("Espero haberte ayudado si quieres ver otras opciones puedes escojer otra\n");
					break;
			
			}
		}while(opcion !=5);
		System.out.println("\n");
		System.out.println("Un plazer ayudarte ya nos veremos otro dia");

	}

}

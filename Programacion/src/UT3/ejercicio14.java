/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float precio;
		int opcion;
		
		System.out.println("¿Cual es el precio del vuelo?");
		Scanner scp=new Scanner(System.in);
		precio= scp.nextFloat();
		System.out.println("¿Vas a llevar Equipaje?");
		System.out.println("0.no 1.si");
		Scanner sco4=new Scanner(System.in);
		opcion=sco4.nextInt();
		if(opcion==1) {
			System.out.println("¿Tienes menos de 14 años?");
			System.out.println("0.no 1.si");
			Scanner sco5=new Scanner(System.in);
			opcion=sco5.nextInt();
			if(opcion==1) {
				precio=precio/2;
				precio=precio+20;
			}else {
				precio=precio+50;
			}
		}
		System.out.println("¿Quiere escojer asiento?");
		System.out.println("0.no 1.si");
		Scanner sco1=new Scanner(System.in);
		opcion=sco1.nextInt();
		if(opcion==1){
			precio=precio+10;
		}
		System.out.println("¿Vas a querer comida durante el vuelo?");
		System.out.println("0.no 1.si");
		Scanner sco2=new Scanner(System.in);
		opcion=sco2.nextInt();
		if(opcion==1) {
			System.out.println("¿Tienes mas de 60 años o la tarjeta viajero");
			System.out.println("0.no 1.si");
			Scanner sco3=new Scanner(System.in);
			opcion=sco3.nextInt();
			if(opcion==0){
				precio=precio+20;
			}
		}
		System.out.println("El precio del vuelo es " +precio);
	}

}

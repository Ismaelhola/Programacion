/**
 * 
 */
package actividades;
import java.util.Scanner;

/**
 * @author Usuario
 *
 */
public class actividad22_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Scanner salida = new Scanner(System.in);
		
		int salir;
		int opcion;
		
		libros libro1 = new libros("la casa de la pradera", "Chiquito de la calzada", 10, 9);
		libros libro2 = new libros("el ultimo mohicano", "kiko rivera", 5, 4);
		
		do {
			System.out.println("Que operacion quieres realizar");
			System.out.println("1. alquilar 2. devolver");
			System.out.println("Escribe el numero de la operacion a realizar:");
			opcion=entrada.nextInt();
			
			if(opcion == 1) {
				if(libro1.prestar()==true) {
					System.out.println("se a realizado la opearcion con exito");
				}else {
					System.out.println("no se a podido reslizar con exito la operacion");
				}
			}else {
				if(libro1.devolver()==true) {
					System.out.println("se a realizado la opearcion con exito");
				}else {
					System.out.println("no se a podido reslizar con exito la operacion");
				}
			}
			
			libro1.toString();
			
			System.out.println("Quiere salir");
			System.out.println("1.si 2.no");
			System.out.println("Escribe el numero de la opcion a realizar:");
			salir=salida.nextInt();
			
		}while(salir!=1);
		
		libro1.setprestados(1);
	
	}

}

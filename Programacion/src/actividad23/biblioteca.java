/**
 * 
 */
package actividad23;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Ismael m
 *
 */
public class biblioteca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sco=new Scanner(System.in);
		Scanner scn=new Scanner(System.in);
		Scanner sct=new Scanner(System.in);
		
		ArrayList<Libros>catalogo= new ArrayList<Libros>();
		int opcion;
		String titulo;
		String autor;
		int ejemplares;
		int prestados;
		
		do {
			
			menu();
			opcion=sco.nextInt();
			
			switch(opcion) {
			case 0:
				System.out.println("Hasta luego");
				break;
			case 1:
				System.out.println("Has elegido dar de alta un libro.");
				System.out.println("Cual es el titulo del libro:");
				titulo=sct.nextLine();
				System.out.println("Cual es su autor:");
				autor=sct.nextLine();
				System.out.println("Cuantos ejemplares hay:");
				ejemplares=scn.nextInt();
				System.out.println("Cuantos ejemplares se han prestado:");
				prestados=scn.nextInt();
				
				catalogo.add(new Libros(titulo,autor,ejemplares,prestados));
				
				System.out.println("Ya se a guardado tu libro.");
				break;
			case 2:
				System.out.println("Has elegido que te mostremos los libros que tenemos.");
				System.out.println("Estos son los libros que tenemos actualmente:");
				
				break;
			case 3:
				System.out.println("Has elegido dar de baja un libro.");
				System.out.println("Dime el titulo del libro que quieres dar de baja");
				
			}
		}while(opcion!=0);

	}
	
	private static void menu() {
		
		System.out.println("Estas son las opciones:");
		System.out.println("1. Alta libro.");
		System.out.println("2. Consulta libro.");
		System.out.println("3. Baja libro.");
		System.out.println("4. Prestamos de libro.");
		System.out.println("0. salir.");
		System.out.println("Escribe tu opcion:");
		
	}
	
}

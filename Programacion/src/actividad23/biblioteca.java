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
		Scanner scn=new Scanner(System.in);
		Scanner sct=new Scanner(System.in);
		
		ArrayList<Libros>catalogo= new ArrayList<Libros>();
		int opcion;
		Libros libro= new Libros();
		
		do {
			
			opcion=menu(scn);
			
			switch(opcion) {
			case 0:
				System.out.println("Hasta luego");
				break;
			case 1:
				libro=primer(scn, sct);
				catalogo.add(new Libros(libro.gettitulo(),libro.getautor(),libro.getejemplares(),libro.getprestados()));
				
				System.out.println("Ya se a guardado tu libro.");
				break;
			case 2:
				segundo(sct,catalogo);
				break;
			case 3:
				tercer(sct,catalogo);
				break;
			case 4:
				cuartor(sct, catalogo);
				break;
			case 5:
				quinto(sct,catalogo);
				break;				
			}
		}while(opcion!=0);

	}
	private static int menu(Scanner sc) {
		int opcion;
		
		System.out.println("Estas son las opciones:");
		System.out.println("1. Alta libro.");
		System.out.println("2. Consulta libro.");
		System.out.println("3. Baja libro.");
		System.out.println("4. Prestamos de libro.");
		System.out.println("5. Devolucion de libro.");
		System.out.println("0. salir.");
		System.out.println("Escribe tu opcion:");
		opcion=sc.nextInt();
		
		return opcion;
	}
	private static Libros primer(Scanner scn, Scanner sct) {
		
		Libros libro =new Libros();
		int ejemplares;
		int prestados;
		
		System.out.println("Has elegido dar de alta un libro.");
		System.out.println("Cual es el titulo del libro:");
		libro.settitulos(sct.nextLine());
		System.out.println("Cual es su autor:");
		libro.setautor(sct.nextLine());
		System.out.println("Cuantos ejemplares hay:");
		ejemplares=scn.nextInt();
		System.out.println("Cuantos ejemplares se han prestado:");
		prestados=scn.nextInt();
		
		if(ejemplares<prestados) {
			prestados=0;
		}
		
		libro.setejemplares(ejemplares);
		libro.setprestados(prestados);
		
		return libro;
		
	}
	private static void segundo(Scanner sc, ArrayList<Libros> c) {
		String titulo;
		
		System.out.println("Has elegido la opcion consulta de libro.");
		System.out.println("¿Que libro quieres consultar?");
		titulo=sc.nextLine();
		for(int i=0; i<c.size(); i++) {
			if(c.get(i).gettitulo().equals(titulo)) {
				System.out.println(c.get(i).toString());
			}
		}
	}
	private static void tercer(Scanner sc, ArrayList<Libros> c) {
		String titulo;
		
		System.out.println("Has elegido dar de baja un libro.");
		System.out.println("Dime el titulo del libro que quieres dar de baja");
		titulo=sc.nextLine();
		for(int i=0; i<c.size(); i++) {
			if(c.get(i).gettitulo().equals(titulo)) {
				c.remove(i);
				System.out.println("Ya se a dado de baja el libro.");
			}
		}
	}
	private static void cuartor(Scanner sc, ArrayList<Libros>c) {
		String titulo;
		
		System.out.println("Has elegido realizar un prestamo.");
		System.out.println("¿Que libro quieres?");
		titulo=sc.nextLine();
		for(int i=0;i<c.size(); i++) {
			if(c.get(i).gettitulo().equals(titulo)) {
				if(c.get(i).prestar()==true) {
					System.out.println("se a realizado la opearcion con exito.");
				}else {
					System.out.println("no se a podido reslizar con exito la operacion.");
				}
			}
		}
	}
	private static void quinto(Scanner sc, ArrayList<Libros>c) {
		String titulo;
		
		System.out.println("Has elegido realizarr una devolucion.");
		System.out.println("¿Que libro quieres devolver?");
		titulo=sc.nextLine();
		for(int i=0;i<c.size(); i++) {
			if(c.get(i).gettitulo().equals(titulo)) {
				if(c.get(i).devolver()==true) {
					System.out.println("se a realizado la opearcion con exito");
				}else {
					System.out.println("no se a podido reslizar con exito la operacion");
				}
			}
		}
	}
	
}

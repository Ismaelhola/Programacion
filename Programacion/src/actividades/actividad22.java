/**
 * 
 */
package actividades;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class actividad22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String entradal;
		int entradan;
		
		//ejercicio 1 y 2
		libros libro1 = new libros("la casa de la pradera", "Chiquito de la calzada", 10, 9);
		libros libro2 = new libros("el ultimo mohicano", "kiko rivera", 5, 4);
		//variable del ejercicio 10
		libros libro3 = new libros();
		
		//ejercicio 3
		System.out.println("1. prestamo");
		if(libro1.prestar()==true) {
			System.out.println("se a realizado la opearcion con exito");
		}else {
			System.out.println("no se a podido reslizar con exito la operacion");
		}
		
		//ejercicio 4
		System.out.println("El numero de libros prestados son "+libro1.getprestados());
		
		//ejercicio 5
		System.out.println("2. prestamo");
		if(libro1.prestar()==true) {
			System.out.println("se a realizado la opearcion con exito");
		}else {
			System.out.println("no se a podido reslizar con exito la operacion");
		}
		
		System.out.println("El numero de libros prestados son "+libro1.getprestados());
		
		//ejercicio 6
		System.out.println("1. devolucion");
		if(libro1.devolver()==true) {
			System.out.println("se a realizado la opearcion con exito");
		}else {
			System.out.println("no se a podido reslizar con exito la operacion");
		}
		
		//ejercicio 7
		libro1.setprestados(0);
		
		//ejercicio 8
		System.out.println("2.devolucion");
		if(libro1.devolver()==true) {
			System.out.println("se a realizado la opearcion con exito");
		}else {
			System.out.println("no se a podido reslizar con exito la operacion");
		}
		
		System.out.println("El numero de libros prestados son "+libro1.getprestados());
		
		//ejercicio 9
		System.out.println(libro2.toString());
		
		//ejercicio 10
		System.out.println("creacion libro");
		System.out.println("titula del libro a crear");
		entradal=sc.nextLine();
		libro3.settitulos(entradal);
		System.out.println("autor del libro a crear");
		entradal=sc.nextLine();
		libro3.setautor(entradal);
		System.out.println("numero de ejemplares");
		entradan=sc.nextInt();
		libro3.setejemplares(entradan);
		System.out.println("numero de ejemplares prestados");
		entradan=sc.nextInt();
		libro3.setprestados(entradan);
		
		System.out.println(libro3.toString());
		
		sc.close();

	}

}

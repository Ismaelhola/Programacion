/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio82 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char o;
		float r;
		float a;
		
		System.out.println("Escribe el radio del cilindro:");
		r=sc.nextInt();
		System.out.println("Escribe la altura del cilindro:");
		a=sc.nextInt();
		do {
			System.out.println("¿Que operacion quieres realizar del cilindro?");
			System.out.println("a. area");
			System.out.println("v. volumen");
			System.out.println("Escribe tu opcion:");
			o=sc.next().charAt(0);
			
			if(o!='a'&&o!='v') {
				System.out.println("esta opcion no vale escribe otra");
			}
			
		}while(o!='a'&&o!='v');
		
		if(o=='a') {
			area(r,a);
		}else {
			volumen(r,a);
		}
		
		sc.close();
	}
	private static void area(float radio, float altura) {
		float resultado=(float) ((2*3.14*radio*altura)+(2*3.14));
		System.out.printf("El area es %5.2f",resultado);
	}
	private static void volumen(float radio, float altura) {
		float resultado=(float) (3.14*(radio*radio)*altura);
		System.out.printf("El volumen es %5.2f",resultado);
	}
}

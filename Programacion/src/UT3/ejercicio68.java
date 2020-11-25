/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class ejercicio68 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero;
		float asignatura1[];
		float asignatura2[];
		float asignatura3[];
		float media[];
		
		System.out.println("A cuantos alumnos vas a meter las notas:");
		numero=sc.nextInt();
		
		asignatura1=new float[numero];
		asignatura2=new float[numero];
		asignatura3=new float[numero];
		media=new float[numero];
		
		for(int i=0; i<asignatura1.length; i++) {
			System.out.printf("asignatura1 alumno%d escribe su nota:",i+1);
			asignatura1[i]=sc.nextFloat();
			System.out.printf("asignatura2 alumno%d escribe su nota:",i+1);
			asignatura2[i]=sc.nextFloat();
			System.out.printf("asignatura3 alumno%d escribe su nota:",i+1);
			asignatura3[i]=sc.nextFloat();
			System.out.println("");
		}
		
		for(int j=0; j<media.length; j++) {
			for(int i=0; i<asignatura1.length; i++) {
				if(asignatura1[i]<5) {
					System.out.printf("%5.2f no esta aprobado\n",asignatura1[i]);
				}
				media[j]=media[j]+asignatura1[i];
			}
			
			System.out.printf("la media es %5.2f\n",media[j]/3);
		}
		
		sc.close();

	}

}

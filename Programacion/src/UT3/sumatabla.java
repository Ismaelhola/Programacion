/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Ismael m
 *
 */
public class sumatabla {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int numero[]=new int[2];
		int tabla[][][];
		int suma;
		
		System.out.println("Cuantas tablas quieres sumar:");
		numero[0]=sc.nextInt();
		System.out.println("Cuantos numero quieres meten en la primera fila:");
		numero[1]=sc.nextInt();
				
		suma=numero[0]+1;
		tabla=new int[numero[0]+1][numero[1]][numero[1]];
		
		for(int i=0; i<numero[1]; i++) {
			for(int j=0; i<numero[1]; j++) {
				tabla[suma][i][j]=0;
			}
		}
		
		for(int i=0; i<numero[0]; i++) {
			System.out.printf("Vas a introducir los numeros de la %dº tabla:\n",i+1);
			for(int j=0; j<numero[1]; j++) {
				System.out.printf("Escribe el %dº numero:\n",j+1);
				tabla[i][0][j]=sc.nextInt();
				tabla[i][j][0]=tabla[i][0][j];
			}
		}
		
		for(int i=0; i<numero[0]; i++) {
			System.out.printf("Esta es la %dº tabla:\n",i+1);
			for(int j=0; j<numero[1]; j++) {
				System.out.printf("%d\t",tabla[i][j][0]);
				for(int n=1; n<numero[1]; n++) {
					tabla[i][j][n]=tabla[0][0][n]*(j+1);
					System.out.printf("%d\t",tabla[i][j][n]);
				}
				System.out.println("");
			}
		}
		
		System.out.println("Esta es la suma de todas las tablas:");
		
		for(int i=0; i<numero[0]; i++) {
			for(int j=0; j<numero[1]; j++) {
				for(int n=0; n<numero[1]; n++) {
					tabla[suma][j][n]=tabla[suma][j][n]+tabla[i][j][n];
					System.out.printf("%d\t",tabla[suma][j][n]);
				}
				System.out.println();
			}
		}
		
		sc.close();
		
	}

}

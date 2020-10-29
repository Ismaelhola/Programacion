/**
 * 
 */
package UT3;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Usuario
 *
 */
public class prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			int cant,numAux,i,j;
			System.out.print("Ingrese la cantidad de números: ");
			cant = scan.nextInt();
			int[] numeros = new int[cant + 1];
			for(i = 1; i <= cant; i++)
			{
			 System.out.print("Ingrese el numero (" + i + ") : ");
			 numeros[i] = scan.nextInt();
			}
			for(i = 1; i <= cant; i++)
			{
			for(j = i; j <= cant; j++)
			{
			if(numeros[i] < numeros[j])
			{
			numAux = numeros[i];
			numeros[i] = numeros[j];
			numeros[j] = numAux;
			}
			}
			}
			System.out.println("\nLos números de mayor a menor son:");
			for(i = 1; i <= cant; i++)
			{
			System.out.println(numeros[i]);
			}
			}
	}



/**
 * 
 */
package UT3;

/**
 * @author Usuario
 *
 */
public class ejercicio35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=1;
		int contador;
		
		do {
			contador=1;
			System.out.printf("La tabla del %d\n\n",numero);
			
			do {
				System.out.printf("%d*%d=%d\n",numero,contador,numero*contador);
				contador=contador+1;
			}while(contador!=11);
			
			System.out.println();
			numero=numero+1;
		}while(numero!=11);

	}

}

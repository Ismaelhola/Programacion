/**
 * 
 */
package UT3;

/**
 * @author Ismael m
 *
 */
public class ejercicio67 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1[]=new int[10];
		int numero2[]=new int[10];
		int contador=0;
		
		for(int i=0; i<numero1.length; i++) {
			numero1[i]=(int) (Math.random()*49)+1;
		}
		
		for(int i=0; i<numero1.length; i++) {
			numero2[i]=(int) (Math.random()*49)+1;
		}
		
		for(int i=0; i<numero1.length; i++) {
			for(int j=0; j<numero2.length; j++) {
				if(numero1[i] == numero2[j]) {
					System.out.printf("%d se repite\n",numero1[i]);
				}else {
					contador=contador+1;
				}
			}
		}
		
		if(contador==100) {
			System.out.println("no se repite ningun numero");
		}
	}

}

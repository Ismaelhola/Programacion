/**
 * 
 */
package UT3;

/**
 * @author Ismael m
 *
 */
public class ejercicio70 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero[][];
		
		numero=new int[10][10];
		
		for(int i=0; i<10; i++) {
			numero[0][i]=i+1;
			numero[i][0]=numero[0][i];
		}
		
		for(int i=0; i<10; i++) {
			System.out.printf("%d\t",numero[i][0]);
			for(int j=1; j<10; j++) {
				System.out.printf("%d\t",numero[0][j]*(i+1));
			}
			System.out.println("");
		}
	}

}

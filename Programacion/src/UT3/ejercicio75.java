/**
 * 
 */
package UT3;

/**
 * @author Ismael m
 *
 */
public class ejercicio75 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tabla[][]= new int[10][10];
		int cero=0;
		int uno=0;
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				tabla[i][j]=(int) (Math.random()*2);
			}
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.printf("%d ",tabla[i][j]); 
			}
			System.out.println("");
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(tabla[i][j]==0) {
					cero++;
				}else {
					uno++;
				}
			}
		}
		
		System.out.printf("%d son ceros\n",cero);
		System.out.printf("%d son unos\n",uno);

	}
}

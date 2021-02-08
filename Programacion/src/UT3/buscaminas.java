/**
 * 
 */
package UT3;

/**
 * @author Ismael m
 *
 */
public class buscaminas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] campo= new int[11][11];
		
		for(int i=0; i<campo.length; i++) {
			for(int j=0; j<campo.length; j++) {
				if(i!=0 || j!=0) {
					campo[i][j]=j;
				}
			}
		}
		
		for(int i=1; i< (campo.length-1); i++) {
			for(int j=1; j< (campo.length-1); j++) {
				campo[i][j]=(int) (Math.random()*2);
			}
		}

	}

}

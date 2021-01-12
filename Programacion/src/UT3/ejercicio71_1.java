/**
 * 
 */
package UT3;

/**
 * @author Usuario
 *
 */
public class ejercicio71_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] tabla1=new int [3][3];
		int[][] tabla2=new int [3][3];
		int[][] tabla3=new int [3][3];
		
		System.out.println("primera tabla:");
		rellena(tabla1);
		pinta(tabla1);
		System.out.println("Segunda tabla:");
		rellena(tabla2);
		pinta(tabla2);
		System.out.println("tercera tabla:");
		
		
		for(int i=0; i<tabla3.length; i++) {
			for(int j=0; j<tabla3.length; j++) {
				tabla3[i][j]=tabla1[i][j]*tabla2[i][j];
			}
		}
		
		pinta(tabla3);
		
	}
	
	private static void rellena(int[][] tabla) {
		for(int i=0; i<tabla.length; i++){
			for(int j=0; j<tabla[i].length; j++) {
				tabla[i][j]= (int) (Math.random()*10);
			}
		}
	}
	
	private static void pinta(int tabla[][]) {
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++) {
				System.out.printf("%d\t",tabla[i][j]);
			}
			System.out.println("");
		}
	}
}

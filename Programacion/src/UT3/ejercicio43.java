/**
 * 
 */
package UT3;

/**
 * @author Ismael m
 *
 */
public class ejercicio43 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dos=2;
		int tres=3;
		int cinco=5;
		int siete=7;
		int once=11;
		int contador=0;
		
		do {
			contador=contador+1;
			
			if(contador==dos || contador==tres || contador==cinco || contador==siete || contador==once) {
				System.out.printf("Productos del numero primo %d\n\n",contador);
				System.out.printf("%d*%d=%d\n",contador,dos,contador*dos);
				System.out.printf("%d*%d=%d\n",contador,tres,contador*tres);
				System.out.printf("%d*%d=%d\n",contador,cinco,contador*cinco);
				System.out.printf("%d*%d=%d\n",contador,siete,contador*siete);
				System.out.printf("%d*%d=%d\n\n",contador,once,contador*once);
			}
			
		}while(contador!=once);

	}

}

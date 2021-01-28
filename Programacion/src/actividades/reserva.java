/**
 * 
 */
package actividades;

/**
 * @author Ismael m
 *
 */
public class reserva {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taquilla[] taquillas= new Taquilla[10];
		
		for(int i=0; i<taquillas.length; i++) {
			taquillas[i]= new Taquilla(i+1, "sin codigo", false);
		}
		
		for(int i=0; i<taquillas.length; i++) {
			System.out.println(taquillas[i].toString());
		}

	}

}

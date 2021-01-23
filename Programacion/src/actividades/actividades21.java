/**
 * 
 */
package actividades;

import java.util.ArrayList;

/**
 * @author Usuario
 *
 */
public class actividades21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		contador c1= new contador();
		contador c2= new contador(5);
		
		System.out.println("Valor del contador 1: " + c1.getcont());
		System.out.println("Valor del contador 2: " + c2.getcont());
		
		c2.incrementar();
		System.out.println("Valor del contador 2 tras incrementar: " + c2.getcont());
		c2.decrementar();
		System.out.println("Valor del contador 2 tras decrementar: " + c2.getcont());
		
		contador c3= new contador(-5);
		
		c3.incrementar();
		System.out.println("Valor del contador 3 tras incrementar: " + c3.getcont());
		
		ArrayList<contador> contadores= new ArrayList<contador>();
		contadores.add(c1);
		contadores.add(c2);
		contadores.add(c3);
		
		for (int i=0; i<contadores.size();i++){
		contadores.get(i).decrementar();
		System.out.println("Valor del contador " + (i+1) + " - " +contadores.get(i).getcont());

		}

	}
}

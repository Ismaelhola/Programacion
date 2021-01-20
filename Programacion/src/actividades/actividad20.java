/**
 * 
 */
package actividades;

/**
 * @author Usuario
 *
 */
public class actividad20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona yo = new Persona();
		
		yo.Setnombre("ismael hola");
		System.out.println(yo.Getnombre());
		
		yo.Setapellidos("Monico Sienes");
		System.out.println(yo.Getapellidos());
		
		yo.Setanionacimiento(2001);
		yo.Setmesnacimiento(5);
		yo.Setdianacimiento(10);
		System.out.println(yo.Getanionacimiento()+"/"+yo.Getmesnacimiento()+"/"+yo.Getdianacimiento());
		
		yo.Setsexo('H');
		System.out.println(yo.Getsexo());
		
		System.out.println(yo.saludar());
		System.out.println(yo.mostraredad());
		
	}

}

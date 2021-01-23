/**
 * 
 */
package actividades;

/**
 * @author Usuario
 *
 */
public class contador {
	
	//declaro la variable privada

	private int cont=0;
	
	//funcion vacia por defecto
	public contador() {
		
	}
	
	//funcion para sustituir la variable
	public contador(int contador) {
		setcont(contador);
	}
	
	//funcion para sustituir la variable usando la clase
	public contador(contador c1) {
		setcont(c1.getcont());
	}
	
	//crear el get
	public int getcont() {
		return this.cont;
	}
	
	//crear el set
	public void setcont(int contador) {
		if(contador<0) {
			contador=0;
		}
		this.cont=contador;
	}
	
	//funcinos que incrementa y decrementa la variable
	public void incrementar() {
		cont++;
	}
	public void decrementar() {
		cont--;
		if(cont<0) {
			cont=0;
		}
	}
	
}

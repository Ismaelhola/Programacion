/**
 * 
 */
package UT3;

/**
 * @author Usuario
 *
 */
public class cilindro {
	float r;
	float a;
	
	public cilindro() {
		
	}
	
	public cilindro(float radio,float altura) {
		this.r=radio;
		this.a=altura;
	}
	
	public float area(float radio,float altura) {
		float area=(float) ((2*3.14*radio*altura)+(2*3.14));
		return area;
	}
	
	public float volumen(float radio, float altura) {
		float volumen=(float) (3.14*(radio*radio)*altura);
		return volumen;
	}

}

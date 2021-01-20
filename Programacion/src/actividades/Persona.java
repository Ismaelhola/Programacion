/**
 * 
 */
package actividades;

/**
 * @author Usuario
 *
 */
public class Persona {
	
	private String nombre;
	private String apellidos;
	private int anioNacimiento;
	private int mesNacimiento;
	private int diaNacimiento;
	private char sexo;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellidos, int ano, int mes, int dia, char sexo) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.anioNacimiento=ano;
		this.mesNacimiento=mes;
		this.diaNacimiento=dia;
		this.sexo=sexo;
	}
	
	public String Getnombre() {
		return this.nombre;
	}
	public String Getapellidos() {
		return this.apellidos;
	}
	public int Getanionacimiento() {
		return this.anioNacimiento;
	}
	public int Getmesnacimiento() {
		return this.mesNacimiento;
	}
	public int Getdianacimiento() {
		return this.diaNacimiento;
	}
	public char Getsexo() {
		return this.sexo;
	}
	public int Getedad() {
		int edad = java.time.LocalDate.now().getYear() - this.anioNacimiento;
		return edad;
	}
	
	public void Setnombre(String nombre) {
		
		nombre=convertir(nombre);
		
		if(nombre.length()<4) {
			nombre="Sin especificar";
		}
		
		this.nombre=nombre;
	}
	public void Setapellidos(String apellidos) {
		
		apellidos=convertir(apellidos);
		
		if(apellidos.length()<4) {
			apellidos="Sin especificar";
		}
		
		this.apellidos=apellidos;
	}
	public void Setanionacimiento(int ano) {
		if(ano<1900||ano>2020) {
			ano=2000;
		}
		this.anioNacimiento=ano;
	}
	public void Setmesnacimiento(int mes) {
		if(mes<1||mes>12) {
			mes=1;
		}
		this.mesNacimiento=mes;
	}
	public void Setdianacimiento(int dia) {
		if(dia<1||dia>31) {
			dia=1;
		}
		this.diaNacimiento=dia;
	}
	public void Setsexo(char sexo) {
		if(sexo!='H') {
			if(sexo!='M') {
				sexo='X';
			}
		}
		this.sexo=sexo;
	}
	
	public String saludar() {
		return "hola soy "+nombre+" "+apellidos+" y naci el "+diaNacimiento+"/"+mesNacimiento+"/"+anioNacimiento;
	}
	public String mostraredad() {
		return "En la actualidad tengo "+Getedad();
	}
	
	private String mayuscula(String palabra) {
		String npalabra = palabra.toLowerCase();
		String letra = palabra.substring(0,1).toUpperCase();
		npalabra=letra+npalabra.substring(1);
		return npalabra;
	}
	private String convertir(String palabra) {
		
		String[] array = palabra.split(" ");
		
		for(int i=0; i<array.length; i++) {
			array[i]=mayuscula(array[i]);
		}
		
		String palabrac="";
		
		for(int i=0; i<array.length; i++) {
			palabrac=palabrac+array+" ";
		}
		return palabrac;
	}

}

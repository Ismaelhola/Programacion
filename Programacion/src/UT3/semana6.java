/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class semana6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String frase1;
		String frase2;
		int salida = 0;
		char[] charf1;
		char[] charf2;
		int contador1[];
		int contador2[];
		int contador3=0;
		int contador4=0;
		int contador5=0;
		int contador6=0;
		
		
		do {
		System.out.println("Escribe la primera frase:");
		frase1=sc.nextLine().replace(" ","");
		
			if(frase1.length()>1000){
				System.out.println("Esta frase es muy grande escribe otra");
			}else {
				salida=1;
			}
			
		}while(salida!=1);
		
		salida=0;
		
		do {
			System.out.println("Escribe la Segunda frase:");
			frase2=sc.nextLine().replace(" ","");
			
				if(frase2.length()>1000){
					System.out.println("Esta frase es muy grande escribe otra");
				}else {
					salida=1;
				}
				
		}while(salida!=1);
		
		charf1=frase1.toCharArray();
		numeroletras(charf1,contador5);
		
		charf2=frase2.toCharArray();
		numeroletras(charf2,contador6);
		
		if(contador5==contador6) {
			
			contador1= new int [charf1.length];
			repeticiones(charf1,contador1);
			
			contador2= new int [charf2.length];
			repeticiones(charf2,contador2);
			
			eliminacionrepetidos(charf1, contador1);
			
			eliminacionrepetidos(charf2, contador2);
			
			for(int i=0; i<charf2.length; i++) {
				for(int j=0; j<charf2.length; j++) {
					if(contador1[i]!=0) {
						if(charf1[i]==charf2[j]&&contador1[i]==contador2[j]) {
							contador3++;
						}
					}
				}
			}
			
			for(int i=0; i<charf1.length; i++) {
				if(contador1[i]!=0) {
					contador4++;
				}
			}
			
			if(contador3==contador4) {
				System.out.println("hola");
			}else {
				System.out.println("adios");
			}
		}else {
			System.out.println("adios");
		}
		
		sc.close();

	}
	private static void numeroletras(char[] charf, int contador) {
		for(int i=0; i<charf.length; i++) {
			contador++;
		}
	}
	private static void repeticiones(char[] charf, int[] contador) {
		for(int i=0; i<charf.length;i++){
			for(int j=0; j<charf.length; j++) {
				if(charf[j]==charf[i]) {
					contador[i]++;
				}
			}
		}
	}
	private static void eliminacionrepetidos(char[] charf, int[] contador) {
		for(int i=0; i<charf.length; i++) {
			for(int j=0; j<charf.length; j++) {
				if(i!=j) {
					if(charf[i]==charf[j]) {
						for(int y=j; y<charf.length; y++) {
							if(y!=(charf.length-1)) {
								charf[y]=charf[y+1];
								contador[y]=contador[y+1];
							}else {
								charf[y]=0;
								contador[y]=0;
							}
						}
					}
				}
			}
		}
	}
}

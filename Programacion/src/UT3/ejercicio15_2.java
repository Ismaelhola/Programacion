/**
 * 
 */
package UT3;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class ejercicio15_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia;
		int mes;
		int año;
		int salida;
		
		do{
			System.out.println("Escribe el dia:");
			Scanner scd=new Scanner(System.in);
			dia=scd.nextInt();
			System.out.println("Escribe el mes:");
			Scanner scm=new Scanner(System.in);
			mes=scm.nextInt();
			System.out.println("Escribe el año:");
			Scanner sca=new Scanner(System.in);
			año=sca.nextInt();
			
			//años
			if(año>=1000 && año<=3000){
				// bisiesto
				if(año%4==0) {
					//mes
					if(mes>0 && mes<13) {
						//febrero
						if(mes==2) {
							//dia29
							if(dia>0 && dia<30) {
								System.out.printf("%d/%d/%d\n",año,mes,dia);
							}else {
								System.out.println("datos no correctos");
							}
						}else {
							//mes con 31 dias
							if(mes==1 && mes==3 && mes==5 && mes==7 && mes==8 && mes==10 && mes==12) {
								//dia31
								if(dia>0 && dia<32) {
									System.out.printf("%d/%d/%d /n",año,mes,dia);
								}else {
									System.out.println("datos no correctos");
								}
							}else {
								//dia30
								if(dia>0 && dia<31) {
									System.out.printf("%d/%d/%d /n",año,mes,dia);
								}else {
									System.out.println("datos no correctos");
								}
							}
						}
					}else {
						System.out.println("datos no correctos");
					}
				}else {
					if(mes>0 && mes<13) {
						//febrero
						if(mes==2) {
							//dia28
							if(dia>0 && dia<29) {
								System.out.printf("%d/%d/%d /n",año,mes,dia);
							}else {
								System.out.println("datos no correctos");
							}
						}else {
							//mes con 31 dias
							if(mes==1 && mes==3 && mes==5 && mes==7 && mes==8 && mes==10 && mes==12) {
								//dia31
								if(dia>0 && dia<32) {
									System.out.printf("%d/%d/%d /n",año,mes,dia);
								}else {
									System.out.println("datos no correctos");
								}
							}else {
								//dia30
								if(dia>0 && dia<31) {
									System.out.printf("%d/%d/%d /n",año,mes,dia);
								}else {
									System.out.println("datos no correctos");
								}
							}
						}
					}else {
						System.out.println("datos no correctos");
					}
				}
			}else {
				System.out.println("datos no correctos");
			}
			System.out.println("¿Quiere salir?");
			System.out.println("0.si 1.no");
			System.out.println("Escribe la opcion que quieres realizar:");
			Scanner scs=new Scanner(System.in);
			salida=scs.nextInt();
		}while(salida!=0);

	}

}

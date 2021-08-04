
package com.mycompany.clase4segundo;
import java.util.Scanner;

public class arreglodos {
  
	public static void main(String args[])  {
		Scanner entrada = new Scanner(System.in);
		int dato[];
		int dato1[];
		int dato2[];
		int i;
		String respuesta;
		int sumav = 0;
		int vec1mayor;
		int vec1menor;
		int vecmayor = 0;
		int vecmenor = 0;
		dato = new int[10];
		dato1 = new int[20];
		dato2 = new int[30];
		respuesta = "S";
		while (respuesta.equals("S") || respuesta.equals("s")) {
			vecmayor = 0;
			vecmenor = 51;
			vec1mayor = 0;
			vec1menor = 101;
			sumav = 0;
			System.out.println(" Empieza primer Vector ");
			for (i=0;i<=9;i++) {
				dato[i] = (int) Math.floor(Math.random()*50);
				if (dato[i]>vecmayor) {
					vecmayor = dato[i];
				} else {
				}
				if (dato[i]<vecmenor) {
					vecmenor = dato[i];
				}
				System.out.println(i+1+") Corresponde a "+dato[i]);
			}
			System.out.println(" Digite que numero desea Cambiar ");
			i =entrada.nextInt();
			dato[i-1] = entrada.nextInt();
			for (i=0;i<=9;i++) {
				sumav = sumav+dato[i];
				System.out.println(i+1+") Corresponde a "+dato[i]);
			}
			System.out.println(" Empieza segundo vector ");
			for (i=0;i<=19;i++) {
				dato1[i] = (int) Math.floor(Math.random()*100);
				System.out.println(i+1+") Corresponde a "+dato1[i]);
			}
			System.out.println(" Empieza tercer vector ");
			for (i=0;i<=29;i++) {
				dato2[i] = (int) Math.floor(Math.random()*200);
				System.out.println(i+1+") Corresponde a "+dato2[i]);
			}
			System.out.println(" Desea continuar s/n");
			respuesta =entrada.next();
		}
		System.out.println(" El dato mayor para el primer vector es "+vecmayor);
		System.out.println(" El dato menor para el primer vector es "+vecmenor);
		System.out.println(" La suma del primer vector es "+sumav);
	}
  
}

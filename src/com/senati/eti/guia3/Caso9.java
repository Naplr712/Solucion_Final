package com.senati.eti.guia3;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String nombre= "", rpta= "s", estado = "", t = "", n = "";
		
		int  num_nc=0, num_cer=0, num_ap=0;
		int not1=0,not2=0,not3=0;
		float num_mayor=0;
		float num_menor=100;
		float as=0;
		float asis=0;
		float promedio=0;
		
		
		while (rpta.equals("s") || rpta.equals("s")) {
			num_cer++;
			System.out.println("--------------");
			System.out.println("REGISTRO " + num_cer + ":");
			System.out.println("--------------");
			
			
			System.out.print("Nombre de alumno...: ");
			nombre = x.nextLine();
			System.out.print("Nota1......: ");
			not1 = x.nextInt();
			System.out.print("Nota2......: ");
			not2 = x.nextInt();
			System.out.print("Nota3......: ");
			not3 = x.nextInt();
			System.out.print("Asistencia......[1-12]: ");
			as = x.nextFloat();
			promedio = not1 *0.2f + not2 * 0.3f + not3*0.5f;
			asis = as / 12 *100;
			if (promedio>=13 && asis >=70) {
				estado = "obtiene certificado";
				num_ap++;
			
			}
			
			else {
				estado = "Sin certificado";
				num_nc++;
			}
			
			if (promedio > num_mayor) {
				num_mayor=promedio;
				t = promedio + " pertenece a "+ nombre;;
	
			}
				
			if (promedio < num_menor) {
				num_menor=promedio;
				n = +promedio + " pertenece a "+nombre; 
			}
			System.out.println("---------------------");
			System.out.println("------RESULTADOS-----");
			System.out.println("Promedio :" + promedio);
			System.out.println("Asistencia :" + asis+" %");
			System.out.println("Estado.....: "+ estado);
			System.out.println("----------------------");
			x.nextLine();
			
			System.out.print("¿Desea registrar otro Alumno? <S/N> :");
			rpta = x.nextLine();
		}
	
		System.out.println("--------------");
		System.out.println(" R E S U M E N");
		System.out.println("-------------");
		System.out.println("Números de alumnos: "+num_cer);
		System.out.println("Mayor promedio: " +t);
		System.out.println("Menor promedio:" +n);
		
		System.out.println("Número de alumnos  certificado.........: " + num_ap);
		System.out.println("Número de alumnos sin certificado......: " + num_nc);
	}

}

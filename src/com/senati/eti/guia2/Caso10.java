package com.senati.eti.guia2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("Ingrese nombre:  ");
		String nombre = sc.nextLine();
		System.out.print("Horas trabajadas: ");
		float hora = sc.nextFloat();
		System.out.print("Tarifa por hora: ");
		float tarifa = sc.nextFloat();
		System.out.print("Minutos de tardanza: ");
		float minuto = sc.nextFloat();
	

		
		System.out.println("           RESULTADOS");
		System.out.println("-----------------------------------");
		System.out.println("Trabajador ......................" + nombre);
		System.out.println("Horas trabajadas ................" + hora);
		System.out.println("Tarifa por horas ................" + tarifa);
		System.out.println("Importe ........................." + tarifa*hora);
		System.out.println("Bono ............................" + df.format((hora>60)?tarifa*hora*0.13:tarifa*hora*0.04));
		System.out.println("Descuento ......................." + df.format((minuto>15)?tarifa*hora*0.03:0));
		System.out.println("Meta alcanzada .................." + df.format((hora/70)*100)+ "%");
		sc.close();
	}

}

package com.senati.eti.guia2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("Ingrese sueldo:   ");
		int sueldo = sc.nextInt();
		System.out.println("        RESULTADOS");
		System.out.println("-----------------------------");
		System.out.println("Impuesto calculado..........." + df.format((sueldo>2800)?sueldo*0.05:sueldo*0.02));
		sc.close();
	}

}

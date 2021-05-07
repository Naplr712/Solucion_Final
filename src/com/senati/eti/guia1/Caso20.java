package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float num1= 0;
		
		System.out.print("Primera venta....: ");
		num1= sc.nextFloat();
		
		float aumento = (float)(num1 * 0.42);
		float n1= aumento + num1;
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Resultado1..............: " + n1);
		
	}

}

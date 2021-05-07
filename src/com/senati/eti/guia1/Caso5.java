package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			
		float num1= 0, num2= 0;
			
		System.out.print("Primer número....: ");
		num1= sc.nextFloat();
			
		System.out.print("Segundo número...: ");
		num2= sc.nextFloat();
			
		float promedio = (float) num1 + num2;
		float r1= promedio / 2;
		float aumento = (float)(num1 * 0.2);
		float n1= aumento + num1;
		float disminuye = (float)(num2 * 0.3);
		float n2= num2 - disminuye ;
			
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Resultado1..............: " + r1);
		System.out.println("Resultado2..............: " + n1);
		System.out.println("Resultado3..............: " + n2);
	}

}

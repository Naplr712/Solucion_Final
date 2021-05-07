package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
		float num1= 0;
		
		System.out.print("Primer número....: ");
		num1= sc.nextFloat();
		
		float disminuye = (float)(num1 * 0.12);
		float n1= num1 - disminuye ;
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Resultado1..............: " + n1);

	}

}

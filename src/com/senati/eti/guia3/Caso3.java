package com.senati.eti.guia3;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		System.out.print("Ingrese número: ");
		int n = y.nextInt();
		if (n>7) {
			  System.out.println("El numero es superior de 7");
			  
		return;
		}
		System.out.println("El factorial de "+n+" es: " +Factoria(n));
		
	}
	public static int Factoria(int n) {
		int factor = 1;
		for(int i = 1; i <=n; i++) {
			factor = factor *i;
		  
		}
		return factor;
		
	}

}

package com.senati.eti.guia3;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		int x = 1, n=0, num_menor = 0,  i =0;
		while (x<= 5) {
			
			System.out.print("Ingrese numero " + x + ": ");
			n = y.nextInt();
			
	
			if (i == 0)
				num_menor= n;
	
			else
				if (n <num_menor)
					num_menor = n;

			x++;
			i++;
		}
		System.out.println("\nResultado");
		System.out.println(".............. ");
		System.out.println("El numero menor es : "+ num_menor);
		
	}

}

package com.senati.eti.guia4;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Definir la matriz de numeros 3x4
		int[][] mNumeros = new int[3][4];
		
		int num_mayor = 0;
		int num_menor = 0;
		int suma = 0;
		int promedio = 0;
		
		System.out.println("LECTURA DE NUMEROS");
		System.out.println("------------------");
		
		for (int f = 0; f < mNumeros.length; f++) {
			System.out.println("\nFila " + (f + 1) + ": ");
			System.out.println("-------");
			
			for (int c = 0; c < mNumeros[0].length; c++) {
				System.out.print("Numero " + (c + 1) + ": ");
				mNumeros[f][c] = sc.nextInt();
				
				if (f == 0 && c == 0) {
					num_mayor = mNumeros[0][0];
				} else {
					if (mNumeros[f][c] > num_mayor) num_mayor = mNumeros[f][c];
				}
				if (f == 0 && c == 0) {
					num_menor =mNumeros[0][0];
				} else  {
					if (mNumeros [f][c] < num_menor) num_menor = mNumeros[f][c];
				}
				
				suma += mNumeros[f][c];
				promedio += mNumeros[f][c]; 
			}	
	    }
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Numero mayor.........: " + num_mayor);
		System.out.println("Numero menor.........: " + num_menor);
		System.out.println("Sumatoria............: " + suma);
		System.out.println("Promedio.............: " + (promedio/12.0));
	}

}

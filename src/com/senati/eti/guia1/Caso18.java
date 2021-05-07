package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.print("Ingrese la base del triangulo: ");
		base= sc.nextInt();
		
		System.out.print("Ingrese la altura del triangulo: ");
		altura= sc.nextInt();
		
		area= (int)(base*altura)/2;
		
		System.out.println("El area del triangulo es: " + area);

	}

}

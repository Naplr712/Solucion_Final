package com.senati.eti.guia1;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		  int radio;
		  double perimetro, area;
		  double pi = 3.1416;
		  
		  System.out.print("Ingrese el radio del circulo a calcular: ");
		  radio = entrada.nextInt();
		  
		  perimetro = 2*pi*radio;
		  area = pi*radio*radio;
		  
		  System.out.println("El area es: " + area + ".");
		  System.out.println("El perimetro es: " + perimetro + ".");

	}

}

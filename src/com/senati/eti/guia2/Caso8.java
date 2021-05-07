package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Ingrese nota:  ");
		int nota = sc.nextInt();
		System.out.println("           RESULTADOS");
		System.out.println("-----------------------------------");
		if(nota>=0 && nota<=20){
			if(nota>=18){
				System.out.println("Excelente");
			}else if(nota>=15){
				System.out.println("Notable");
			}else if(nota>=11){
				System.out.println("Regular");
		    }else if(nota>=8){
		    	System.out.println("Malo");
		    }else{
		    	System.out.println("Sin Palabras");
		    }
		}
		sc.close();
	}

}

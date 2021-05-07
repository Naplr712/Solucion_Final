package com.senati.eti.guia2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("Ingrese primer n�mero:  ");
		float primero = sc.nextFloat();
		System.out.print("Ingrese segundo n�mero: ");
		float segundo = sc.nextFloat();
		System.out.print("Eliga la operaci�n [1-6] ");
		int operacion = sc.nextInt();
		
		System.out.println("           RESULTADOS");
		System.out.println("-----------------------------------");
		System.out.println("Primer n�mero ................." + primero);
		System.out.println("Segundo n�mero ................" + segundo);
	
	    
	   if(operacion==4){
	    	if(segundo==0){
	    		System.out.println("Operaci�n ...................No se puede resolver la divisi�n");
	            System.out.println("Resultado ..................." + 0.0);
	    	}else {
	    	    	System.out.println("Operaci�n ...................Division");
	                System.out.println("Resultado ..................." + df.format((primero)/(segundo)));
	   }}else if(operacion==5){
	    	if(segundo==0){
	    		System.out.println("Operaci�n ...................No es posible hallar el resto entero");
	            System.out.println("Resultado ..................." + 0.0);
	    	}else {
	    	    	System.out.println("Operaci�n ...................Resto Entero");
	                System.out.println("Resultado ..................." + ((primero)%(segundo)));
	   }}else if(operacion==2){
	    	System.out.println("Operaci�n ...................Resta");
            System.out.println("Resultado ..................." + ((primero)-(segundo)));
	    }else if(operacion==3) {
	    	System.out.println("Operaci�n ...................Producto");
            System.out.println("Resultado ..................." + ((primero)*(segundo)));
	    }else if(operacion==1){
	    	System.out.println("Operaci�n ...................Suma");
	        System.out.println("Resultado ..................." + ((primero)+(segundo)));
	    }else if(operacion==6){
        	System.out.println("Operaci�n ...................Promedio");
            System.out.println("Resultado ..................." + df.format(((primero)+(segundo))/2));
        }else{
        	System.out.println("Operaci�n ...................No ha seleccionado una operaci�n");
        	System.out.println("Resultado ..................." + 0.0);
        }
		sc.close();
	}

}

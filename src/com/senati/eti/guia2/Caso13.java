package com.senati.eti.guia2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("Ingrese primer número:  ");
		float primero = sc.nextFloat();
		System.out.print("Ingrese segundo número: ");
		float segundo = sc.nextFloat();
		System.out.print("Eliga la operación [1-6] ");
		int operacion = sc.nextInt();
		
		System.out.println("           RESULTADOS");
		System.out.println("-----------------------------------");
		System.out.println("Primer número ................." + primero);
		System.out.println("Segundo número ................" + segundo);
	
	    
	   if(operacion==4){
	    	if(segundo==0){
	    		System.out.println("Operación ...................No se puede resolver la división");
	            System.out.println("Resultado ..................." + 0.0);
	    	}else {
	    	    	System.out.println("Operación ...................Division");
	                System.out.println("Resultado ..................." + df.format((primero)/(segundo)));
	   }}else if(operacion==5){
	    	if(segundo==0){
	    		System.out.println("Operación ...................No es posible hallar el resto entero");
	            System.out.println("Resultado ..................." + 0.0);
	    	}else {
	    	    	System.out.println("Operación ...................Resto Entero");
	                System.out.println("Resultado ..................." + ((primero)%(segundo)));
	   }}else if(operacion==2){
	    	System.out.println("Operación ...................Resta");
            System.out.println("Resultado ..................." + ((primero)-(segundo)));
	    }else if(operacion==3) {
	    	System.out.println("Operación ...................Producto");
            System.out.println("Resultado ..................." + ((primero)*(segundo)));
	    }else if(operacion==1){
	    	System.out.println("Operación ...................Suma");
	        System.out.println("Resultado ..................." + ((primero)+(segundo)));
	    }else if(operacion==6){
        	System.out.println("Operación ...................Promedio");
            System.out.println("Resultado ..................." + df.format(((primero)+(segundo))/2));
        }else{
        	System.out.println("Operación ...................No ha seleccionado una operación");
        	System.out.println("Resultado ..................." + 0.0);
        }
		sc.close();
	}

}

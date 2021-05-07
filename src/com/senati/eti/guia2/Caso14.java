package com.senati.eti.guia2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.print("Ingrese nombre:  ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese profesión (DS,RC,DG) ");
		String profesion = sc.nextLine();
		System.out.print("Ingrese turno (M,T,N) ");
		String turno = sc.nextLine();
	
		switch(profesion) {
		
		case "DS":
			System.out.println("           RESULTADOS");
			System.out.println("-------------------------------");
			System.out.println("Estudiante ................." + nombre);
			System.out.println("Profesion: .................Desarrollo de Software");
			System.out.println("Precio ....................." + 1500);
			switch(turno){
			case "M":
				System.out.println("Turno .....................Mañana");
	            System.out.println("Descuento ................." + 1500*0.1);
	            System.out.println("Total a pagar.............." + ((1500)-(1500*0.1)));
	            System.out.println("Equivalente en dólares....." + "$/"+df.format(((1500)-(1500*0.1))/3.33f));
	            break;
			case "T":
	            System.out.println("Turno .....................Tarde");
				System.out.println("Descuento ................." + 1500*0.2);
				System.out.println("Total a pagar.............." + ((1500)-(1500*0.2)));
				System.out.println("Equivalente en dólares....." + "$/"+df.format(((1500)-(1500*0.2))/3.33f));
			    break;
			case "N":
			    System.out.println("Turno .....................Noche");
				System.out.println("Descuento ................." + 1500*0.15);
				System.out.println("Total a pagar.............." + ((1500)-(1500*0.15)));
				System.out.println("Equivalente en dólares....." + "$/"+df.format(((1500)-(1500*0.15))/3.33f));
			    break;
			default:
			    System.out.println("Turno .....................No escribio el turno");
				System.out.println("Descuento ................." + 0);
				System.out.println("Total a pagar.............." + ((1500)-(0)));
				System.out.println("Equivalente en dólares....." + "$/"+df.format(((1500)-(0))/3.33f));
			    break;
			}
		break;
		case "RC":
			System.out.println("          RESULTADOS");
			System.out.println("--------------------------------");
			System.out.println("Estudiante ................." + nombre);
			System.out.println("Profesion: .................Redes y Conectividad");
			System.out.println("Precio ....................." + 1400);
			switch(turno){
			case "M":
				System.out.println("Turno ......................Mañana");
	            System.out.println("Descuento .................." + 1400*0.1);
	            System.out.println("Total a pagar..............." + ((1400)-(1400*0.1)));
	            System.out.println("Equivalente en dólares......" + "$/"+df.format(((1400)-(1400*0.1))/3.33f));
	            break;
			case "T":
	            System.out.println("Turno ......................Tarde");
				System.out.println("Descuento .................." + 1400*0.2);
				System.out.println("Total a pagar..............." + ((1400)-(1400*0.2)));
				System.out.println("Equivalente en dólares......" + "$/"+df.format(((1400)-(1400*0.2))/3.33f));
			    break;
			case "N":
			    System.out.println("Turno ......................Noche");
				System.out.println("Descuento .................." + 1400*0.15);
				System.out.println("Total a pagar..............." + ((1400)-(1400*0.15)));
				System.out.println("Equivalente en dólares......" + "$/"+df.format(((1400)-(1400*0.15))/3.33f));
			    break;
			default:
			    System.out.println("Turno ......................No escribio el turno");
				System.out.println("Descuento .................." + 0);
				System.out.println("Total a pagar..............." + ((1400)-(0)));
				System.out.println("Equivalente en dólares......" + "$/"+df.format(((1400)-(0))/3.33f));
			    break;
			}
		break;
		case "DG":
			System.out.println("          RESULTADOS");
			System.out.println("--------------------------------");
			System.out.println("Estudiante ................." + nombre);
			System.out.println("Profesion: .................Diseño Gráfico");
			System.out.println("Precio ....................." + 1300);
			switch(turno){
			case "M":
				System.out.println("Turno ......................Mañana");
	            System.out.println("Descuento .................." + 1300*0.1);
	            System.out.println("Total a pagar..............." + ((1300)-(1300*0.1)));
	            System.out.println("Equivalente en dólares......" + "$/"+df.format(((1300)-(1300*0.1))/3.33f));
	            break;
			case "T":
	            System.out.println("Turno ......................Tarde");
				System.out.println("Descuento .................." + 1300*0.2);
				System.out.println("Total a pagar..............." + ((1300)-(1300*0.2)));
				System.out.println("Equivalente en dólares......" + "$/"+df.format(((1300)-(1300*0.2))/3.33f));
			    break;
			case "N":
			    System.out.println("Turno ......................Noche");
				System.out.println("Descuento .................." + 1300*0.15);
				System.out.println("Total a pagar..............." + ((1300)-(1300*0.15)));
				System.out.println("Equivalente en dólares......" + "$/"+df.format(((1300)-(1300*0.15))/3.33f));
			    break;
			default:
			    System.out.println("Turno ......................No escribio el turno");
				System.out.println("Descuento .................." + 0);
				System.out.println("Total a pagar..............." + ((1300)-(0)));
				System.out.println("Equivalente en dólares......" + "$/"+df.format(((1300)-(0))/3.33f));
			    break;
			}
		break;
		default:
			System.out.println("           RESULTADOS");
			System.out.println("-------------------------------");
			System.out.println("Estudiante ................." + nombre);
			System.out.println("Profesion: .................No ha seleccionado profesión");
			System.out.println("Precio ....................." + 0);
		
		}
		sc.close();
	}

}

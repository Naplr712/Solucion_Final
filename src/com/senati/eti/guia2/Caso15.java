package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre:  ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese producto (TB,LT,MN,IM) ");
		String producto = sc.nextLine();
		System.out.print("Ingrese cantidad..: ");
		int cantidad = sc.nextInt();
		sc.nextLine();
		System.out.print("Ingrese forma de pago (C1/C2) ");
		String pago = sc.nextLine();
	
		switch(producto) {
		
		case "TB":
			System.out.println("      RESULTADOS");
			System.out.println("--------------------");
			System.out.println("Cliente ............" + nombre);
			System.out.println("Producto: ..........Tablet");
			System.out.println("Precio.............." + 350);
			System.out.println("Cantidad ..........." + cantidad);
			System.out.println("Importe ............" + cantidad*350);
			switch(pago) {
			case "C1":
				System.out.println("Forma de pago es al Contado");
				System.out.println("Descuento..........." + cantidad*350*0.05);
				System.out.println("TOTAL..............." + ((cantidad*350)-(cantidad*350*0.05)));
				break;
			case "C2":
			    System.out.println("Forma de pago es al Crédito");
				System.out.println("Incremento.........." + cantidad*350*0.12);
				System.out.println("TOTAL..............." + ((cantidad*350)+(cantidad*350*0.12)));
				break;
		    }
		break;
		case "LT":
			System.out.println("      RESULTADOS");
			System.out.println("--------------------");
			System.out.println("Cliente ............" + nombre);
			System.out.println("Producto: ..........Laptod");
			System.out.println("Precio.............." + 2300);
			System.out.println("Cantidad ..........." + cantidad);
			System.out.println("Importe ............" + cantidad*2300);
			switch(pago) {
			case "C1":
				System.out.println("Forma de pago es al Contado");
				System.out.println("Descuento..........." + cantidad*2300*0.05);
				System.out.println("TOTAL..............." + ((cantidad*2300)-(cantidad*2300*0.05)));
				break;
			case "C2":
			    System.out.println("Forma de pago es al Crédito");
				System.out.println("Incremento.........." + cantidad*2300*0.12);
				System.out.println("TOTAL..............." + ((cantidad*2300)+(cantidad*2300*0.12)));
				break;
			}
		break;
		case "MN":
			System.out.println("      RESULTADOS");
			System.out.println("--------------------");
			System.out.println("Cliente ............" + nombre);
			System.out.println("Producto: ..........Monitor");
			System.out.println("Precio.............." + 850);
			System.out.println("Cantidad ..........." + cantidad);
			System.out.println("Importe ............" + cantidad*850);
			switch(pago) {
			case "C1":
		        System.out.println("Forma de pago es al Contado");
				System.out.println("Descuento..........." + cantidad*850*0.05);
				System.out.println("TOTAL..............." + ((cantidad*850)-(cantidad*850*0.05)));
				break;
			case "C2":
			    System.out.println("Forma de pago es al Crédito");
				System.out.println("Incremento.........." + cantidad*850*0.12);
				System.out.println("TOTAL..............." + ((cantidad*850)+(cantidad*850*0.12)));
				break;
			}
		break;
		case "IM":
			System.out.println("      RESULTADOS");
			System.out.println("--------------------");
			System.out.println("Cliente ............" + nombre);
			System.out.println("Producto: ..........Impresora");
			System.out.println("Precio.............." + 680);
			System.out.println("Cantidad ..........." + cantidad);
			System.out.println("Importe ............" + cantidad*680);
			switch(pago) {
			case "C1":
				System.out.println("Forma de pago es al Contado");
				System.out.println("Descuento..........." + cantidad*680*0.05);
				System.out.println("TOTAL..............." + ((cantidad*680)-(cantidad*680*0.05)));
				break;
			case "C2":
				System.out.println("Forma de pago es al Crédito");
				System.out.println("Incremento.........." + cantidad*680*0.12);
				System.out.println("TOTAL..............." + ((cantidad*680)+(cantidad*680*0.12)));
				break;
			}
		break;
		default:
			System.out.println("     RESULTADOS");
			System.out.println("--------------------");
			System.out.println("Cliente ............" + nombre);
			System.out.println("Producto: ..........No ha seleccionado producto");
			System.out.println("Precio.............." + 0);
		break;
		}
		sc.close();
	}

}

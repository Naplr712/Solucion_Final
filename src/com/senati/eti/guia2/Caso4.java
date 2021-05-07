package com.senati.eti.guia2;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primer numero:  ");
		int num1 = sc.nextInt();
		System.out.print("Segundo numero:  ");
		int num2 = sc.nextInt();
		System.out.print("Tercer numero:  ");
		int num3 = sc.nextInt();
		System.out.print("Cuarto numero:  ");
		int num4 = sc.nextInt();
		System.out.println("              RESULTADOS");
		System.out.println("-----------------------------------------");
		
	if (num1==num2 && num3==num4 && num3==num1){
	System.out.print("    Los numeros son iguales  ");
	}else if(num1>num2 && num1>num3 && num1>num4){
    System.out.print("    El primer numero es mayor ");
	}else if(num2>num1 && num2>num3 && num2>num4){
	System.out.print("    El segundo numero es mayor ");
	}else if(num3>num1 && num3>num2 && num3>num4){
	System.out.print("    El tercer numero es mayor ");
	}else {
		System.out.print("    El cuarto numero es mayor ");
	}if(num1<num2 && num1<num3 && num1<num4){
    System.out.print("    El primer numero es menor ");
    }else if(num2<num1 && num2<num3 && num2<num4){
    System.out.print("    El segundo numero es menor ");
    }else if(num3<num1 && num3<num2 && num3<num4){
    System.out.print("    El tercer numero es menor ");
    }else if(num4<num1 && num4<num2 && num4<num3){
    System.out.print("    El cuarto numero es menor ");
	}
	sc.close();
	}

}

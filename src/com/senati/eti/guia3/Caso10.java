package com.senati.eti.guia3;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String nombre= "", rpt= "s", sma = "", sme = "",  mt="";
		
		int   num_em=0,  cal=0;
		float num_mayor=0;
		float num_may=0;
		float bonifi = 0;
		float descuento= 0;
		float num_menor=10000000;
		
		
		
		while (rpt.equals("s") || rpt.equals("S")) {
			num_em++;
			System.out.println("--------------");
			System.out.println("Registro De Empleados " +"("+ num_em + ")");
			System.out.println("--------------");
			
			System.out.print("Empleado: ");
			nombre = x.nextLine();
			System.out.print("Horas Trabajadas: ");
			int hora = x.nextInt();
			System.out.print("Tarifa por hora: ");
			int tarifa = x.nextInt();
			System.out.print("Minutos de tardanza......: ");
			int tardanza = x.nextInt();
			int sueldo_b = hora *tarifa;
			if (hora<50) {
				bonifi= 0;
			}
				else {
			if (hora >50 && hora<=60)
				bonifi= sueldo_b *0.02f;
			
			if (hora >60 && hora <=70)
				bonifi= sueldo_b *0.08f;
			
			if (hora >70 && hora <=80)
				bonifi= sueldo_b *0.13f;
			
			if (hora >80)
				bonifi= sueldo_b *0.15f;
			}
			
			if (tardanza <15 ) {
				descuento = 0;
			}
			else {
			if (tardanza >15 && tardanza <=30)
				descuento = tardanza*0.3f*sueldo_b/100;
			if (tardanza >30)
				descuento = tardanza*0.5f*sueldo_b/100;
			}
			float sueldo_n= sueldo_b+bonifi-descuento;
			float alcanzado = (hora*1.25f);

			System.out.println("**************************");
			System.out.println("        Resultados       ");
			System.out.println("Sueldo bruto S/" + sueldo_b);
			System.out.println("Bonificacion S/" + bonifi);
			System.out.println("Descuento   S/"+ descuento);
			System.out.println("Sueldo neto S/"+ sueldo_n);
			System.out.println("% Alcanzado  :"+ alcanzado+"%");
			System.out.println("**************************");
			{
	
			x.nextLine();
			
			System.out.print("¿Nuevo empleado? [S/N] :");
			rpt = x.nextLine();
			}
			if (sueldo_n>num_mayor) {
				num_mayor = sueldo_n;
				
				sma = sueldo_n + " pertenece a:"+ nombre;
				
			}
				
			if (sueldo_n<num_menor) {
				num_menor = sueldo_n;
				sme = sueldo_n + " pertenece a:"+ nombre;
			
			}
			
			if(tardanza>num_may) {
				num_may = tardanza;
				mt = (nombre + " ("+ tardanza+".0 min.)");
			}
			if (alcanzado >90) {
				
			cal++;
			}
		
			}
		System.out.println("-------------------");
		System.out.println("---R E S U M E N---");
		System.out.println("-------------------");
		System.out.println("Números de Empleados: "+num_em);
		System.out.println("Sueldo neto mayor: S/"+sma);
		System.out.println("Sueldo neto menor: S/"+sme);
		System.out.println("Empleado con la mayor cantidad de minutos de tardanzas: "+mt);
		System.out.println("Cantidad de empleados con mas del 90% de la meta:"+cal);
	}

}

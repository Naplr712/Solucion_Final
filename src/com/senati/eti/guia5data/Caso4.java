package com.senati.eti.guia5data;

import java.util.ArrayList;
import java.util.Scanner;

import com.senati.eti.guia5model.Publicacion;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Publicacion objAl1 = new Publicacion();
		objAl1.setTitulo("Los Perros Hambrientos");
		objAl1.setAutor("Ciro Alegria");
		objAl1.setTipo("L");
		Publicacion objAl2 = new Publicacion("Tradiciones Peruanas", "Ricardo Palma", "L");
		Publicacion objAl3 = new Publicacion("Informatica Global", "Bill Gates", "R");
		Publicacion objAl4 = new Publicacion("Los Heraldos Negros", "Cesar Vallejo", "L");
		Publicacion objAl5 = new Publicacion("Rev. Dig. Merca2.0", "Mark Zuckerberg", "R");
		Publicacion objAl6 = null;
		String ti = "", aut = "", tip = "";
		System.out.println("REGISTRO DE PUBLICACIONES");
		System.out.println("-------------------------");
		System.out.print("Titulo........: ");
		ti = sc.nextLine();
		System.out.print("Autor.........: ");
		aut = sc.nextLine();
		System.out.print("Tipo[L][R]..........: ");
		tip = sc.nextLine();
		objAl6 = new Publicacion(ti, aut, tip);
		ArrayList<Publicacion> arrPublicacion = new ArrayList<Publicacion>();
		arrPublicacion.add(objAl1);
		arrPublicacion.add(objAl2);
		arrPublicacion.add(objAl3);
		arrPublicacion.add(objAl4);
		arrPublicacion.add(objAl5);
		arrPublicacion.add(objAl6);
		System.out.println("LISTA DE PUBLICACIONES");
		System.out.println("----------------------");
		String patron = "%-4s %-25s %-15s %-20s";
		System.out.println(String.format(patron, "N", "Titulo", "Autor", "Tipo"));
        System.out.println(String.format(patron, "--", "--------", "------", "-----"));
        for(int x = 0; x< arrPublicacion.size(); x++) {
        	System.out.println(String.format(patron, (x+1),
        			arrPublicacion.get(x).MostrarTitulo(),
        			arrPublicacion.get(x).MostrarAutor(),
        			arrPublicacion.get(x).MostrarTipo()));
        }
	}

}

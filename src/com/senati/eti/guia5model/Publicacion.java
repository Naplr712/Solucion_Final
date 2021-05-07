package com.senati.eti.guia5model;

public class Publicacion {
	private String titulo;
	private String autor;
	private String tipo;
	
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Publicacion() {
		
	}
	public Publicacion(String titulo, String autor, String tipo) {
		this.titulo = titulo;
		this.autor = autor;
		this.tipo = tipo;
	}
	public String MostrarTitulo() {
		return this.titulo;
	}
	public String MostrarAutor() {
		return this.autor;
	}
	public String MostrarTipo() {
		String g = "";
		
		if(this.tipo.equals("L"))
			g = "Libro";
		else if (this.tipo.equals("R"))
			g = "Revista";
		return g;
	}
		
}

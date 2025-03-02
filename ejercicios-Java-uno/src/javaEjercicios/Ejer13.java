package javaEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejer13 {

	private ArrayList<String> listaLibros = new ArrayList<>();

	private Scanner lectura;
	public Ejer13(Scanner lectura) {
		this.lectura = lectura;

	}
	public void registrarLibros(){
		boolean continuar = true;

		while (continuar){
			agregarLibro();

			System.out.println("Desea registrar otro libro (Si =1 \\ No = 0");
			int respuesta = lectura.nextInt();
			lectura.nextLine();
			continuar= (respuesta == 1);
		}
		mostrarLibros();
	}
	public void agregarLibro(){
		System.out.println("Ingrese el titulo del libro: ");
		String titulo = lectura.nextLine();
		System.out.println("Ingrese el autor del libro: ");
		String autor = lectura.nextLine();
		System.out.println("Ingrese el numero de paginas: ");
		int paginas = lectura.nextInt();
		lectura.nextLine();
		listaLibros.add("Titulo: " + titulo + " Autor: " + autor+" Paginas: "+paginas);
		System.out.println(" Libro registrado con éxito.");
	}
	public void mostrarLibros(){
		System.out.println("Lista de libros registrados ");
		if (listaLibros.isEmpty()){
			System.out.println("No se registraron libros");
		}else {
			for (String libro: listaLibros){
				System.out.println(libro);
			}
		}
	}


}


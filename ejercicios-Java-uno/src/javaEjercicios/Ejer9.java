package javaEjercicios;

import java.util.Scanner;

public class Ejer9 {
	private int puntos;

	private Scanner lectura;

	public Ejer9(Scanner lectura) {
		this.puntos = 0;
		this.lectura = lectura;
	}
	public void tomarResultados() {
		System.out.println(" Bienvenido al sistema de clasificación del campeonato ");
		String opcion;

		do {
			System.out.print("\nIngrese el resultado del partido (ganado, empatado, perdido) o 'salir' para terminar: ");
			opcion = lectura.nextLine();

			if (!opcion.equalsIgnoreCase("salir")) {
				registrarResultado(opcion);
			}

		} while (!opcion.equalsIgnoreCase("salir"));

		System.out.println(" Clasificación final:");
		mostrarClasificacion();
		System.out.println("Gracias por usar el sistema. ");

	}

	public void registrarResultado(String resultado) {
		switch (resultado.toLowerCase()) {
			case "ganado":
				puntos += 3;
				System.out.println("Partido ganado. Se suman 3 puntos.");
				break;
			case "empatado":
				puntos += 1;
				System.out.println("➖ Partido empatado. Se suma 1 punto.");
				break;
			case "perdido":
				System.out.println(" Partido perdido. No se suman puntos.");
				break;
			default:
				System.out.println(" Resultado no válido. Ingrese 'ganado', 'empatado' o 'perdido'.");
				return;
		}
		mostrarClasificacion();

	}

	private void mostrarClasificacion() {
		System.out.println(" Clasificación actual del equipo:");
		System.out.println("Puntos: " + puntos);
		System.out.println("----------------------");
	}


}

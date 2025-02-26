package javaEjercicios;

import java.util.Scanner;

public class Ejer8 {
	private Scanner lectura;
	public Ejer8(Scanner lectura) {
		this.lectura = lectura;
	}
	public void tomarEdad() {
		System.out.println("Ingrese su edad: ");
		int edad = lectura.nextInt();
		String recomendacion = recomendarPelicula(edad);
		System.out.println("\n🎬 Recomendación de película: " + recomendacion);
	}
	public String recomendarPelicula(int edad) {
		if (edad < 7) {
			return peliculasNinos();
		} else if (edad >= 7 && edad <= 17) {
			return peliculasAdolescentes();
		} else if (edad >= 18 && edad <= 30) {
			return peliculasAdultos();
		} else {
			return peliculasMayores();
		}
	}


		public static String peliculasNinos() {
			return "Frozen, Toy Story, Coco, Buscando a Nemo (Películas animadas y educativas)";
		}

		public static String peliculasAdolescentes() {
			return "Spider-Man, Los Increíbles, Harry Potter, Jumanji (Aventura y comedia familiar)";
		}

		public static String peliculasAdultos() {
			return "Matrix, John Wick, Inception, El Lobo de Wall Street (Acción, drama y ciencia ficción)";
		}

		public static String peliculasMayores() {
			return "Casablanca, Titanic, El Padrino, Forrest Gump (Películas clásicas y dramas)";
		}
	}



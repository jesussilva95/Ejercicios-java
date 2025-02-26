package javaEjercicios;

import java.util.Scanner;

public class Ejer7 {

	private Scanner lectura;

		public Ejer7(Scanner lectura) {
				this.lectura = lectura;
			}
		public void tomarDatos() {
			System.out.println("Ingrese su peso en kg: ");
			double peso = lectura.nextDouble();

			System.out.println("Ingrese su altura en metros: ");
			double altura = lectura.nextDouble();
			calcularImc(peso,altura);
		}

	public void calcularImc(double peso, double altura) {

		double imc = peso / (altura * altura);

		String categoria;
		if (imc < 18.5) {
			categoria = "Bajo peso";
		} else if (imc < 24.9) {
			categoria = "Peso normal";
		} else if (imc < 29.9) {
			categoria = "Sobrepeso";
		} else {
			categoria = "Obesidad";
		}


		System.out.println("Su IMC es: "+imc);
		System.out.println("Categoría: " + categoria);
	}







}

package javaEjercicios;

import java.util.Scanner;

public class Ejer4 {
	/*
	* Escribe un programa que simule un sensor de temperatura ambiente y un umbral de alerta. El
	* usuario ingresa la temperatura actual, y el programa verifica si la temperatura está por encima
	* del umbral de alerta. Si es así, muestra un mensaje de alerta. Si no, muestra un mensaje de
	* que la temperatura es normal.
	* */
	protected Scanner lectura;

	public Ejer4(Scanner lectura){
		this.lectura = lectura;
	}

	public float tomarTemperatura() {
		System.out.println("Escriba la temperatura actual: ");
		float tempe = lectura.nextFloat();
		return tempe;
	}

	public boolean calcularTemperatura(float tempe) {
		if (tempe < 30){
			System.out.println("Temperatura esta en rango: ");
			return true;
		}else {
			System.out.println("Esta demasiada alta la temperatura toma una ceverza ");
			return false;
		}
	}
}

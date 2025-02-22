package javaEjercicios;

import java.util.Scanner;

public class Ejer3 {
	private Scanner lectura;
	public Ejer3(Scanner lectura){
		this.lectura = lectura;
	}

	public void tomarTemperatura() {
		System.out.println("Escriba la temperatura actual");
		float tempActual = lectura.nextFloat();
		calcularTempe(tempActual);
	}

	private void calcularTempe(float tempActual) {
		if (tempActual >= 18 && tempActual <= 25){
			System.out.println("Esta en rango puede pasar");
		}else  {
			System.out.println("Esta fuera de rango de temperatura");
		}
	}
}

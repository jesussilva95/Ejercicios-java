
/*
 * Combina las dos simulaciones anteriores. El programa debe simular un ascensor que lleva al
 *usuario a un piso deseado. Antes de moverse, el programa verifica si la temperatura ambiente
 *está dentro del rango aceptable. Si la temperatura está dentro del rango, el ascensor se mueve
 * al piso deseado. Si la temperatura está fuera del rango, muestra un mensaje de que la
 * temperatura no es adecuada y no permite el movimiento del ascensor
 * */
package javaEjercicios;

import java.util.Scanner;

public class Ejer5 extends Ejer4{

	public Ejer5(Scanner lectura){
		super(lectura);
	}

	public void tomarDatos() {
		float temperatura = super.tomarTemperatura();
		boolean resultadoTem = super.calcularTemperatura(temperatura);
		calcularDatps(resultadoTem);
	}

	private void calcularDatps(boolean resultadoTem) {
		if (resultadoTem){
			tomarPiso();
		}else {
			System.out.println("vuelva mas tarde gracias");
		}
	}

	private void tomarPiso() {
		System.out.println("Escriba el piso que desea ir: ");

		int piso = lectura.nextInt();
		System.out.println("Subiendo al piso " + piso);
	}
}

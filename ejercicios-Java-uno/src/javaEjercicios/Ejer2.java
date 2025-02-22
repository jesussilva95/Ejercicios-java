package javaEjercicios;

import java.util.Scanner;

public class Ejer2 {
	public Scanner lectura;
	public Ejer2(Scanner lectura) {
		this.lectura = lectura;
	}
	public void tomarPeso(){
		System.out.println("Escriba su peso: ");
		float peso = lectura.nextFloat();
		calcularPeso(peso);
	}

	private void calcularPeso(float peso) {
		if (peso <= 90){
			System.out.println("Peso adecuado");
			tomarPiso(peso);
		}else {
			System.out.println("Esta en sobre carga");
		}
	}

	private void tomarPiso(float peso) {
		System.out.println("Escriba el piso: ");
		int piso = lectura.nextInt();
		System.out.println("subiendo al piso: "+ piso+" Con peso de: "+peso);
	}
}

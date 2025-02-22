
/*Escribe un programa que simule el funcionamiento de un ascensor. El usuario ingresa el piso
// al que desea ir, y el programa verifica si es un piso válido (usar un rango de numero). Si es
 válido, el ascensor se mueve al piso deseado. Si no es válido, muestra un mensaje de error.*/

package javaEjercicios;

import java.util.Scanner;

public class Ejer1 {
	public Scanner lectura;
	public Ejer1(Scanner lectura){
		 this.lectura = lectura ;
	}
	public void TomarPiso(){
		System.out.println("Escriba el piso al que desea ir ");
		int piso = lectura.nextInt();
		verificarPiso(piso);
	}

	private void verificarPiso(int piso) {
		if (piso <= 5){
			System.out.println("Piso valido");
		}else {
			System.out.println("Piso invalido");
		}
	}
}

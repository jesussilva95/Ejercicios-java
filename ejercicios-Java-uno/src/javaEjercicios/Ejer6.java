
/*
En una tienda se venden tres tipos de productos: "A" (alimentos), "V" (vestimenta) y "E"
(electrónicos). Cada producto tiene un precio base diferente. Escribe un programa en que
solicite al cliente el tipo de producto que desea comprar (A, V o E) y la cantidad de unidades.
Para calcular el costo total de la compra. Si el cliente compra productos de tipo "A", obtiene un
10% de descuento. Si compra productos de tipo "V", obtiene un 5% de descuento. Si compra
productos de tipo "E", no hay descuento. Finalmente, muestra el costo total de la compra con el
descuento aplicado y el costo sin descuento. Asegúrate de validar que la cantidad de unidades
sea un número positivo.
*/

package javaEjercicios;

import java.util.Scanner;

public class Ejer6 {
	public int alimentosP = 30;
	public int vestimentaP = 45;
	public int electronicosP = 60;

	public Scanner lectura;
	public Ejer6(Scanner lectura) {

		this.lectura = lectura;
	}

	public void tomarPeidio() {

		System.out.println("Escoja su pedido donde ");
		System.out.println(" 'A' es alimentos precio $"+alimentosP);
		System.out.println("'V' es vestimenta precio $"+vestimentaP);
		System.out.println("'E' es electronicos precio $"+electronicosP);
		String tipoProducto = lectura.nextLine().toUpperCase();

		System.out.println("Cuantos desea llevar: ");
		int cantidad = lectura.nextInt();
		calcularValor(tipoProducto, cantidad);

	}

	private void calcularValor(String tipoProducto, int cantidad) {
		switch (tipoProducto){
			case "A":
				calcularAlimentos(cantidad);
				break;
			case "V":
				calcularVestimenta(cantidad);
				break;
			case "E":
				cacularElectronicos(cantidad);
				break;
			default:
				System.out.println("Tipo de producto no disponible");
		}
	}

	private void calcularAlimentos(int cantidad) {
		double aux,auxDescuento,valor;
		aux = alimentosP*cantidad;
		auxDescuento = aux*0.10;
		valor = aux-auxDescuento;
		System.out.println("El valor a pagar es de: " +valor);
	}
	private void calcularVestimenta(int cantidad) {
		double aux,auxDescuento,valor;
		aux = vestimentaP*cantidad;
		auxDescuento = aux*0.05;
		valor = aux-auxDescuento;
		System.out.println("El valor a pagar es de: " +valor);
	}

	private void cacularElectronicos(int cantidad) {
		double total;
		total = electronicosP*cantidad;
		System.out.println("El valor a pagar es de: " + total);
	}
}

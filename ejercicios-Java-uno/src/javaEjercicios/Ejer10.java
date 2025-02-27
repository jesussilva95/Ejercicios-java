
/*
Escribe un programa que simule un menú de restaurante. El programa debe permitir al cliente
seleccionar varios platos y bebidas, calcular el costo total y aplicar un descuento según el
método de pago (efectivo, tarjeta de crédito o cheque)

 */
package javaEjercicios;

import java.util.Scanner;

public class Ejer10 {

	private Scanner lectura;
	private double total = 0;

	public Ejer10(Scanner lectura) {
		this.lectura = lectura;
	}

	public void tomarPedido() {
		System.out.println("Bienvenido al Restaurante Chanchito Feliz");
		int opcion;
		do {
			mostrarMenu();
			System.out.print("Seleccione una opción (1-6): ");
			opcion = lectura.nextInt();
			procesarOrden(opcion);
		} while (opcion != 6);
	}

	// Método para mostrar el menú
	public void mostrarMenu() {
		System.out.println(" Menú:");
		System.out.println("1. Hamburguesa - $10.00");
		System.out.println("2. Pizza - $12.00");
		System.out.println("3. Ensalada - $8.00");
		System.out.println("4. Refresco - $3.00");
		System.out.println("5. Café - $4.00");
		System.out.println("6. Finalizar pedido");
	}

	// Método para procesar la orden del usuario
	public   void procesarOrden(int opcion) {
		switch (opcion) {
			case 1:
				total += 10.00;
				System.out.println(" Agregaste una Hamburguesa.");
				break;
			case 2:
				total += 12.00;
				System.out.println(" Agregaste una Pizza.");
				break;
			case 3:
				total += 8.00;
				System.out.println(" Agregaste una Ensalada.");
				break;
			case 4:
				total += 3.00;
				System.out.println(" Agregaste un Refresco.");
				break;
			case 5:
				total += 4.00;
				System.out.println(" Agregaste un Café.");
				break;
			case 6:
				System.out.println(" Finalizando pedido...");
				break;
			default:
				System.out.println(" Opción no válida. Intente de nuevo.");
		}
		aplicarMetodoPago();
	}

	// Método para aplicar el método de pago y descuentos
	public void aplicarMetodoPago() {
		System.out.printf(" Total antes del descuento: $"+ total);

		System.out.println(" Métodos de pago:");
		System.out.println("1. Efectivo (10% de descuento)");
		System.out.println("2. Tarjeta de crédito (5% de descuento)");
		System.out.println("3. Cheque (sin descuento)");
		System.out.print("Seleccione un método de pago (1-3): ");

		int metodoPago = lectura.nextInt();
		calcularDescuento(metodoPago);

		System.out.printf(" Total a pagar después del descuento: "+ total);
	}

	// Método para calcular descuentos según el método de pago
	public void calcularDescuento(int metodoPago) {
		switch (metodoPago) {
			case 1:
				total *= 0.90;
				System.out.println(" Pagando en efectivo. Descuento aplicado.");
				break;
			case 2:
				total *= 0.95;
				System.out.println(" Pagando con tarjeta. Descuento aplicado.");
				break;
			case 3:
				System.out.println(" Pagando con cheque. No hay descuento.");
				break;
			default:
				System.out.println(" Método de pago no válido. No se aplicará descuento.");
		}
	}
}


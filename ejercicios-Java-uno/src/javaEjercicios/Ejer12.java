package javaEjercicios;

import java.util.Scanner;

public class Ejer12 {
	private double totalCompra;
	private Scanner lectura;
	public Ejer12(Scanner lectura) {
		this.lectura = lectura;
	}
	public void realizarCompra(){
		boolean continuar = true;
		while (continuar){
			agregarItem();
			System.out.println("Desea agregar otro producto: (Sí = 1 / No = 0)");
			int respuesta = lectura.nextInt();
			continuar = (respuesta==1);
		}
		mostrarresultado();
	}
	private void agregarItem() {
		double precio;
		int cantidad;
		do {
			System.out.println("Ingrese el precio del producto: ");
			precio=lectura.nextDouble();
			if (precio<=0){
				System.out.println("Valor invalido debe ser mayor a cero ");
			}
		}while (precio<=0);
		//validar numero positivo
		do {
			System.out.println("Ingrese la cantidad que desea comprar ");
			cantidad = lectura.nextInt();
			if (cantidad<=0){
				System.out.println("Valor debe ser mayor a cero ");
			}
		}while (cantidad<=0);
		double costoItems = precio * cantidad;
		totalCompra += costoItems;
		System.out.println("El producto agregado $"+costoItems);
	}

	private void mostrarresultado() {
		System.out.println("total de la compra es: "+totalCompra);

	}
}
/*

    // Método para mostrar el total de la compra
    public void mostrarTotal() {
        System.out.println("\n🛍️ Total de la compra: $" + totalCompra);
        System.out.println("¡Gracias por su compra!");
    }
}

 */

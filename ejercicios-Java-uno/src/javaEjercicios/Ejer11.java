
/*

 • Diseña un programa que simule un cajero automático. El usuario debe ingresar el monto que desea
retirar. El programa debe verificar que el monto no exceda el saldo disponible en la cuenta. Si el
monto es mayor que el saldo, se debe mostrar un mensaje de error. Si el monto es válido, el
programa debe calcular y mostrar el saldo restante.
 */
package javaEjercicios;

import java.util.Scanner;

public class Ejer11 {
	private double saldo;
	private Scanner lectura;

	public Ejer11(Scanner lectura) {
		this.saldo = 500.00;
		this.lectura = lectura;

	}

	public void menuCajero() {
		int opcion = 0;
		while (opcion != 2) {
			System.out.println("Saldo Disponible $"+saldo);
			System.out.println("1 Retirar dinero");
			System.out.println("2 Salir");
			System.out.print("Seleccione una opción: ");
			opcion = lectura.nextInt();
			if (opcion == 1) {
				realizarRetiro();
			} else if (opcion != 2) {
				System.out.println(" Opción inválida. Intente nuevamente.");
			}
		}
		System.out.println("Gracias por usar el cajero automático del Chanchito Feliz");
		}

	private void realizarRetiro() {
		System.out.print("Ingrese el monto que desea retirar: ");
		double monto = lectura.nextDouble();

		while (monto <= 0 || !validarRetiro(monto)) {
			System.out.println("Monto inválido o saldo insuficiente. Intente de nuevo.");
			System.out.print("Ingrese un monto válido: ");
			monto = lectura.nextDouble();
		}
		procesarRetiro(monto);
	}

	private boolean validarRetiro(double monto) {
		return monto > 0 && monto <= saldo;
	}

	private void procesarRetiro(double monto) {
		saldo -= monto;
		System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
	}



}
/*
    public void menu() {
        int opcion;
        do {
            System.out.println("\n💰 Saldo disponible: $" + saldo);
            System.out.println("1️⃣ Retirar dinero");
            System.out.println("2️⃣ Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                realizarRetiro();
            } else if (opcion != 2) {
                System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 2);

        System.out.println("👋 ¡Gracias por usar el cajero automático!");
    }

    // Método público para realizar un retiro
    public void realizarRetiro() {
        System.out.print("Ingrese el monto que desea retirar: ");
        double monto = scanner.nextDouble();

        while (monto <= 0 || !validarRetiro(monto)) {
            System.out.println("❌ Monto inválido o saldo insuficiente. Intente de nuevo.");
            System.out.print("Ingrese un monto válido: ");
            monto = scanner.nextDouble();
        }

        procesarRetiro(monto);
    }

    // Método público para validar si el retiro es posible
    public boolean validarRetiro(double monto) {
        return monto > 0 && monto <= saldo;
    }

    // Método público para procesar el retiro
    public void procesarRetiro(double monto) {
        saldo -= monto; // Resta el monto del saldo
        System.out.println("✅ Retiro exitoso. Nuevo saldo: $" + saldo);
    }
}

 */
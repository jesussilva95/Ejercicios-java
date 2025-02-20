//en esta clase vamos a tomar todos los datos del cliente y retornarlos
//como un objeto para hacer mas facil su manipulacion y manteminiento

package EjerFactura;

import java.util.Scanner;

public class TomarDateCliente {

	private Scanner lecturaDate;


	public TomarDateCliente(){
		lecturaDate = new Scanner(System.in);
	}
	public String tomarName(){
		System.out.println("Ingrese el nombre: ");
		return lecturaDate.nextLine();
	}
	public String tomarDireccion(){
		System.out.println("Ingrese su direcion: ");
		return lecturaDate.nextLine();
	}
	public Integer tomarDni(){
		System.out.println("Ingrese su cedula: ");
		return lecturaDate.nextInt();
	}
	public boolean tomarEstado(){
		System.out.println("¿Es cliente VIP? escriba true o false");
		while (!lecturaDate.hasNextBoolean()){
			System.out.println("Error ingrese true o false. ");
			lecturaDate.next();
		}
		return lecturaDate.nextBoolean();
	}

	public char tomarTipo(){
		System.out.println("Ingrese el tipo de cliente - A - B - C");
		return lecturaDate.nextLine().charAt(0);
	}


}

package EjerFactura;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MenuProduct {

	private HashMap<String, Integer> menu ,pedidos;
	Scanner lectura = new Scanner(System.in);


	public MenuProduct() {
		menu = new HashMap<>();
		menu.put("Pollo", 8);
		menu.put("Res", 10);
		menu.put("Pescado", 7);
		menu.put("Cerdo", 9);
		menu.put("Soda", 2);
		menu.put("Jugo",3);
	}


	public void menuMostrar() {
		for(Map.Entry <String,Integer> plato : menu.entrySet() ){
			System.out.println("Plato: "+ plato.getKey() );
			System.out.println("Precio: "+ plato.getValue());
			System.out.println("---------------------");
		}

	}
	public HashMap<String, Integer> tomarPedido() {
		pedidos = new HashMap<>();
		String continuar = "";
		while (!continuar.equalsIgnoreCase("salir")) {
			System.out.println("Escribe el nombre del plato que deseas ordenar");
			String clavePlato = lectura.nextLine();
			menu.containsKey(clavePlato);
			System.out.println("Cuantos desea llevar? ");
			int keyCantidad = lectura.nextInt();
			lectura.nextLine();

			pedidos.put(clavePlato,keyCantidad);
			System.out.println("Desea tomar otro plato si es asi, precione cualquier tecla si no escribe 'salir' ");
			continuar = lectura.nextLine();
		}
		return pedidos;
	}
}

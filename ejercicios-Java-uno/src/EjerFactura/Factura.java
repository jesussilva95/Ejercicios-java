package EjerFactura;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Factura {

	public  MenuProduct menuProduct = new MenuProduct();



	public Factura(){
		System.out.println("Clase factura inicializada");
	}

	public void  mostrarMenu(){
		menuProduct.menuMostrar();
		HashMap<String,Integer> listaPedidos = menuProduct.tomarPedido();

		System.out.println("El pedido es: ");
		for(Map.Entry plato : listaPedidos.entrySet() ){
			System.out.println("Plato: "+ plato.getKey() );
			System.out.println("Precio: "+ plato.getValue());
			System.out.println("---------------------");
		}

	}
}

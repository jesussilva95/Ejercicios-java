
package EjerFactura;

import java.util.Objects;
import java.util.Scanner;

public class Cliente {
	TomarDateCliente datesClient = new TomarDateCliente();
	private String nameClient;
	private String direccion;
	private int cedula;
	private boolean estado;
	private char tipe;

	public Cliente(){
		System.out.println("Clase cliente");
	}

	//public Cliente(String name,String direccion,int cedula,boolean estado,char tipe){
	//
	//}



	public String getNameClient() {return nameClient;}

	public String getDireccion(){return direccion;}

	public int getCedula() {return cedula;}

	public boolean getEstado() {return estado;}

	public char getTipe(){return tipe;}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public void setTipe(char tipe){
		this.tipe = tipe;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	//tomamos los datos del cliente
	public Cliente takeClientDate(){
		setNameClient(datesClient.tomarName());
		setDireccion(datesClient.tomarDireccion());
		setCedula(datesClient.tomarDni());
		setTipe(datesClient.tomarTipo());
		return this;
	}
}

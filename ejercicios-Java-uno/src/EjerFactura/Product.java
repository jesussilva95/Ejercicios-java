package EjerFactura;

public class Product {

	public String nameProduct;
	public int cantidadProduct;
	public float valorProduct;

	public Product(){
		System.out.println("Clase producto");
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public float getValorProduct() {
		return valorProduct;
	}

	public int getCantidadProduct() {
		return cantidadProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public void setCantidadProduct(int cantidadProduct) {
		this.cantidadProduct = cantidadProduct;
	}

	public void setValorProduct(float valorProduct) {
		this.valorProduct = valorProduct;
	}

}

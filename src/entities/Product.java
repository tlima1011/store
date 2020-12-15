package entities;

public class Product {
	
	//Atributos 
	private String name; 
	private Double price; 
	
	//Construtores 
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	//Getters and Setters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	/*@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}*/
}

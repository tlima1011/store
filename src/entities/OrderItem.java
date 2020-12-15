package entities;

public class OrderItem {
	
	//Atributos 
	private Integer quantity; 
	private Double price; 
	private Product product; 
	
	//Construtor 
	public OrderItem(Product product, Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	//Getters and Setters 
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return this.price * this.quantity; 
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		//sb.append(product.getName()); 
		//sb.append(", $" +String.format("%.2f", this.price));
		//sb.append(", Quantity: " +this.quantity); 
		//sb.append(", Subtotal: $" +String.format("%.2f", this.subTotal())+"\n");
		return product.getName() +", $" +String.format("%.2f", this.price)
				+", Quantity: " +this.quantity
				+", Subtotal: $" +String.format("%.2f", this.subTotal());
	}
}

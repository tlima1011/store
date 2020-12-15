package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment; 
	private OrderStatus status; 
	private Client client; 
	private Product product; 
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	List<OrderItem> itens = new ArrayList<>(); 
	
	//Construtor 
	public Order(OrderStatus status, Client client) {
		this.status = status;
		this.client = client; 
	}
	
	public Order(Product product) {
		this.product = product; 
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void addItem(OrderItem item) {
		itens.add(item); 
	}
	
	public void removeItem(OrderItem item) {
		itens.add(item);
	}
	
	public double total() {
		double total = 0.0; 
		for (OrderItem orderItem : itens) {
			total += orderItem.subTotal();
		}
		return total; 
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		Date novaData = new Date();
		this.moment = novaData; 
		sb.append("ORDER SUMMARY:\n"); 
		sb.append("Order Moment: " +sdf.format(moment) + "\n");
		sb.append("Order status: " +this.status+"\n");
		sb.append(client+"\n");
		sb.append("Order items: \n");
		for (OrderItem orderItem : itens) {
			sb.append(orderItem + "\n");
		}
		//sb.append(itens);
		sb.append("Total Price: $" +String.format("%.2f", total()));
		return sb.toString();
	}
}

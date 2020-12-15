package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		System.out.println("Enter cliente data:"); 
		System.out.print("Name: "); //Alex Green
		String name = sc.nextLine(); 
		System.out.print("Email: "); //alex@gmail.com
		String email = sc.nextLine(); 
		System.out.print("Birth date (DD/MM/YYYY): "); //15/03/1985
		Date data = sdf.parse(sc.next());
		Client client = new Client(name, email, data); 
		System.out.println("Enter order data:"); 
		sc.nextLine();
		System.out.print("Status: "); //PROCESSING
		OrderStatus os = OrderStatus.valueOf(sc.next()); 
		Order order = new Order(os, client); 
		System.out.print("How many items to this order?  ");//2
		int n = sc.nextInt(); 
		for(int i = 0; i < n;i++) {
			sc.nextLine();
			System.out.printf("Enter #%d item data: \n", (i + 1)); 
			System.out.print("Product name: ");//TV
			String productName = sc.nextLine(); 
			System.out.print("Product price: $");//1000.00
			Double price = sc.nextDouble(); 
			Product product = new Product(productName, price);
			System.out.print("Quantity: "); //1
			Integer quantity = sc.nextInt(); 
			OrderItem orderItem = new OrderItem(product, quantity, price);
			order.addItem(orderItem);
		}
		System.out.println();
		System.out.println(order);
		System.out.println();
		sc.close();
	}
}

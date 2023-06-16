package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;
import java.time.LocalDate;
import java.time.*;
import java.time.temporal.*;

class Customer {
	
//  private Long id;
  
  private String name;
  private Integer tier;
  
  
  public String getName() {
	  return name;
  }
  
  public void setName(String name) {
	  this.name = name;
  }

  public Integer getTier() {
	  return tier;
  }

  public void setTier(Integer tier) {
	  this.tier = tier;
  }

  
  public Customer(String name, Integer tier) {
	  super();
	  this.name = name;
	  this.tier = tier;
  }
  
}
//
class Order {
	
//  private int id;
  
  private LocalDate orderDate;
  private LocalDate deliveryDate;
  private String status;
  
  private Customer customer;
  
  Set<Product> products;

  public LocalDate getOrderDate() {
	  return orderDate;
  }
  
  public void setOrderDate(LocalDate orderDate) {
	  this.orderDate = orderDate;
  }

  public LocalDate getDeliveryDate() {
	  return deliveryDate;
  }

  public void setDeliveryDate(LocalDate deliveryDate) {
	  this.deliveryDate = deliveryDate;
  }

  public String getStatus() {
	  return status;
  }

  public void setStatus(String status) {
	  this.status = status;
  }

  public Customer getCustomer() {
	  return customer;
  }

  public void setCustomer(Customer customer) {
	  this.customer = customer;
  }

  public Set<Product> getProducts() {
	  return products;
  }
  
  public void setProducts(Set<Product> products) {
	  this.products = products;
  }

  public Order(LocalDate orderDate, LocalDate deliveryDate, String status, Customer customer, Set<Product> products) {
	  super();
	  this.orderDate = orderDate;
	  this.deliveryDate = deliveryDate;
	  this.status = status;
	  this.customer = customer;
	  this.products = products;
  }  
}

//class Product {
//	
//  private Long id;
//  
//  private String name;
//  private String category;
//  private Double price;
//  
//  private Set<Order> orders;
//}

class Product{
	
	private String name;
	private String category;
	private Double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println(String.format("%-10s", name) + "\t" + category + "\t" + price);
	}
	
	public Product(String name, String category, double price) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
}

public class Exercises {
	
	public static void main(String[] args) {
		
		List<Product> listOfProducts = List.of(
				new Product("Ramayana", "Books", 200),
				new Product("Gita", "Books", 75),
				new Product("Bible", "Books", 150),
				new Product("R.C. Car", "Toys", 2000),
				new Product("Frisbee", "Toys", 750),
				new Product("Sony", "Instruments", 3000)
		);
		
//		Product product1 = new Product("Ramayana", "Books", 200);
		
		
		
//		listOfProducts.stream() // Exercise 1
//			.filter(p -> p.getCategory() == "Books")
//			.filter(p -> p.getPrice() > 100)
//			
//			.forEach(p -> p.printInfo());
		
//			.map(p->p.getName())
//			.collect(Collectors.toList())
//			.forEach(System.out::println);
		
		listOfProducts.stream() //Exercise 3
			.filter(p -> p.getCategory() == "Toys")
			.map(p -> p.getPrice()*0.9)
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		List<Order> listOfOrders = List.of( // Exercise 4
				new Order(
						LocalDate.of(2020, 5, 13), 
						LocalDate.of(2020, 6, 15), 
						"Pending", 
						new Customer("Raghav", 2), 
						(new Set<Product> products = ("R.C. Car", "Toys", 2000), ("Frisbee", "Toys", 750)))
		);
		
//		listOfOrders.stream()
//			.flatMap(p->p.getTier().stream())
//			.filter((p) -> p.getTier == 2)
//			.collect(Collectors.toSet())
//			.forEach(System.out::println);
		
	}
}

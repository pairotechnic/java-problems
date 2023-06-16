//package StreamAPI;
//
//import java.util.*;
//import java.util.stream.Collectors;
//import java.lang.*;
//
////class Customer {
////	
////  private Long id;
////  
////  private String name;
////  private Integer tier;
////}
////
////class Order {
////	
////  private int id;
////  
////  private LocalDate orderDate;
////  private LocalDate deliveryDate;
////  private String status;
////  
////  private Customer customer;
////  
////  Set<Product> products;
////    
////}
//
////class Product {
////	
////  private Long id;
////  
////  private String name;
////  private String category;
////  private Double price;
////  
////  private Set<Order> orders;
////}
//
//class Product_3{
//	
//	private String name;
//	private String category;
//	private Double price;
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getCategory() {
//		return category;
//	}
//	public void setCategory(String category) {
//		this.category = category;
//	}
//	public Double getPrice() {
//		return price;
//	}
//	public void setPrice(Double price) {
//		this.price = price;
//	}
//	
//	public void printInfo() {
//		System.out.println(String.format("%-10s", name) + "\t" + category + "\t" + price);
//	}
//	
//	public Product_3(String name, String category, double price) {
//		super();
//		this.name = name;
//		this.category = category;
//		this.price = price;
//	}
//	
//}
//
//public class Exercise3 {
//	
//	public static void main (String[] args) {
//		
//		List<Product_3> listOfProducts = List.of(
//				new Product_3("Ramayana", "Books", 200),
//				new Product_3("Gita", "Books", 75),
//				new Product_3("Bible", "Books", 150),
//				new Product_3("R.C. Car", "Toys", 2000),
//				new Product_3("Frisbee", "Toys", 750),
//				new Product_3("Sony", "Instruments", 3000)
//		);
//		
//		listOfProducts.stream() //Exercise 3
//			.filter(p -> p.getCategory() == "Toys")
//			.map(p -> p.getPrice()*0.9)
//			.collect(Collectors.toList())
//			.forEach(p -> p.getPrice());
//		
//			
//	}
//}

//package StreamAPI;
//
//import java.util.*;
//import java.util.stream.Collectors;
//import java.lang.*;
//
//class Customer {
//	
//  private Long id;
//  
//  private String name;
//  private Integer tier;
//}
//
//class Order {
//	
//  private Long id;
//  
//  private LocalDate orderDate;
//  private LocalDate deliveryDate;
//  private String status;
//  
//  private Customer customer;
//  
//  Set<Product> products;
//    
//}
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
//class Product{
//	
//	private int id;
//	private String name;
//	private String category;
//	private int price;
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
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
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	
//	public void printInfo() {
//		System.out.println(id + "\t" + String.format("%-10s", name) + "\t" + category + "\t" + price);
//	}
//	
//	public Product(int id, String name, String category, int price) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.category = category;
//		this.price = price;
//	}
//	
//	
//}
//
//public class Exercise2 {
//	
//	public static void main(String[] args) {
//		
//		List<Product> listOfProducts = List.of(
//				new Product(1, "Ramayana", "Books", 200 ),
//				new Product(2, "Gita", "Books", 75),
//				new Product(3, "Bible", "Books", 150),
//				new Product(4, "HP", "Electronics", 2000),
//				new Product(5, "Apple", "Electronics", 750),
//				new Product(6, "Sony", "Instruments", 3000)
//		);
//		
//		
//		
////			.map(p->p.getName())
////			.collect(Collectors.toList())
////			.forEach(System.out::println);
//	
//	}
//}

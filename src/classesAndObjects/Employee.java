package classesAndObjects;

public class Employee {

	String name;
	int yearOfJoining;
	String Address;
	int salary;
	
	void showDetails() {
	    System.out.println(name + "\t" + yearOfJoining + "\t\t" + Address + "\t" + salary);
	  }
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "Robert";
		emp1.yearOfJoining = 1994;
		emp1.Address = "64C - Wallstreet";
		emp1.salary = 10000000;
		
		Employee emp2 = new Employee();
		emp2.name = "Sam";
		emp2.yearOfJoining = 2000;
		emp2.Address = "68D - Wallstreet";
		
		Employee emp3 = new Employee();
		emp3.name = "John";
		emp3.yearOfJoining = 1999;
		emp3.Address = "26B - Wallstreet";
		
		System.out.println("Name\tYearOfJoining\tAddress\t\tSalary");
		emp1.showDetails();
		emp2.showDetails();
		emp3.showDetails();
	}

}

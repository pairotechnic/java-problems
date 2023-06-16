package classesAndObjects;

class StudentClass{
	String name;
	
	StudentClass(){
		name = "Unknown";
	}
	
	StudentClass(String nameInput){
		name = nameInput;
	}
	
	void printName() {
		System.out.println("Student's name is : " + name);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		StudentClass std1 = new StudentClass();
		std1.printName();
		
		StudentClass std2 = new StudentClass("Balaji");
		std2.printName();
		
	}

}

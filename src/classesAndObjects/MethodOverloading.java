package classesAndObjects;

abstract class Bank{
	
	abstract void getBalance();
}

class BankA extends Bank{
	
	void getBalance() {
		System.out.println("$100");
	}
}

class BankB extends Bank{
	
	void getBalance() {
		System.out.println("$150");
	}
}

class BankC extends Bank{
	
	void getBalance() {
		System.out.println("$200");
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Bank bk1 = new BankA();
		bk1.getBalance();
		
		Bank bk2 = new BankB();
		bk2.getBalance();
		
		Bank bk3 = new BankC();
		bk3.getBalance();
	}

}

package classesAndObjects;

abstract class Marks{
	
	abstract void getPercentage();
}

class A extends Marks{
	
	int sub1, sub2, sub3;
	
	A(int a, int b, int c){
		sub1 = a;
		sub2 = b;
		sub3 = c;
	}
	
	void getPercentage() {
//		float percentage = ;
		System.out.println((float)(sub1 + sub2 + sub3)/3);
	}
}

class B extends Marks{
	
	int sub1, sub2, sub3, sub4;
	
	B(int a, int b, int c, int d){
		sub1 = a;
		sub2 = b;
		sub3 = c;
		sub4 = d;
	}
	
	void getPercentage() {
//		float percentage = ;
		System.out.println((float)(sub1 + sub2 + sub3 + sub4)/4);
	}
}

public class MarksAB {

	public static void main(String[] args) {
		
		Marks std1 = new A(30, 40, 50);
		std1.getPercentage();
		
		Marks std2 = new A(50, 60, 70);
		std2.getPercentage();
		
	}

}

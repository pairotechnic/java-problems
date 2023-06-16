package classesAndObjects;

abstract class ParentClass{
	
	abstract void message();
}

class ChildClass1 extends ParentClass{

	@Override
	void message() {
		System.out.println("This is first subclass");
	}
	
}

class ChildClass2 extends ParentClass{

	@Override
	void message() {
		System.out.println("This is second subclass");
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		ParentClass cls1 = new ChildClass1();
		cls1.message();
		
		ParentClass cls2 = new ChildClass2();
		cls2.message();
	}

}

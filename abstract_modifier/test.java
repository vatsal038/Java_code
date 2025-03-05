package abstract_modifier;

abstract class A {
	abstract void logic();
	abstract void logic2();
	
	void fun() {
			System.out.println("this is fun method");
	}

}
public class test extends A{
	void logic() {
		System.out.println("logic method");
	}
	void logic2() {
		System.out.println("logic 2 method");
	}
	public static void main(String[] args) {
		//A obj =  new A(); Cannot create object of abstract class.
	
	}
}


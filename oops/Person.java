package oops;


public class Person {
	int id;
	String name;
	Person(){
		id =101;
		name = "Aman";
	}
	void logic() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] a) {
		Person p1 = new Person();
		p1.logic();
	}

}

package oops;

class Add {
	//data+operation(function)
	int a,b,c;
	void input(int x,int y) {
		a = x;
		b = y;
	}
	void cal() {
		c = a+b;
	}
	void display() {
		System.out.println("a+b : "+c);
	}
	
}
public class first {
	public static void main(String[] args) {
		Add obj = new Add();
		obj.input(12,15);
		obj.cal();
		obj.display();
	}
}

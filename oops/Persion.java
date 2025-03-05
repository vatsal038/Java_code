package oops;

public class Persion {
	Persion(){
		System.out.println("this is def cons of this class !!");
	}
	Persion(int a ){
		System.out.println("this is parametrize cons. of this class!!");
	}
	Persion(int a, int b){
		System.out.println("this is two per(int,int)cons.!!");		
	}
	Persion(float a, int b){
		System.out.println("this is two per(floatt,int)cons.!")
	}
	void logic() {
		System.out.println("this is logic!!");
	}
	
	public static void main(String[] a) {
		Persion p1 = new Persion();
		
	}

}

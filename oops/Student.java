package oops;

public class Student {
	int id;
	String name;
	String course;
	String clg_name;
	
	void setData(int i, String n ,String c, String cl ) {
		id = i;
		name = n;
		course = c;
		clg_name = cl;
	}
	void getData() {
		System.out.println(id + " " + name +" " + course + "  " + clg_name);
	}
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setData(1,  "bisma" ,  "LLB" , "DU");
		stu1.getData();
	
	}
}

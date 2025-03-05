package oops;

public class Personal {
	// wap to print your name, age and pin code on screen using class
	 String name;
	    int age;
	    int pinCode;

	 
	    Personal(String name, int age, int pinCode) {
	        this.name = name;
	        this.age = age;
	        this.pinCode = pinCode;
	    }

	  
	    void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("City Pin Code: " + pinCode);
	    }

	    public static void main(String[] args) {
	     
	        Person person = new Person("Vatsal", 18, 123456);
	        
	      
	        person.displayInfo();
	    }
	}
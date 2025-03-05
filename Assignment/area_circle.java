package Assignment;
	import java.util.Scanner;
public class area_circle {
	class Circle {
	    private double radius;

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    	    public double getArea() {
	        final double PI = 3.14;
	        return PI * radius * radius;
	    }
	}

	public class CircleArea {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Circle circle = new Circle(); 

	     
	        System.out.print("Enter the radius of the circle: ");
	        double radius = scanner.nextDouble();

	        
	        circle.setRadius(radius);
	        System.out.println("Area of the circle: " + circle.getArea());

	        scanner.close();
	    }
	}
}

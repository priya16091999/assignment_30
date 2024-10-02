package assignments_30;

public class Triangle_Test {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3,4,5);
		double area=triangle.calculateArea();
		double perimeter=triangle.CalculatePerimeter();
		System.out.println("Area of the triangle: "+area);
		System.out.println("Perimeter of the triangle: "+perimeter);
	}

}

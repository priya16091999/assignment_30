//1.    Write a program to print the area and perimeter of a triangle having 
//sides of 3, 4 and 5 units by creating a class named 'Triangle' 
//with parameter in its constructor.

package assignments_30;

public class Triangle {

	private double length;
	private double breadth;
	private double height;
	
	

	public Triangle( double length, double breadth, double height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public double CalculatePerimeter()
	{
		return length+breadth+height;
		
	}
	public double calculateArea()
	{
		return (length+height)/2;
		
	}
	
}

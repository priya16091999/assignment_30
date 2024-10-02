package assignments_30;

public class Car {

	String model;
	String name;
	double price;
	String owner;

	// Method to assign values to car data
	public void accept(String model, String name, double price, String owner) {
		this.model = model;
		this.name = name;
		this.price = price;
		this.owner = owner;
	}

	public void display() {
		System.out.println("Car Model: " + model);
		System.out.println("Car Name: " + name);
		System.out.println("Car Price: $" + price);
		System.out.println("Car Owner: " + owner);
		System.out.println();
	}
}

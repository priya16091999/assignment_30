/*
 2.    Print the sum, difference and product of two complex numbers 
 by creating a class, named 'Complex' with separate methods for each 
 operation whose real and imaginary parts are entered by user. 
 Use Constructors to initialize the data members.
 */
package assignments_30;
public class Cpx {

	private double r; // Real part
	private double i; // Imaginary part

	public Cpx(double r, double i) {
		this.r = r;
		this.i = i;
	}

	public Cpx add(Cpx c) {
		return new Cpx(this.r + c.r, this.i + c.i);
	}

	public Cpx sub(Cpx c) {
		return new Cpx(this.r - c.r, this.i - c.i);
	}

	public Cpx mul(Cpx c) {
		return new Cpx(this.r * c.r - this.i * c.i, this.r * c.i + this.i * c.r);
	}

	public void show() {
		{
			System.out.print(r);
			if (i >= 0) {
				System.out.print(" + " + i + "i");
			} else {
				System.out.print(" - " + Math.abs(i) + "i");
			}
			System.out.println();
		}
	}
}

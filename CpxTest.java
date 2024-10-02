package assignments_30;

import java.util.Scanner;

public class CpxTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input first complex number
        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();
        Cpx c1 = new Cpx(r1, i1);

        // Input second complex number
        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();
        Cpx c2 = new Cpx(r2, i2);

        // Perform operations
        Cpx sum = c1.add(c2);
        Cpx diff = c1.sub(c2);
        Cpx prod = c1.mul(c2);

        // Display results
        System.out.print("Sum: ");
        sum.show();
        System.out.print("Difference: ");
        diff.show();
        System.out.print("Product: ");
        prod.show();
	}

}

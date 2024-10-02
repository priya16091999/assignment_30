package assignments_30;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee=new Employee();
		
		System.out.println("Enter salary and no of hours worked per day");
		double salary=sc.nextDouble();
		int workHours=sc.nextInt();
		
		employee.accept(salary, workHours);
		employee.addSal();
		employee.addWork();
		
		employee.printFinalSalary();
	}

}

package assignments_30;

public class Employee {

	private double salary;
	private int workHours;
	
	public void accept(double salary, int workHours)
	{
		 this.salary = salary;
		 this.workHours = workHours;
	}
	
	public void addSal()
	{
		if(salary<500)
		{
			salary=salary+10;
		}
	}
	public void addWork() 
	{
        if (workHours > 6) 
        {
            salary =+salary +5; // Add $5 to the salary
        }
    }
	
	 public void printFinalSalary() {
	        System.out.println("Final Salary: $" + salary);
	    }
}

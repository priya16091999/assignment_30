package assignments_30;

public class SavingAccount {

	
	    private static double annualInterestRate; 
	    private double savingsBalance; 

	  
	    public SavingAccount(double balance) {
	        savingsBalance = balance;
	    }

	    
	    public void calculateMonthlyInterest() {
	        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
	        savingsBalance += monthlyInterest; 
	    }

	   
	    public static void modifyInterestRate(double newRate) {
	        annualInterestRate = newRate; 
	    }

	    
	    public void displayBalance() {
	        System.out.printf("Current Balance: $%.2f%n", savingsBalance);
	    }
	}



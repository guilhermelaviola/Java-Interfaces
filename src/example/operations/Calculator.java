package example.operations;

import java.util.Scanner;

// This class implements the Operations interface
public class Calculator implements Operations {
	
	// I declared the Scanner object here because it must be used by all methods implemented here in this class
	Scanner s = new Scanner(System.in);
	
	// Mathematical basic operations methods (+, -, x, /)
	@Override
	public void add() {
		System.out.println("ADDITION:");
		System.out.println("Enter two values:");
		double x = s.nextDouble();
		double y = s.nextDouble();
		double z = x + y;
		System.out.println("The sum of " + x + " + " + y + " is " + z);
	}
	
	@Override
	public void sub() {
		System.out.println("SUBTRACTION:");
		System.out.println("Enter two integer values:");
		double x = s.nextDouble();
		double y = s.nextDouble();
		double z = x - y;
		System.out.println("The difference of " + x + " - " + y + " is " + z);
	}
	
	@Override
	public void mult() {
		System.out.println("MULTIPLICATION:");
		System.out.println("Enter two integer values:");
		double x = s.nextDouble();
		double y = s.nextDouble();
		double z = x * y;
		System.out.println("The product of " + x + " x " + y + " is " + z);
	}
	
	@Override
	public void div() {
		System.out.println("DIVISION:");
		System.out.println("Enter two integer values:");
		double x = s.nextDouble();
		double y = s.nextDouble();
		double z = x / y;
		System.out.println("The quotient of " + x + " + " + y + " is " + z);
	}
	
	public static void main(String[] args) {
		// Instantiating Calculator's object
		Calculator c = new Calculator();
		// Invoking its methods
		c.add();
		c.sub();
		c.mult();
		c.div();
	}
}

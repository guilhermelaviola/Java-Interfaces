package example.NestedInterface1;

// This class implements a nested interface inside of another interface
class InnerInterfaceDemo implements OuterInterface.InnerInterface{

	public static void main(String[] args) {
		// Instantiating OuterInterface.InnerInterface object
		OuterInterface.InnerInterface oin = new InnerInterfaceDemo();
		// Invoking DisplayInner() method that was implemented in this class
		oin.DisplayInner();
	}

	// Implementing DisplayInner() method
	@Override
	public void DisplayInner() {
		// Here you have 3 variables with different values assigned in each one of them
		int a = 10, b = 0, c = 1;
		// Printing the first term
		System.out.println("First " + a + " terms: ");
		// Using an iterator to go through the sequence between 0 and <= a, in the ascending order
		for(int i = 0; i <= a; i++) {
			// Printing b+
			System.out.println(b + " + ");
			int sum = b + c;
			b = c;
			c = sum;
		}
		System.out.println("Printing from Inner Interface Demo...");
	}	
}

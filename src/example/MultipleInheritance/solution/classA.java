package example.MultipleInheritance.solution;

public class classA {
	// Implementing methods Hello() and Welcome()
	public void Hello() {
		System.out.println("Hello!");
	}
	public void Welcome() {
		System.out.println("Welcome!");
	}
	public static void main(String[] args) {
		// Object instantiation of classA
		classA ca = new classA();
		
		// Invoking classA methods
		ca.Hello();
		ca.Welcome();
	}
}

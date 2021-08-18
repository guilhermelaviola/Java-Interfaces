package example.NestedInterface1;

// Nesting Interface within another Interface, each one with one method declared
public interface OuterInterface {
	void DisplayOuter();
	interface InnerInterface {
		void DisplayInner();
	}
}

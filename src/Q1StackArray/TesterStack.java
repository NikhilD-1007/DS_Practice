package Q1StackArray;

public class TesterStack {

	public static void main(String[] args) {
		
		StackArray<Integer> stack = new StackArray<Integer>();
		
		stack.pushElement(10);
		System.out.println(stack.peepElement());
		stack.pushElement(20);
		System.out.println(stack.peepElement());
		stack.pushElement(30);
		System.out.println(stack.peepElement());
		stack.pushElement(40);
		System.out.println(stack.peepElement());
		stack.pushElement(50);
		System.out.println(stack.peepElement());
		
		System.out.println("--------------");
		System.out.println("Pop: "+stack.popElement() );
		System.out.println("Pop: "+stack.popElement() );
		System.out.println("Pop: "+stack.popElement() );
		System.out.println("Pop: "+stack.popElement() );
		System.out.println("Pop: "+stack.popElement() );
		System.out.println("Pop: "+stack.popElement() );

	}

}

package Q3DecimalToBinary;

import java.util.Scanner;
import java.util.Stack;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackDecimal num = new StackDecimal();
		
		num.push(10);
		System.out.println(num.pop());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int deci = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		while(deci > 0)
		{
			stack.push(deci%2);
			deci = deci /2;
		}
		
		while(!stack.empty()) {
		System.out.print(stack.pop());
		}
	}

}

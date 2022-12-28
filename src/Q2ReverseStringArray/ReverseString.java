package Q2ReverseStringArray;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String inputString = sc.nextLine();
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<inputString.length();i++)
		{
			stack.push(inputString.charAt(i));
		}
		
		for(int i=0;i<inputString.length();i++)
		{
			System.out.print(stack.pop()+" ");
		}
		
	}
	
}

package Q1StackArray;

public class StackArray <T>{

	private int top = -1;
	private T arr[];
	
	public StackArray()
	{
		arr = (T[])new Object[5];
	}
	
	public StackArray(int size) {
		
		arr= (T[]) new Object[size];
	}
	
	public boolean isFull()
	{
		if(top == arr.length-1)
			return true;
		return false;
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		return false;
	}
	
	public boolean pushElement(T data)
	{
		if(isFull()==false)
		{
			top = top + 1;
			arr[top] = data;
			return true;
		}
		else
			System.out.println("Stack is Full");
		return false;
		
	}
	
	
	public T popElement()
	{
		if(isEmpty()==false)
		{
			T temp = arr[top];
			top = top -1;
			return temp;
		}
		else
			System.out.println("Stack is Empty");
		return null;
		
	}
	
	public T peepElement()
	{
		if(isEmpty()==false)
		{
			T temp = arr[top];
			return temp;
		}
		else
			System.out.println("Stack is Empty");
		return null;
	}
	
}

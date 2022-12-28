package Q3DecimalToBinary;

public class StackDecimal {

	private int top = -1;
	private int arr[];
	
	public StackDecimal()
	{
		arr = new int[20];
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		return false;
				
	}
	
	public boolean isFull()
	{
		if(top == arr.length-1)
			return true;
		return false;
	}
	
	public boolean push(int num)
	{
		if(isFull()==false)
		{
			top = top +1;
			arr[top]=num;
			
			return true;
		}
		return false;
	}
	
	public int pop()
	{
		
		if(isEmpty()==false)
		{
			int temp =arr[top];
			top = top -1;
			return temp;
		}
		return 0;
	}
	
}

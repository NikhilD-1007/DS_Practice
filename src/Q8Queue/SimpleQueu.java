package Q8Queue;

public class SimpleQueu <T>{

	private int front = -1;
	private int rear = -1;
	private int count = 0;
	private T arr[];
	
	public SimpleQueu(){
		arr = (T[])new Object[10];
		
	}
	
	public SimpleQueu(int size) {
		arr = (T[])new Object[size];
	}
	
	public boolean isEmpty()
	{
		//if(rear == -1)
		if(count == 0)
			return true;
		return false;
		
	}
	public boolean isFull()
	{
		//if(rear == arr.length-1 || front>rear)
		if(count == arr.length)
			return true;
		return false;
		
	}
	
	public boolean enqeue (T element)
	{
		if(isFull()==false)
		{
			rear = rear +1;
			arr[rear]=element;
			if(front == -1)
			{
				front = 0;
			}
			System.out.println("Enque "+element);
			count ++;
			return true;
		}
		else
			System.out.println("Stack is Full");
			return false;
	}
	
	public T dequeu ()
	{
		if(isEmpty()==false)
		{
			T temp = arr[front];
			front = front +1;
			count --;
			return temp;
		}
		else
			System.out.println("Stack is Empty");
			return null;
		
	}
	
	public void DisplayQueue()
	{
		int start = front;
		while(isEmpty()==false && arr[start]!=null)
		{
			System.out.print(arr[start]+" ");
			start = start +1;
		}
		System.out.println();
		
	}
	
}

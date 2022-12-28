package Q8Queue;

public class TesterQ {

	public static void main(String[] args) {
		
		SimpleQueu<Integer> qu = new SimpleQueu<Integer>();
		
		qu.enqeue(10);
		//System.out.println(qu.dequeu());
		qu.enqeue(20);
		qu.enqeue(30);
		System.out.println(qu.dequeu());
		System.out.println(qu.dequeu());
		System.out.println(qu.dequeu());
		qu.enqeue(40);
		qu.enqeue(50);
		qu.enqeue(60);
		qu.enqeue(70);
		qu.enqeue(80);
		qu.enqeue(90);
		System.out.println(qu.dequeu());
		System.out.println(qu.dequeu());
		//qu.enqeue(100);
		qu.DisplayQueue();
//		while(qu.dequeu()!=null)
//		{
//			System.out.print(qu.dequeu()+" ");
//		}
	}

}

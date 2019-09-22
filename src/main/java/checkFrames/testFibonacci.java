package checkFrames;

public class testFibonacci {
	
	public void fibonacci(int number){
		
		int first=1,second=0;
		int temp;
		
		for(int i=0;i<number;i++)
		{
			System.out.println(first);
			temp=first;
			first=first+second;
			second=temp;
		}
		
		int a=1,b=0;
		for(int j=0;j<number;j++)
		{
			System.out.println(a);
			a=a+b;
			b=a-b;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testFibonacci tb=new testFibonacci();
		tb.fibonacci(5);

	}

}

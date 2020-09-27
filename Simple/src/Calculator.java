import java.lang.Math;
public class Calculator {
	
	private static int j;
	public static void main(String[] args) 
	{
		System.out.println("HI");
		Calculator.addstatic(1, 2);
		
		Calculator c= new Calculator();
		c.add(3, 4);
		System.out.println(	java.lang.Math.sin(90));
	
		int a[] = {1,2,3,2,1};
		
				
		
	}	
		
	public static void primeNumber ()
	{		
		int a1[]= { 1,3,23,5,7,4,10,13,11,17,0 };
		for (int i = 0; i < a1.length; i++) 
		{
		
			if (a1[i]==0|a1[i]==1)
			{
				System.out.println("This number is not a prime number"+a1[i]);
			}
			else
			{
				boolean isprime=true;
				for (int j1=2;j<a1[i];j++)
				{
					if (a1[i]%j!=0)
					{
						isprime=false;
						break;
					}
					else
					{
						isprime=true;
						System.out.println("This is a prime number"+a1[i]);
					}
				}
				
			}
			}
		
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	
	public static int addstatic(int a, int b) {
		return a+b;
		
	}
	public static int substatic(int a, int b) {
		return a-b;
	}
	

}

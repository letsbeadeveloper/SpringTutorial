
public prime ()
		{
		int[] a= { 1,3,23,5,7,4,10,13,11,17,0 };
		for (int i = 0; i < a.length; i++) 
		{
		
			if (a[i]==0|a[i]==1)
			{
				System.out.println("This number is not a prime number"+a[i]);
			}
			else
			{
				boolean isprime=true;
				for (int j=2;j<a[i];j++)
				{
					if (a[i]%j!=0)
					{
						isprime=false;
						break;
					}
					else
					{
						isprime=true;
						System.out.println("This is a prime number"+a[i]);
					}
				}
				
			}
			}
		
	}
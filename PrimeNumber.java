package Ranjankrr;

public class PrimeNumber {
	
	public static void main(String args[])
	{
		int min=15;
		
		int max=80;
		
		for(int i=min;i<=max;i++)
		{
			if(Prime(i))
			{
				System.out.print(i+ "  ");
			}
		}
	}
	public static boolean Prime(int num) 
	{
		boolean flag = false;
		for(int i=2;i<=num/2;i++)
		{
			if(num % i == 0)
			{
				flag = true;
				break;
			}
		}
		
		if(!flag)
		{
			return true;
		}
		return false;
	}
}



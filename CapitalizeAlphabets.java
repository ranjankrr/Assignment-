package Ranjankrr;

import java.util.Scanner;

public class CapitalizeAlphabets {
	
public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your Characters:");
		String x=scan.nextLine();
		
		 CapitalizeAlphabets rishu=new  CapitalizeAlphabets();
		rishu.Symbols(x);
		}
	
	public void Symbols(String x) {
		
		char a[] =x.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(Character.isAlphabetic(a[i]))
			{
				
				a[i]=Character.toUpperCase(a[i]);
			}
			else {
				a[i]=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	}


}

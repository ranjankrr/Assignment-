package Ranjankrr;

import java.util.Scanner;


public class AlphaNumeric {
	
public static void main(String[] args) 
{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter  A String Value = ");
		String str=scan.nextLine();
		boolean flag=false;
		
		char c[]=str.toCharArray();
		boolean result=AlphaNumberic(c,str,flag);
		
		if(result==true)
		{
			System.out.println("Is Alpha-numbaric");
		}
		else {
			System.out.println("Is Not alpha-numbaric");
		}

	}
	
	public static boolean AlphaNumberic(char c[],String str,boolean num) {
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(c[i]))
			{
				num=true;
				
			}
			
		}
		return num;
	}

}




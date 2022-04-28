import java.util.*;
class Numval
{
	static int Value;
	public static int val()
	{
		get();
		return Value;
	}
	public static void get()
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		verify(s);

	}
	public static void verify(String s)
	{
		try
		{
		    Value = Integer.parseInt(s);

		} catch (NumberFormatException e)
		{
		    System.out.println("INVALID INPUT");
		    System.out.println("Enter a valid number as input");
		 	get();


		}
	}
	public static int valage()
	{
		getage();
		if(Value>=18)
		{
			return Value;
		}
		else
		{
			System.out.println("Age should be more than 18.....ENTER YOUR AGE AGAIN:");
			return valage();
		}
	}
	public static void getage()
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		verifyage(s);

	}
	public static void verifyage(String s)
	{
		try
		{
		    Value = Integer.parseInt(s);

		} catch (NumberFormatException e)
		{
		    System.out.println("INVALID INPUT");
		    System.out.println("AGE SHOULD BE A NUMBER");
		 	get();


		}
	}
}

class Numvaldate
{
	public static int date()
	{
		int temp=0;
		try
		{
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.charAt(2)=='/' && s.charAt(5)=='/' && Character.isDigit(s.charAt(0)) && Character.isDigit(s.charAt(1)) && Character.isDigit(s.charAt(3))&& Character.isDigit(s.charAt(4))&& Character.isDigit(s.charAt(6))&& Character.isDigit(s.charAt(7)))
		{
		char a=s.charAt(0);
		char b=s.charAt(1);
		char c=s.charAt(3);
		char d=s.charAt(4);
		char e=s.charAt(6);
		char f=s.charAt(7);
		String c1 = "" +a+b+c+d+e+f;
		temp = Integer.parseInt(c1);
		
		}
		else {
			System.out.println("Enter a valid date(DD/MM/YY):");
			date();
		}
		
		}
		catch(Exception e)
		{
			System.out.println("Enter a valid date(DD/MM/YY):");
			date();
		}
		return temp;
	}
	
}
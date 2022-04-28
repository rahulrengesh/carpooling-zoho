import java.util.*;
class Stringtokey
{
	int convert(String key)
	{
		String k=key.toLowerCase();
		if(k.equals("chennai"))
		{
			return 0;
		}
		else if(k.equals("kancheepuram"))
		{
			return 1;
		}
		else if(k.equals("vellore"))
		{
			return 2;
		}
		else if(k.equals("krishnagiri"))
		{
			return 3;
		}
		else if(k.equals("chengalpettu"))
		{
			return 4;
		}
		else if(k.equals("salem"))
		{
			return 5;
		}
		else if(k.equals("coimbatore"))
		{
			return 6;
		}
		else if(k.equals("kodaikanal"))
		{
			return 7;
		}
		else if(k.equals("namakkal"))
		{
			return 8;
		}
		else if(k.equals("cuddalore"))
		{
			return 9;
		}
		else if(k.equals("trichy"))
		{
			return 10;
		}
		else if(k.equals("thanjavur"))
		{
			return 11;
		}
		else if(k.equals("madurai"))
		{
			return 12;
		}
		else if(k.equals("tenkasi"))
		{
			return 13;
		}
		else if(k.equals("rameshwaram"))
		{
			return 14;
		}
		else if(k.equals("thirunalveli"))
		{
			return 15;
		}
		else if(k.equals("tuticorin"))
		{
			return 16;
		}
		else if(k.equals("kaniyakumari"))
		{
			return 17;
		}
		else 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Place not found enter a valid place:");
			System.out.println("Type the place again:");
			String out2=sc.nextLine();
			
			return convert(out2);
		}
		
		
	}
}
import java.util.*;
class carpooling
{
	static String adv="----->";
	public static void main(String args[])
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		Usercollect dc1=new Usercollect();
		dc1.dummy();
		Loggeddrivercollect ldc=new Loggeddrivercollect();
		ldc.dummy();
		Drivercselect dcs=new Drivercselect();
		dcs.dummy();
		while(true)
		{
			System.out.println(adv);
			System.out.println("*********************************");
			System.out.println("Enter your choice:");
			System.out.println("1)ADMIN APPLICATION");
			System.out.println("2)USER APPLICATION");
			System.out.println("*********************************");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("*********************************");
				System.out.println("Enter your choice:");
				System.out.println("1)LOGIN TO YOUR EXISTING ACCOUNT");
				System.out.println("2)DISPLAY (FOR PRODUCTION PURPOSE)");
				System.out.println("3)CLOSE");
				System.out.println("*********************************");
				int choice1=sc.nextInt();
				Admincollect ac=new Admincollect();
				if(choice1==1)
				{
					
					ac.checkdata();
					continue;
				}
				else if(choice1==2)
				{
					
					ac.display();
					
					continue;
				}
				else if(choice1==3)
				{
				
					
					continue;
				}
				else {
					System.out.println("Enter a valid choice");
				}
				
			case 2:
				Useroptions.show();
			
			
					
					
			default:
				System.out.println("*********************************");
				System.out.println("Enter a valid input");
				System.out.println("*********************************");
			}
			}
		
	}
		catch(Exception e)
		{
			System.out.println("Enter valid input");
			main(null);
		}
	}
}
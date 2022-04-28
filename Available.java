import java.util.Scanner;

class Available{
	void checkavail()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("###Ride details###");

		System.out.println("ENTER THE NUMBER OF SEATS REQUIRED:");
		int seat=Numval.val();
		System.out.println("TAMBARAM(0)---SANITORIUM(1)---CHROMPET(2)---PALLAVARAM(3)---TIRUSULAM(4)---St.THOMAS MOUNT(5)---GUINDY(6)---SAIDAPET(7)");
		System.out.println("ENTER THE STARTING LOCATION POINT:");
		int st=Numval.val();
		System.out.println("ENTER THE DESTINATION LOCATION POINT:");
		int dt=Numval.val();
		System.out.println("ENTER THE DATE(dd/mm/yy):");
		int date=Numvaldate.date();
		System.out.println("ENTER THE TIME(HH:MM:SS):");
		int time=Numvaldate.date();
		Driverallocate da=new Driverallocate();
		da.check(seat,st,dt,date,"dummy");
		System.out.println("1)Login/Register to book");
		System.out.println("2)Exit the application");
		int op=sc.nextInt();
		if(op==1)
		{
			System.out.println("1)LOGIN TO YOUR EXISTING ACCOUNT");
			System.out.println("2)REGISTER IF YOU ARE NEW");
			int choice2=sc.nextInt();
			Usercollect uc=new Usercollect();
			if(choice2==1)
			{
				
				uc.checkdata();
				
			}
			else if(choice2==2)
			{
			
				uc.getdata();
				
			}
		}
		else 
		{
			carpooling.main(null);
		}
	}
}
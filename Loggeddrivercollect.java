import java.util.*;
class Loggeddrivercollect {
	static Loggeddriver[] loggeddrivers=new Loggeddriver[10];
	static int Loggeddrivercount=2;
	Scanner sc=new Scanner(System.in);

	void dummy()
	{
		loggeddrivers[0]=new Loggeddriver("driver1",18,"M",9444423,1234,"1234","bmw",4,"123",0,10,100921,9,8,"-->",0);
		loggeddrivers[1]=new Loggeddriver("driver2",24,"M",9444424,1235,"1235","innova",3,"121",8,14,100921,9,4,"-->",0);
	}
	void getdata(String driver)
	{
		try
		{
		System.out.println("*********************************");
		
		
		String drivername=driver;
		System.out.println("YOUR DRIVER CODE IS:"+Loggeddrivercount);
		System.out.println("ENTER THE DRIVER AGE:");
		int driverage=Numval.valage();
		String g1;
		String drivergender="-";
		Boolean bool=true;
		while(bool)
		{
			System.out.println("ENTER THE USER GENDER(M/F):");
			g1=sc.nextLine();
				if(g1.equals("m")||g1.equals("f")||g1.equals("M")||g1.equals("F"))
				{
					drivergender=g1;
					bool=false;
				}
				else{
					System.out.println("Enter a valid input");
				}
		}
		Stringtokey stk=new Stringtokey();
		
		System.out.println("ENTER THE DRIVER PHONE NUMBER");
		int driverphone=Numval.val();
		
		
		System.out.println("ENTER THE AADHAR CARD NUMBER:");
		int driveraadhar=Numval.val();
		System.out.println("ENTER THE DRIVER LICENSE NUMBER:");
		String driverlicense=sc.nextLine();
		System.out.println("*********************************");
		System.out.println("###Car details###");
		System.out.println("ENTER THE CAR MODEL NAME:");
		String drivercarname=sc.nextLine();
		System.out.println("ENTER THE NUMBER OF SEATS AVAILABLE:");
		int seatavailable=Numval.val();
		System.out.println("ENTER THE CAR NUMBER:");
		String drivercarnumber=sc.nextLine();
		System.out.println("*********************************");
		System.out.println("###Ride details###");
		System.out.println("TYPE STARTING LOCATION POINT:");
		String out1=sc.nextLine();
		int driverstart=stk.convert(out1);
		System.out.println("TYPE DESTINATION LOCATION POINT:");
		String out2=sc.nextLine();
		int driverdest=stk.convert(out2);
		Shortmap.display(driverstart,driverdest);
		System.out.println("Enter 1 to continue with this path.....Enter 0 to add a stop");
		int choice=sc.nextInt();
		if(choice==1)
		{
			Shortmap.finalize(driverstart,driverdest,drivername);
		}
		else
		{
			Addstop as=new Addstop();
			as.add(driverstart,driverdest,drivername);
			
			
		}
		System.out.println("ENTER THE DATE:(dd/mm/yy)");
		int driverdate=Numvaldate.date();
		System.out.println("ENTER THE TIME:(HH)");
		int drivertime=Numval.val();
		System.out.println("ENTER THE PAYMENT:");
		int driverpayment=Numval.val();
		System.out.println("*********************************");
		
		int ban=0;
		String complain="-->";
		loggeddrivers[Loggeddrivercount]=new Loggeddriver(drivername,driverage,drivergender,driverphone,driveraadhar,driverlicense,drivercarname,seatavailable,drivercarnumber,driverstart,driverdest,driverdate,drivertime,driverpayment,complain,ban);
		Loggeddrivercount=Loggeddrivercount+1;
		System.out.println("Ride added....");
		Usercollect dc=new Usercollect();
		dc.info(driver);
		
		}
		catch(Exception e)
		{
			System.out.println("ERROR OCCURED");
			getdata(driver);
		}
	}
	
	void displaypayment(String a,int b)
	{
		for(int i=0;i<Loggeddrivercount;i++)
		{
			if(a.equals(loggeddrivers[i].drivername) && b==i)
			{
				System.out.println(loggeddrivers[i].collectedpayment);
				
			}
		}
	}
	void reportdriver()
	{
		int f=0;
		System.out.println("Enter the driver name:");
		String key=sc.nextLine();
		for(int i=0;i<Loggeddrivercount;i++)
		{
			if(key.equals(loggeddrivers[i].drivername))
			{
				System.out.println("Type your complaint");
				String temp=sc.nextLine();
				loggeddrivers[i].complain=loggeddrivers[i].complain+temp;
				loggeddrivers[i].complain=loggeddrivers[i].complain+"--";
				f=1;
			}
		}
		if(f==0)
		{
			System.out.println("username not found");
		}
	}
	
}
import java.util.Scanner;
class Loggedusercollect{
	static Loggeduser[] loggedusers=new Loggeduser[10];
	static int Loggedusercount=0;
	
	Scanner sc=new Scanner(System.in);
	void getdata(String user)
	{
	
		String username=user;
		Stringtokey stk=new Stringtokey();
		System.out.println("ENTER THE USER AGE:");
		int userage=Numval.val();
		String g1;
		String usergender="-";
		Boolean bool=true;
		while(bool)
		{
			System.out.println("ENTER THE USER GENDER(M/F):");
			g1=sc.nextLine();
				if(g1.equals("m")||g1.equals("f")||g1.equals("M")||g1.equals("F"))
				{
					usergender=g1;
					bool=false;
				}
				else{
					System.out.println("Enter a valid input");
				}
		}
		System.out.println("ENTER YOUR MOBILE NUMBER:");
		String mobilenum=sc.nextLine();
		System.out.println("ENTER THE NUMBER OF SEATS REQUIRED:");
		int seatrequired=Numval.val();
		System.out.println("###Ride details###");
		
		System.out.println("ENTER THE STARTING LOCATION POINT:");
		String out1=sc.nextLine();
		int userstart=stk.convert(out1);

		System.out.println("ENTER THE DESTINATION LOCATION POINT:");
		String out2=sc.nextLine();
		int userdest=stk.convert(out2);

		System.out.println("ENTER THE DATE(dd/mm/yy):");
		int userdate=Numvaldate.date();
		
		String complain="-->";
		loggedusers[Loggedusercount]=new Loggeduser(username,userage,usergender,seatrequired,userstart,userdest,userdate,complain,mobilenum);
		System.out.println("Available rides:");
		Driverallocate da=new Driverallocate();
		Loggedusercount=Loggedusercount+1;
		int m=da.check(seatrequired,userstart,userdest,userdate,username);
		
		Bookedride br=new Bookedride();
		br.bookride(username,userstart,userdest,seatrequired,userdate,m);
		
		
	}
	
	void reportuser(String uname)
	{
		int f=0;
		System.out.println("Enter the user name:");
		String key=sc.nextLine();
		if(!key.equals(uname))
		{
		for(int i=0;i<Loggedusercount;i++)
		{
			if(key.equals(loggedusers[i].username))
			{
				System.out.println("Type your complaint");
				String temp=sc.nextLine();
				loggedusers[i].complain=loggedusers[i].complain+temp;
				loggedusers[i].complain=loggedusers[i].complain+"--";
				f=1;
			}
		}
		if(f==0)
		{
			System.out.println("username not found");
		}
		}
		else {
			System.out.println("YOU CANT RATE FOR YOUR OWN ACCOUNT");
		}
	}
	
}


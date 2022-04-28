import java.util.Scanner;
public class Drivercollect extends Loggeddrivercollect{
	static Driver[] drivers=new Driver[10];
	static int Drivercount=2;
	
	Scanner sc=new Scanner(System.in);
	void dummy()
	{
		drivers[0]=new Driver("driver1","123");
		drivers[1]=new Driver("driver2","123");
	}
	
	public void getdata()
	{
		
		String uname;
		String pass;
		int t=0;
		System.out.println("*********************************");
		System.out.println("Enter the username:");
		uname=sc.nextLine();
		for(int i=0;i<Drivercount;i++)
		{
			if(uname.equals(drivers[i].uname))
			{
				t=1;
				break;
			}
			
		}
		if(t==1)
		{
			System.out.println("This username already exist try another one:");
			Drivercollect dc=new Drivercollect();
			dc.getdata();
		}
		else {
			System.out.println("Enter the password:");
			pass=sc.nextLine();
			System.out.println("*********************************");
			drivers[Drivercount]=new Driver(uname,pass);
			Drivercount=Drivercount+1;
			Drivercollect dc=new Drivercollect();
			dc.info(uname);
		}
		
		
		
		
	}
	public void display()
	{
		for(int i=0;i<Drivercount;i++)
		{
			System.out.println("username:"+drivers[i].uname);
			System.out.println("password:"+drivers[i].pass);
		}
	}
	public void checkdata()
	{
		System.out.println("*********************************");
		System.out.println("Enter the username:");
		String user=sc.nextLine();
		System.out.println("Enter the password:");
		String pass=sc.nextLine();
		System.out.println("*********************************");
		int f=0;
		for(int i=0;i<Drivercount;i++)
		{
			if(user.equals(drivers[i].uname) && (pass.equals(drivers[i].pass)))
			{
				f=1;
				break;
			}
		}
		if(f==0)
		{
			System.out.println("*********************************");
			System.out.println("username not found");
			System.out.println("*********************************");
		}
		else {
			System.out.println("*********************************");
			System.out.println("username found");
			System.out.println("*********************************");
			for(int i=0;i<Loggeddrivercount;i++)
			{
				if(user.equals(loggeddrivers[i].drivername))
				{
					
					System.out.println(loggeddrivers[i].cancel);
				}
			}
			Drivercollect dc=new Drivercollect();
			dc.info(user);
			
					
					
			}
			
		}
	void info(String uname)
	{
		
	}
		
	}
	
		

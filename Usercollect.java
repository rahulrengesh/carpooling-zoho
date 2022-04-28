import java.util.Scanner;
public class Usercollect {
	static User[] users=new User[10];
	static int Usercount=2;
	Scanner sc=new Scanner(System.in);
	void dummy()
	{
		users[0]=new User("driver1","123",0);
		users[1]=new User("driver2","123",0);
	}
	public void getdata()
	{
		String uname;
		String pass;
		System.out.println("*********************************");
		System.out.println("Enter the username:");
		uname=sc.nextLine();
		int t=0;
		for(int i=0;i<Usercount;i++)
		{
			if(uname.equals(users[i].uname))
			{
				t=1;
				break;
			}
			
		}
		if(t==1)
		{
			System.out.println("*********************************");
			System.out.println("This username already exist try another one:");
			System.out.println("*********************************");
			
			getdata();
		}
		else
		{
			System.out.println("Enter the password:");
			pass=sc.nextLine();
			System.out.println("*********************************");
			users[Usercount]=new User(uname,pass,0);
			Usercount=Usercount+1;
			Usercollect uc1=new Usercollect();
			uc1.info(uname);
			
			
			
			
		}
		
	}
	public void display()
	{
		for(int i=0;i<Usercount;i++)
		{
			System.out.println("*********************************");
			System.out.println("username:"+users[i].uname);
			System.out.println("password:"+users[i].pass);
			System.out.println("*********************************");
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
		for(int i=0;i<Usercount;i++)
		{
			if(user.equals(users[i].uname) && (pass.equals(users[i].pass))&& (users[i].ban==1))
			{
				System.out.println("YOU ARE BANNED BY ADMIN....KINDLY CONTACT rahul@gmail.com for more details");
				f=-1;
				break;
				
			}
			else if(user.equals(users[i].uname) && (pass.equals(users[i].pass))&& (users[i].ban==0))
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
			Useroptions.show();
		}
		else if(f==1){
			System.out.println("username found");
			Usercollect uc1=new Usercollect();
			uc1.info(user);
			int opt=sc.nextInt();
			Loggedusercollect luc=new Loggedusercollect();
			
			
			
		}
	}
	public void info(String uname)
	{
		System.out.println("*********************************");

		System.out.println("1)BOOK A RIDE");
		System.out.println("2)CHECK/CANCEL YOUR RIDE");
		System.out.println("3)RATE YOUR PREVIOUS RIDES");
		System.out.println("4)REPORT A COMPLAINT AGAINST DRIVER");
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("5)START A RIDE:");
		System.out.println("6)CHECK/CANCEL YOUR BOOKINGS:");
		System.out.println("7)CHECK YOUR PAYMENTS:");
		System.out.println("8)REPORT USER");
		System.out.println("9)ADD A MISSING PLACE");
		System.out.println("10)LOG OUT");
		System.out.println("*********************************");
		int opt1=sc.nextInt();
		if(opt1==1)
		{
			Loggedusercollect luc=new Loggedusercollect();
			luc.getdata(uname);
		}
		else if(opt1==2){
			Bookedride br=new Bookedride();
			br.checkdd();
			System.out.println("1)Cancel a ride");
			System.out.println("2)Log out");
			int op=sc.nextInt();
			if(op==1)
			{
				Bookedride br1= new Bookedride();
				br1.cancelrideuser();
			}
			
		}
		else if(opt1==3)
		{
			System.out.println("*********************************");
			System.out.println("Enter your booking id:");
			int bi=sc.nextInt();
			System.out.println("Enter your review out of 5:");
			int rev=sc.nextInt();
			System.out.println("*********************************");
			Bookedride br=new Bookedride();
			br.review(bi,rev,uname);
			info(uname);
		}
		else if(opt1==4)
		{
			Loggeddrivercollect ldc=new Loggeddrivercollect();
			ldc.reportdriver();
			info(uname);
		}
		else if(opt1==5)
		{
			Loggeddrivercollect ldc=new Loggeddrivercollect();
			ldc.getdata(uname);
		}
		else if(opt1==6)
		{
			Bookedride br=new Bookedride();
			br.ridecheck();
			System.out.println("1)Cancel your ride");
			System.out.println("2)Cancel for a particular user");
			System.out.println("3)Log out");
			int op=sc.nextInt();
			if(op==1)
			{
				Bookedride br1=new Bookedride();
				br1.cancelridedriver();
			}
			else if(op==2)
			{
				Bookedride br1=new Bookedride();
				br1.cancelparticularuser(uname);
			}
			
			
			
		}
		else if(opt1==7)
		{
			Bookedride br=new Bookedride();
			br.totalpayment();
			info(uname);
		}
		else if(opt1==8)
		{
			Loggedusercollect luc=new Loggedusercollect();
			luc.reportuser(uname);
			
		}
		else if(opt1==9)
		{
			Addplace ap=new Addplace();
			ap.request(uname);
		}
		else if(opt1==10)
		{
			System.out.println("Logging out.......");
			carpooling.main(null);
		}
		else
		{
			System.out.println("Enter a valid input");
			info(uname);
		}
	}
	
	
	
		
}	

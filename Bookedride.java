import java.util.*;
public class Bookedride extends Loggeddrivercollect{
	static Rides[] rides=new Rides[10];
	static int ridecount=0;
	static Waiting[] waitings=new Waiting[10];
	static int waitcount=0;
	void bookride(String uname,int userstart,int userdest,int seatrequired,int userdate,int m)
	{
		if(m==1)
		{
		System.out.println("Enter the driver name to confirm booking....to stop booking type(quit):");
		String in=sc.nextLine();
	
		int dstart;
		int ddest;
		String dcode;
		String dcname;
		int f=0;
		if(in.equals("quit"))
		{
			Usercollect uc1=new Usercollect();
			uc1.info(uname);
		}
		
		else {
			Getmissing gm=new Getmissing();
			gm.get(in,userstart,userdest,uname);
			System.out.println("Enter your comments:");
			String com=sc.nextLine();
		int payment=0;
		Updatedval uv=new Updatedval();
		int userstart1=uv.getuserstart(uname);
		int userdest1=uv.getuserdest(uname);
		for(int i=0;i<Loggeddrivercount;i++)
		{
			if(in.equals(loggeddrivers[i].drivername))
			{
				int cash=loggeddrivers[i].driverpayment;
				Calculatekm ck=new Calculatekm();
				int kms=ck.calculate(userstart1,userdest1,loggeddrivers[i].drivername);
				payment=kms*seatrequired*cash;
				
			}
		}
		if(payment==0)
		{
			System.out.println("AS THE EXACT RIDE IS NOT FOUND PAYMENT IS NEGOTIABLE");
		}
		else
		{
		System.out.println("****************");
		System.out.println("YOUR PAYMENT FOR THIS RIDE WILL BE "+payment);
		}
		System.out.println("Press 1 to continue your booking press -1 to check for different ride:");
		int uop=sc.nextInt();
		
		if(uop==1)
		{
		
		for(int i=0;i<Loggeddrivercount;i++)
		{
			if(in.equals(loggeddrivers[i].drivername) && (!in.equals("quit")))
			{
				dstart=loggeddrivers[i].driverstart;
				ddest=loggeddrivers[i].driverdest;
				dcode=loggeddrivers[i].drivercode;
				dcname=loggeddrivers[i].drivercarname;
				for(int k=userstart;k<userdest;k++)
				{
					loggeddrivers[i].seatavailable=loggeddrivers[i].seatavailable-seatrequired;
				}
				
				rides[ridecount]=new Rides(in,uname,userstart1,userdest1,dstart,ddest,com,dcode,dcname,seatrequired);
				System.out.println("Booked");
				System.out.println("Your booking id:"+ridecount);
				Bookedride br=new Bookedride();
				br.payment(userstart1,userdest1,seatrequired,in,ridecount);
				ridecount=ridecount+1;
				f=1;
				Usercollect uc1=new Usercollect();
				uc1.info(uname);
				break;
				
			}
		}
			
		}
		else if(uop==-1)
		{
			Driverallocate da=new Driverallocate();
		
			int m1=da.check(seatrequired,userstart,userdest,userdate,uname);
			
			Bookedride br=new Bookedride();
			br.bookride(uname,userstart,userdest,seatrequired,userdate,m1);
		}
		}
		
		if(f==0){
			System.out.println("*********************************");
			System.out.println("Enter the driver name properly:");
			System.out.println("*********************************");
			Bookedride br=new Bookedride();
			br.bookride(uname, userstart, userdest,seatrequired,userdate,m);
			
		}
		
	
		
		
}	
		else if(m==0){
			System.out.println("NO RIDES FOUND");
			System.out.println("Type add to include your desired ride in waiting list");
			String out=sc.nextLine();
			if(out.equals("add"))
			{
			System.out.println("Ride is added to waiting list");
			waitings[waitcount]=new Waiting(uname,userstart,userdest,seatrequired,userdate);
			}
		}
		
		
	}
	void payment(int userstart,int userdest,int seatrequired,String in,int key)
	{
		for(int i=0;i<Loggeddrivercount;i++)
		{
			if(in.equals(loggeddrivers[i].drivername))
			{
				int cash=loggeddrivers[i].driverpayment;
				Calculatekm ck=new Calculatekm();
				int kms=ck.calculate(userstart,userdest,loggeddrivers[i].drivername);
				rides[key].payment=kms*seatrequired*cash;
				
			}
		}
	}
	void ridecheck()
	{
		System.out.println("*********************************");
		System.out.println("Enter your name:");
		String s1=sc.nextLine();
		System.out.println("Enter your Driver code:");
		int s2=sc.nextInt();
		int f=0;
		
		if(loggeddrivers[s2].ban==1)
		{
			System.out.println("You are banned contact admin for reason(rahul@gmail.com)");
			f=1;
		}
		if(f==1)
		{
			carpooling.main(null);
		}
			
			
		
		else if(f==0)
		{
		System.out.println("*********************************");
		System.out.println("Cancelled rides");
		for(int i=0;i<ridecount;i++)
		{
			if((s1.equals(rides[i].drivername)))
			{
				
				System.out.println("***************");
				if(rides[i].username.equals("user cancelled"))
				{
					System.out.println("*********************************");
					System.out.println("User name:"+rides[i].username);
					System.out.println("User start point:"+rides[i].userstart);
					System.out.println("User destination point:"+rides[i].userdest);
					System.out.println("Payment collected:"+rides[i].payment);
					System.out.println("Comment:"+rides[i].comment);
					System.out.println("**********************************");
				}
				
				}
				
			}
		System.out.println("Current rides");
		for(int i=0;i<ridecount;i++)
		{
			if((s1.equals(rides[i].drivername)))
			{
				
				System.out.println("***************");
				if(! rides[i].username.equals("user cancelled"))
				{
				System.out.println("*********************************");
				System.out.println("User name:"+rides[i].username);
				System.out.println("User start point:"+rides[i].userstart);
				System.out.println("User destination point:"+rides[i].userdest);
				System.out.println("Payment collected:"+rides[i].payment);
				System.out.println("Comment:"+rides[i].comment);
				System.out.println("**********************************");
			
				}
			}
				
		}
		}
			
	}
	

	void checkdd()
	{
		System.out.println("*********************************");
		System.out.println("Enter your booking id:");
		System.out.println("*********************************");
		int key=sc.nextInt();
		for(int i=0;i<ridecount;i++)
		{
			if(key==i)
			{
				System.out.println("*********************************");
				System.out.println("Driver name:"+rides[i].drivername);
				System.out.println("Driver start point:"+rides[i].driverstart);
				System.out.println("Driver destination point:"+rides[i].driverdest);
				System.out.println("User name:"+rides[i].username);
				System.out.println("User start point:"+rides[i].userstart);
				System.out.println("User destination point:"+rides[i].userdest);
				System.out.println("Amount to be paid:"+rides[i].payment);
				System.out.println("**********************************");
			}
			
		}
	}
	void review(int bi,int rev,String uname)
	{
		for(int i=0;i<ridecount;i++)
		{
			if(bi==i)
			{
				if(!rides[i].drivername.equals(uname))
				{
					rides[i].review=rev;
				}
				else
				{
					System.out.println("YOU CANT RATE YOUR OWN RIDES");
				}
				
			}
		}
	}
	void totalpayment()
	{
		System.out.println("*********************************");
		System.out.println("Enter your name:");
		String dname=sc.nextLine();
		System.out.println("Enter the driver code:");
		String dcode=sc.nextLine();
		System.out.println("*********************************");
		int totalcost=0;
		for(int i=0;i<ridecount;i++)
		{
			if((dname.equals(rides[i].drivername))||(dcode.equals(rides[i].dcode)))
			{
				totalcost=totalcost+rides[i].payment;
				
			}
		}
		System.out.println("*********************************");
		System.out.println("Total payment:"+totalcost);
		System.out.println("*********************************");
	}
	void cancelrideuser()
	{
		System.out.println("Enter your username:");
		String un=sc.nextLine();
		
		System.out.println("*********************************");
		System.out.println("Enter your booking id:");
		System.out.println("*********************************");
		int key=sc.nextInt();
		for(int i=0;i<ridecount;i++)
		{
			if(key==i && rides[i].username.equals(un))
			{
				System.out.println("Ride is cancelled");
				rides[i].username="user cancelled";
				rides[i].userdest=-1;
				rides[i].userstart=-1;
				rides[i].comment="user cancelled";
				rides[i].payment=0;
				for(int j=0;j<Loggeddrivercount;j++)
				{
					if(rides[i].drivername.equals(loggeddrivers[i].drivername))
					{
						loggeddrivers[i].seatavailable=loggeddrivers[i].seatavailable+rides[i].seat;
						loggeddrivers[i].collectedpayment=loggeddrivers[i].collectedpayment-rides[i].payment;
					}
					
				}
			}
			else {
				System.out.println("Enter a valid booking id");
			}
		}
	}
	void cancelridedriver()
	{
		System.out.println("Enter drivername:");
		String un=sc.nextLine();
		System.out.println("Enter the driver code");
		String dc=sc.nextLine();
		
		for(int i=0;i<ridecount;i++)
		{
			if(rides[i].drivername.equals(un))
			{
				System.out.println("Ride is cancelled");
				rides[i].drivername="driver cancelled";
				rides[i].driverdest=-1;
				rides[i].driverstart=-1;
				rides[i].payment=0;
				for(int j=0;j<Loggeddrivercount;j++)
				{
					if(rides[i].drivername.equals(loggeddrivers[i].drivername))
					{
						loggeddrivers[i].seatavailable=loggeddrivers[i].seatavailable+rides[i].seat;
						loggeddrivers[i].collectedpayment=loggeddrivers[i].collectedpayment-rides[i].payment;
						
					}
					
				}
				Drivercollect dc1=new Drivercollect();
				dc1.info(un);
			}
			else {
				System.out.println("Check the details again");
				Drivercollect dc1=new Drivercollect();
				dc1.info(un);
			}
		}
	}
	void cancelparticularuser(String drivername)
	{
		System.out.println("Enter the name of user");
		String inp=sc.nextLine();
		for(int i=0;i<ridecount;i++)
		{
			if(inp.equals(rides[i].username)&&rides[i].drivername.equals(drivername))
			{
				rides[i].drivername="driver cancelled";
				rides[i].driverstart=-1;
				rides[i].driverdest=-1;
				rides[i].payment=0;
				System.out.println("cancelled your ride for"+rides[i].username);
				Usercollect uc=new Usercollect();
				uc.info(drivername);
				
			}
		}
	}
}
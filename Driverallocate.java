import java.util.*;
class Driverallocate extends Loggeddrivercollect
{
	int f=0;
	int check(int seatrequire,int userstart,int userdest,int date,String uname)
	{
		int s=0;
		int k;
		for(int i=0;i<Loggeddrivercount;i++)
		{
			if(loggeddrivers[i].drivername!=uname)
			{
			if(loggeddrivers[i].driverdate==date)
			{
				
			
				

					if(loggeddrivers[i].seatavailable>=seatrequire)
					{
						String dname=loggeddrivers[i].drivername;
						Pathcheck1 pc1=new Pathcheck1();
						k=pc1.path(userstart,userdest,dname);
						if(k==1)
						{
							System.out.println();
							System.out.println("**********************");
							System.out.println("Driver Name:"+loggeddrivers[i].drivername);
							System.out.println("Driver Age:"+loggeddrivers[i].driverage);
							System.out.println("Driver Gender:"+loggeddrivers[i].drivergender);
							System.out.println("Driver car model:"+loggeddrivers[i].drivercarname);
							System.out.println("Driver payment per km:"+loggeddrivers[i].driverpayment);
							System.out.println("Driver time:"+loggeddrivers[i].drivertime);
							System.out.println("**********************");
							s=1;
						}
						
					
						Pathcheck pc=new Pathcheck();
						k=pc.path(userstart,userdest,dname);
						if(k==1)
						{
							System.out.println();
							System.out.println("**********************");
							System.out.println("Driver Name:"+loggeddrivers[i].drivername);
							System.out.println("Driver Age:"+loggeddrivers[i].driverage);
							System.out.println("Driver Gender:"+loggeddrivers[i].drivergender);
							System.out.println("Driver car model:"+loggeddrivers[i].drivercarname);
							System.out.println("Driver car number:"+loggeddrivers[i].drivercarnumber);
							System.out.println("Driver payment per km:"+loggeddrivers[i].driverpayment);
							System.out.println("Driver time:"+loggeddrivers[i].drivertime);
							System.out.println("**********************");
							s=1;
						}
						Pathcheck2 pc2=new Pathcheck2();
						k=pc2.path(userstart,userdest,dname);
						if(k==1)
						{
							System.out.println();
							System.out.println("**********************");
							System.out.println("Driver Name:"+loggeddrivers[i].drivername);
							System.out.println("Driver Age:"+loggeddrivers[i].driverage);
							System.out.println("Driver Gender:"+loggeddrivers[i].drivergender);
							System.out.println("Driver car model:"+loggeddrivers[i].drivercarname);
							System.out.println("Driver car number:"+loggeddrivers[i].drivercarnumber);
							System.out.println("Driver payment per km:"+loggeddrivers[i].driverpayment);
							System.out.println("Driver time:"+loggeddrivers[i].drivertime);
							System.out.println("**********************");
							s=1;
						}
						Pathcheck3 pc3=new Pathcheck3();
						k=pc3.path(userstart,userdest,dname);
						if(k==1)
						{
							System.out.println();
							System.out.println("**********************");
							System.out.println("Driver Name:"+loggeddrivers[i].drivername);
							System.out.println("Driver Age:"+loggeddrivers[i].driverage);
							System.out.println("Driver Gender:"+loggeddrivers[i].drivergender);
							System.out.println("Driver car model:"+loggeddrivers[i].drivercarname);
							System.out.println("Driver car number:"+loggeddrivers[i].drivercarnumber);
							System.out.println("Driver payment per km:"+loggeddrivers[i].driverpayment);
							System.out.println("Driver time:"+loggeddrivers[i].drivertime);
							System.out.println("**********************");
							s=1;
						}
						Pathcheck4 pc4=new Pathcheck4();
						k=pc4.path(userstart,userdest,dname);
						if(k==1)
						{
							System.out.println();
							System.out.println("**********************");
							System.out.println("Driver Name:"+loggeddrivers[i].drivername);
							System.out.println("Driver Age:"+loggeddrivers[i].driverage);
							System.out.println("Driver Gender:"+loggeddrivers[i].drivergender);
							System.out.println("Driver car model:"+loggeddrivers[i].drivercarname);
							System.out.println("Driver car number:"+loggeddrivers[i].drivercarnumber);
							System.out.println("Driver payment per km:"+loggeddrivers[i].driverpayment);
							System.out.println("Driver time:"+loggeddrivers[i].drivertime);
							System.out.println("**********************");
							s=1;
						}
						
					
				}
			}
			}
		}
		if(s==0)
		{
			return 0;
		}
		else {
			return 1;
		}
	}
	
}
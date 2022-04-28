import java.util.*;
class Getmissing extends Loggedusercollect
{
	Changedpoint cp=new Changedpoint();
	void get(String key,int userstart,int userdest,String uname)
	{
		cp.getchange(userstart,userdest,key,uname);
		
	}
}
class Changedpoint extends Drivercselect
{
	
	void getchange(int userstart,int userdest,String key,String uname)
	{
		int f=0;
		int val=-1;
		for(int i=0;i<driverpathcounts;i++)
		{
			if(key.equals(driverpaths[i].driver))
			{
				
				for(int j=0;j<driverpaths[i].path.length;j++)
				{
					if(userstart==driverpaths[i].path[j])
					{
						f=1;
						break;
					}
					
				}
				
				if(f==0)
				{
					Addnew an =new Addnew();
					an.addsource(uname,key,userstart,userdest);
				}
				
				else if(f==1)
				{
					for(int j=0;j<driverpaths[i].path.length;j++)
					{
						if(userstart==driverpaths[i].path[j])
						{
							f=2;
							break;
						}
						
					}
					if(f==1)
					{
						Addnew an =new Addnew();
						an.adddest(uname,key,userstart,userdest);
					}
				}
			}
		}
		
		
	}
}
class Addnew extends Loggedusercollect
{
	void addsource(String uname,String key,int userstart,int userdest)
	{

		Stringtokey stk=new Stringtokey();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NEW STARTING LOCATION POINT:");
		String out1=sc.nextLine();
		int val=stk.convert(out1);
		Getmissing gm=new Getmissing();
		gm.get(key, val, userdest, uname);
		
		
		for(int i=0;i<Loggedusercount;i++)
		{
			if(uname.equals(loggedusers[i].username))
			{
				loggedusers[i].userstart=val;
			}
		}
		
	}
	void adddest(String uname,String key,int userstart,int userdest)
	{

		Stringtokey stk=new Stringtokey();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NEW DESTINATION LOCATION POINT:");
		String out1=sc.nextLine();
		int val=stk.convert(out1);
		Getmissing gm=new Getmissing();
		gm.get(key, userstart, val, uname);
		for(int i=0;i<Loggedusercount;i++)
		{
			if(uname.equals(loggedusers[i].username))
			{
				loggedusers[i].userdest=val;
			}
		}
	}
}
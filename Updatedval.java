class Updatedval extends Loggedusercollect
{
	int getuserstart(String uname)
	{
		int f=-1;
		for(int i=0;i<Loggedusercount;i++)
		{
			if(uname.equals(loggedusers[i].username))
			{
				f=loggedusers[i].userstart;
				break;
			}
		}
		if(f==-1)
		{
			return getuserstart(uname);
		}
		else
		{
			return f;
		}
	}
	int getuserdest(String uname)
	{
		int f=-1;
		for(int i=0;i<Loggedusercount;i++)
		{
			if(uname.equals(loggedusers[i].username))
			{
				f=loggedusers[i].userdest;
				break;
			}
		}
		if(f==-1)
		{
			return getuserdest(uname);
		}
		else
		{
			return f;
		}
	}
}
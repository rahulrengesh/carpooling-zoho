import java.util.Scanner;
class Admindriverban extends Usercollect
{
static void bandriver()
	{
		int f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the driver name to ban:");
		String bname=sc.nextLine();
		for(int i=0;i<Usercount;i++)
		{
			if(users[i].uname.equals(bname))
			{
				users[i].ban=1;
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("Banned");
			
		}
		else
		{
			System.out.println("Name not found.....enter the name again:");
		}
	}
}
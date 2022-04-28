class Loggeduser{
	String username;
	int userage;
	String usergender;
	int seatrequire;
	int userstart;
	int userdest;
	int userdate;
	String complain;
	String mobilenum;
	public Loggeduser(String username,int userage,String usergender,int seatrequire,int userstart,int userdest,int userdate,String complain,String mobilenum)
	{
		this.username=username;
		this.userage=userage;
		this.usergender=usergender;
		this.seatrequire=seatrequire;
		this.userstart=userstart;
		this.userdest=userdest;
		this.userdate=userdate;
		this.mobilenum=mobilenum;
		this.complain=complain;
	}
}
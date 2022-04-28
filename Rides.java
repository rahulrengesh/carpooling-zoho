public class Rides
{
	String drivername;
	String username;
	String comment;
	int userstart;
	int userdest;
	int driverstart;
	int driverdest;
	String dcode;
	int payment;
	int review;
	String dcname;
	int seat;
	public Rides(String drivername,String username,int userstart,int userdest,int driverstart,int driverdest,String comment,String dcode,String dcname,int seat)
	{
		this.drivername=drivername;
		this.username=username;
		this.userstart=userstart;
		this.driverstart=driverstart;
		this.userdest=userdest;
		this.driverdest=driverdest;
		this.comment=comment;
		this.dcode=dcode;
		this.dcname=dcname;
		this.seat=seat;
	}
}
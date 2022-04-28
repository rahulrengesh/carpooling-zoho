import java.util.*;
public class Loggeddriver{
	String drivername;
	String drivercode;
	int driverage;
	String drivergender;
	int driveraadhar;
	String driverlicense;
	String drivercarname;
	int seatavailable;
	String drivercarnumber;
	int driverstart;
	int driverdest;
	int driverdate;
	int drivertime;
	int driverpayment;
	int collectedpayment;
	String username="-->";
	String comment="-->";
	String cancel="-->";
	int reviewpoints;
	String complain;
	int drivernumber;
	int ban;
	public Loggeddriver(String drivername,int driverage,String drivergender,int drivernumber,int driveraadhar,String driverlicense,String drivercarname,int seatavailable,String drivercarnumber,int driverstart,int driverdest,int driverdate,int drivertime,int driverpayment,String complain,int ban)
	{
		this.drivername=drivername;
		this.driverage=driverage;
		this.drivergender=drivergender;
		this.driveraadhar=driveraadhar;
		this.driverlicense=driverlicense;
		this.drivercarname=drivercarname;
		this.seatavailable=seatavailable;
		this.drivercarnumber=drivercarnumber;
		this.driverstart=driverstart;
		this.driverdest=driverdest;
		this.driverdate=driverdate;
		this.drivertime=drivertime;
		this.driverpayment=driverpayment;
		this.complain=complain;
		this.ban=ban;
		this.drivernumber=drivernumber;
	}
	
	
}
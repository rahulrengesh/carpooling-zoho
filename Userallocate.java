class Userallocate extends Loggeddrivercollect{
	void userreflect()
	{
		System.out.println("Enter the driver name to check your ride:");
		String val=sc.next();
		for(int i=0;i<Loggeddrivercount;i++)
		{
			if(val.equals(loggeddrivers[i].drivername))
			{
			System.out.println("driver name:"+loggeddrivers[i].drivername);
			System.out.println("driver age:"+loggeddrivers[i].driverage);
			System.out.println("start point:"+loggeddrivers[i].driverstart);
			System.out.println("destination point:"+loggeddrivers[i].driverdest);
			System.out.println("time of ride:"+loggeddrivers[i].drivertime);
			System.out.println("date of ride:"+loggeddrivers[i].driverdate);
			System.out.println("********************");
			}
		}
	}
}
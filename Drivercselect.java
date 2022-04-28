class Drivercselect
{
	static Driverpath[] driverpaths=new Driverpath[10];
	static int driverpathcounts=2;
	int[]a1= {0,1,2,3,5,8,10};
	int[]a2= {8,9,11,10,7,12,14};
	void dummy()
	{
		driverpaths[0]=new Driverpath(2,a1,"driver1");
		driverpaths[1]=new Driverpath(3,a2,"driver2");
	}
	public void select(int c,int[] intArray,String dn)
	{
		driverpaths[driverpathcounts]=new Driverpath(c,intArray,dn);
		driverpathcounts=driverpathcounts+1;
	}
}
		
		
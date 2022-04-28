class Pathcheck extends Drivercselect
{
	public int path(int userstart,int userdest,String dname)
	{
		Keytostring kts=new Keytostring();
		int f=0;
		for(int i=0;i<driverpathcounts;i++)
		{
			if(dname.equals(driverpaths[i].driver))
			{
				
				for(int j=0;j<driverpaths[i].path.length;j++)
				{
					if(userstart==driverpaths[i].path[j])
					{
						for(int k=j;k<driverpaths[i].path.length;k++)
						{
							if(userdest==driverpaths[i].path[k])
							{
								System.out.println("##PRIORITY 2##");
								System.out.println("Driver's path:");
								System.out.println("***************");
								for(int g=0;g<driverpaths[i].path.length;g++)
								{
									kts.convert(driverpaths[i].path[g]);
									System.out.print("--->");
								}
								f=1;
								
							}
						}
					}
				}

			}
		}
		if(f==1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
}
class Pathcheck1 extends Drivercselect
{
	public int path(int userstart,int userdest,String dname)
	{
		Keytostring kts=new Keytostring();
		int f=0;
		for(int i=0;i<driverpathcounts;i++)
		{
			if(dname.equals(driverpaths[i].driver))
			{
				if(userstart==driverpaths[i].path[0] && userdest==driverpaths[i].path[driverpaths[i].path.length-1])
				{
				
								System.out.println("##PRIORITY 1##");
								System.out.println("Driver's path:");
								System.out.println("***************");
								for(int g=0;g<driverpaths[i].path.length;g++)
								{
									kts.convert(driverpaths[i].path[g]);
									System.out.print("--->");
								}
								f=1;
				}		
							
			}
		}
		if(f==1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
}
class Pathcheck2 extends Drivercselect
{
	public int path(int userstart,int userdest,String dname)
	{
		Keytostring kts=new Keytostring();
		int f=0;
		for(int i=0;i<driverpathcounts;i++)
		{
			if(dname.equals(driverpaths[i].driver))
			{
				
				for(int j=0;j<driverpaths[i].path.length;j++)
				{
					if(userstart==driverpaths[i].path[j])
					{
						
						
								System.out.println("##PRIORITY 3 (YOUR STARTING POINT ");
								kts.convert(userstart);
								System.out.print(" IS FOUND IN THIS RIDE BUT THIS RIDE DOESNT COVER YOUR DESTINATION ");
								System.out.println();
								System.out.println("Driver's path:");
								System.out.println("***************");
								for(int g=0;g<driverpaths[i].path.length;g++)
								{
									kts.convert(driverpaths[i].path[g]);
									System.out.print("--->");
								}
								f=1;
								
							
					}
				}

			}
		}
		if(f==1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	
}
class Pathcheck3 extends Drivercselect
{
	public int path(int userstart,int userdest,String dname)
	{
		Keytostring kts=new Keytostring();
		int f=0;
		for(int i=0;i<driverpathcounts;i++)
		{
			if(dname.equals(driverpaths[i].driver))
			{
				
				for(int j=0;j<driverpaths[i].path.length;j++)
				{
					if(userdest==driverpaths[i].path[j])
					{
						
						
								System.out.println("##PRIORITY 4 (YOUR DESTINATION POINT ");
								kts.convert(userstart);
								System.out.print(" IS FOUND IN THIS RIDE BUT THIS RIDE DOESNT COVER YOUR STARTING POINT");
								System.out.println();
								System.out.println("Driver's path:");
								System.out.println("***************");
								for(int g=0;g<driverpaths[i].path.length;g++)
								{
									kts.convert(driverpaths[i].path[g]);
									System.out.print("--->");
								}
								f=1;
								
							
					}
				}

			}
		}
		if(f==1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	
}
class Pathcheck4 extends Drivercselect
{
	public int path(int userstart,int userdest,String dname)
	{
		Keytostring kts=new Keytostring();
		int f=0;
		for(int i=0;i<driverpathcounts;i++)
		{
			if(dname.equals(driverpaths[i].driver))
			{
				
								System.out.println("##PRIORITY 5##");
								kts.convert(userstart);
								System.out.print("YOUR BOTH SOURCE AND DESTINATION IS NOT FOUND IN THIS RIDE");
								System.out.println();
								System.out.println("Driver's path:");
								System.out.println("***************");
								for(int g=0;g<driverpaths[i].path.length;g++)
								{
									kts.convert(driverpaths[i].path[g]);
									System.out.print("--->");
								}
								f=1;
								
							
					

			}
		}
		if(f==1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
	
}
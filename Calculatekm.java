class Calculatekm extends Drivercselect
{
	int calculate(int userstart,int userdest,String dname)
	{
		int kms=0;
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
							if(userdest!=driverpaths[i].path[k])
							{
								int temp=Calculatekm.distbtw(driverpaths[i].path[k],driverpaths[i].path[k+1]);
								kms=kms+temp;
							}
							else
							{
								break;
							}
						}
					}
				}
			}
		}
		return kms;
	}
	static int distbtw(int a,int b)
	{
		int f=0;
		int[] a1= {0,0,1,2,3,5,5,4,9,9,8,9,8,6,7,10,7,10,10,12,12,12,12,15,15,1,4,2,3,5,6,8,9,10,11,10,5,7,7,10,11,12,14,12,14,13,15,16,16,17};
		int[] b1= {1,4,2,3,5,6,8,9,10,11,10,5,7,7,10,11,12,14,14,13,15,16,16,17,0,0,1,2,3,5,5,4,9,9,8,9,8,6,7,10,7,10,10,12,12,12,12,15,15};
		int[] kms= {100,120,120,110,100,120,120,130,100,120,130,120,140,100,102,120,102,120,120,130,130,120,120,140,150,130,140,130,120,130,100,130,120,140,110,110,140,120,130,100,130,132,120,120,130,130,120,120,120,130};
		for(int i=0;i<a1.length;i++)
		{
	
				if(a==a1[i] && b==b1[i])
				{
					f=kms[i];
					break;
					
					
				}
			
		}
		if(f!=0)
		{
			return f;
		}
		else
		{
			return -1;
		}
		
		
	
	
	}
}
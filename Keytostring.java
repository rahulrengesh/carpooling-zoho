class Keytostring
{
	void convert(int n)
	{
		String[] places= {"Chennai","Kancheepuram","Vellore","Krishanagiri","Chengalpettu","Salem","Coimbatore","Kodaikanal","Namakkal","Cuddalore","Trichy","Tanjavur","Madurai","Tenkasi","Rameshwaram","Thirunelveli","Tuticorin","Kanyakumari"};
		for(int i=0;i<places.length;i++)
		{
			if(i==n)
			{
				System.out.print(places[i]);
			}
		}
	}
}
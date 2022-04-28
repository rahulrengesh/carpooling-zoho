import java.util.*;
public class Marketing extends carpooling{
void advertisement()
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the advertisement to be printed:");
		String temp=sc.nextLine();
		adv=adv+temp;
		adv=adv+"--";
}
}
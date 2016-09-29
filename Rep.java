import java.util.*;
import java.lang.*;
public class Rep
{
	public static void main(String args[])
	{
		String s,st;
		Scanner in = new Scanner(System.in);
		Repeat r=new Repeat();
		System.out.println("Enter string");
		s=in.nextLine();
		boolean ans=r.contain(s);
		if(ans)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
class Repeat
{
	public boolean contain(String a)
	{
		int n=a.length();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(a.charAt(i)=='e')
			{
				count=count+1;
			}
		}
		for(int j=1;j<=3;j++)
		{
			if(count==j)
			{
				return true;
			}
		}
		return false;
	}
}

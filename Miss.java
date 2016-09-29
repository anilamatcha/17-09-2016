import java.util.*;
public class Miss
{
	public static void main(String args[])
	{
		String s2="",s1;
		int n;
		Missing m= new Missing();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string");
		s1=in.nextLine();
		System.out.println("Enter index");
		n = in.nextInt();
		if(n<=s1.length())
		{
			s2=m.missingChar(s1,n);
		}
		System.out.println(s2);
	}
}
class Missing
{
	public String missingChar(String a,int m)
	{
		int p=m-1;
		String str=a.substring(0,p);
		str=str+a.substring(p+1);
		return str;
	}
}

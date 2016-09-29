import java.util.*;
import java.lang.*;
public class Embed
{
	public static void main(String args[])
	{
		String s1,s2;
		Scanner in = new Scanner(System.in);
		Em e =new Em();
		System.out.println("Enter 'even' outer string");
		s1=in.nextLine();
		System.out.println("Enter inner string");
		s2=in.nextLine();
		String str=e.embedWord(s1,s2);
		System.out.println(str);
	}
}
class Em
{
	public String embedWord(String a,String b)
	{
		int n=a.length();
		int p=n/2;
		String l=a.substring(0,p)+b+a.substring(p);
		return l;
	}
}

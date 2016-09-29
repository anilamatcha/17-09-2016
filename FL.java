import java.util.*;
import java.lang.*;
public class FL
{
	public static void main(String args[])
	{
		String s,st;
		BA b=new BA();
		Scanner in= new Scanner(System.in);
		System.out.println("Enter string");
		s=in.nextLine();
		st=b.backAround(s);
		System.out.println(st);
	}
}
class BA
{
	public String backAround(String s)
	{
		String st;
		int n = s.length();
		char p=s.charAt(n-1);
		s=s+p;
		st=p+s;		
		return st;
	}
}
